package com.example.droidnotionapp.data.repository

import android.util.Log
import com.example.droidnotionapp.data.mappers.CompetenceMapper
import com.example.droidnotionapp.data.network.ApiFactory
import com.example.droidnotionapp.domain.NotionDbRepository
import com.example.droidnotionapp.domain.models.CompetenceEntity
import javax.inject.Inject

class NotionDbRepositoryImpl @Inject constructor(
    private val mapper: CompetenceMapper,
) : NotionDbRepository {

    override suspend fun loadCompetenceList(): List<CompetenceEntity> {

        val response = ApiFactory.apiService.getCompetenceList()
        val list = mapper.mapJSONResponseToCompetenceEntityList(response)
        Log.d("NotionDbRepositoryImpl", list.toString())
        return list
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