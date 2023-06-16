package com.example.droidnotionapp.domain

import com.example.droidnotionapp.domain.models.CompetenceEntity

interface NotionDbRepository {

    fun loadCompetenceList()

    fun getCompetenceList(): List<CompetenceEntity>

    fun filterCompetenceList(): List<CompetenceEntity>

    fun getDetailInfoCompetence(id: String)
}