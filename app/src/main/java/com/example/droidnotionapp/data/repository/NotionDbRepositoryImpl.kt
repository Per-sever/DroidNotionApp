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
        val resultMap = mutableMapOf<String, String>()
        CoroutineScope(Dispatchers.IO).launch {
            val result = ApiFactory.apiService.getCompetenceList()
            result.results?.map {
                val idCompetence = it.id
                it.properties?.name?.title?.map {
                    resultMap.put(idCompetence.toString(), it.text?.content.toString())
                }
            }
            Log.d("Hello", resultMap.toString())
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