package com.example.droidnotionapp.data.repository

import com.example.droidnotionapp.data.mappers.CompetenceMapper
import com.example.droidnotionapp.data.network.ApiFactory
import com.example.droidnotionapp.data.network.models.QuestionPropertiesDTO
import com.example.droidnotionapp.domain.NotionDbRepository
import com.example.droidnotionapp.domain.models.CompetenceEntity
import javax.inject.Inject

class NotionDbRepositoryImpl @Inject constructor(
    private val mapper: CompetenceMapper,
) : NotionDbRepository {

    override suspend fun loadCompetenceList(): List<CompetenceEntity> {
        val response = ApiFactory.apiService.getCompetenceList()
        return mapper.mapJSONResponseToCompetenceEntityList(response)
    }

    override suspend fun getQuestionsList(idCompetence: String): List<QuestionPropertiesDTO> {
        TODO("Not yet implemented")
    }

    override fun filterCompetenceList(): List<CompetenceEntity> {
        TODO("Not yet implemented")
    }

    override fun getDetailInfoCompetence(id: String) {
        TODO("Not yet implemented")
    }
}