package com.example.droidnotionapp.domain

import androidx.lifecycle.LiveData
import com.example.droidnotionapp.domain.models.CompetenceEntity

interface NotionDbRepository {

   suspend fun loadCompetenceList(): List<CompetenceEntity>

    fun getCompetenceList(): List<CompetenceEntity>

    fun filterCompetenceList(): List<CompetenceEntity>

    fun getDetailInfoCompetence(id: String)
}