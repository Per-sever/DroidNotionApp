package com.example.droidnotionapp.presentation

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.droidnotionapp.databinding.FragmentCompetenceBinding
import com.example.droidnotionapp.presentation.adapters.CompetenceListAdapter
import com.github.terrakok.cicerone.Router
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class CompetenceFragment : Fragment() {

    @Inject
    lateinit var router: Router

    private var _binding: FragmentCompetenceBinding? = null
    private val binding: FragmentCompetenceBinding
        get() = _binding ?: throw RuntimeException("FragmentCompetence isn't exist")

    private val viewModel: CompetenceListViewModel by viewModels<CompetenceListViewModel>()
    private val adapter = CompetenceListAdapter()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = FragmentCompetenceBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.rvCompetenceList.layoutManager = LinearLayoutManager(requireActivity())
        binding.rvCompetenceList.adapter = adapter
        viewModel.load()
        viewModel.listOfCompetence.observe(requireActivity(), Observer {
            Log.d("MainActivity", it.toString())
            adapter.submitList(it)
        })
        adapter.onCompetenceClickListener = {
            viewModel.getQuestionList(it.id)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}