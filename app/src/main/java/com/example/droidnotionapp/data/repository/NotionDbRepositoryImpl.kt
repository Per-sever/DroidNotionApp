package com.example.droidnotionapp.data.repository

import android.util.Log
import com.example.droidnotionapp.data.network.ApiFactory
import com.example.droidnotionapp.domain.NotionDbRepository
import com.example.droidnotionapp.domain.models.CompetenceEntity
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

class NotionDbRepositoryImpl @Inject constructor() : NotionDbRepository {

    override fun loadCompetenceList() {
        CoroutineScope(Dispatchers.IO).launch {
            val result = ApiFactory.apiService.getCompetenceList()
            result.results?.map {
                it.properties?.name?.title?.map {
                    Log.d(
                        "Hello",
                        it.text?.content.toString()
                    )
                }
            }
        }

    }

    override fun getCompetenceList(): List<CompetenceEntity> {
        TODO("Not yet implemented")
    }

    override fun filterCompetenceList(): List<CompetenceEntity> {
        TODO("Not yet implemented")
    }

    override fun getDetailInfoCompetence(id: String) {
        TODO("Not yet implemented")
    }
}