package com.example.droidnotionapp.presentation

import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.droidnotionapp.R
import com.example.droidnotionapp.databinding.ActivityMainBinding
import com.example.droidnotionapp.presentation.adapters.CompetenceListAdapter
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val viewModel: CompetenceListViewModel by viewModels<CompetenceListViewModel>()
    private val adapter = CompetenceListAdapter()

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.rvCompetenceList.layoutManager = LinearLayoutManager(this)
        binding.rvCompetenceList.adapter = adapter
        viewModel.load()
        viewModel.listOfCompetence.observe(this, Observer {
            Log.d("MainActivity", it.toString())
            adapter.submitList(it)
        })
    }
}