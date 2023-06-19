package com.example.droidnotionapp.presentation

import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.example.droidnotionapp.data.network.ApiFactory
import com.example.droidnotionapp.data.network.Filter
import com.example.droidnotionapp.data.network.Relation
import com.example.droidnotionapp.data.network.RequestBody
import com.example.droidnotionapp.databinding.ActivityMainBinding
import com.example.droidnotionapp.presentation.adapters.CompetenceListAdapter
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

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
        val relation = Relation("1d06cfd8-111c-4442-92e4-6d0e5e9151d1")
        val filter = Filter("Type", relation)
        val requestBody = RequestBody(filter)
        CoroutineScope(Dispatchers.IO).launch {
            val res = ApiFactory.apiService.getQuestionsList(requestBody = requestBody)
//            Log.d("MainActivity", res.toString())
            var hey = res.results?.map { it.properties?.title }
            val res2 = hey?.get(0)?.title?.get(0)?.text?.content
            Log.d("MainActivity", res2.toString())
        }
    }


//        binding.rvCompetenceList.layoutManager = LinearLayoutManager(this)
//        binding.rvCompetenceList.adapter = adapter
//        viewModel.load()
//        viewModel.listOfCompetence.observe(this, Observer {
//            Log.d("MainActivity", it.toString())
//            adapter.submitList(it)
//        })
}
