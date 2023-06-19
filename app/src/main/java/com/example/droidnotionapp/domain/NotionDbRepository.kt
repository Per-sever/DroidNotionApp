package com.example.droidnotionapp.domain

import com.example.droidnotionapp.data.network.models.QuestionPropertiesDTO
import com.example.droidnotionapp.domain.models.CompetenceEntity

interface NotionDbRepository {

    suspend fun loadCompetenceList(): List<CompetenceEntity>

    suspend fun getQuestionsList(idCompetence: String): List<QuestionPropertiesDTO>

    fun filterCompetenceList(): List<CompetenceEntity>

    fun getDetailInfoCompetence(id: String)
}