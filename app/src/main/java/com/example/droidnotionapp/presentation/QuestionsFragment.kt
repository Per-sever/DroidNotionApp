package com.example.droidnotionapp.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.droidnotionapp.databinding.FragmentQuestionsBinding
import com.example.droidnotionapp.presentation.adapters.CompetenceListAdapter
import com.github.terrakok.cicerone.Router
import javax.inject.Inject


class QuestionsFragment : Fragment() {


    private var _binding: FragmentQuestionsBinding? = null
    private val binding: FragmentQuestionsBinding
        get() = _binding ?: throw RuntimeException("FragmentQuestions isn't exist")


    private val viewModel: QuestionsListViewModel by viewModels<QuestionsListViewModel>()
    private val adapter = CompetenceListAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = FragmentQuestionsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.rvCompetenceList.layoutManager = LinearLayoutManager(requireActivity())
        binding.rvCompetenceList.adapter = adapter
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}