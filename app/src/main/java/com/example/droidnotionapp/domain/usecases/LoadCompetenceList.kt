package com.example.droidnotionapp.domain.usecases

import com.example.droidnotionapp.domain.NotionDbRepository
import javax.inject.Inject

class LoadCompetenceList @Inject constructor(private val repository: NotionDbRepository) {
    suspend operator fun invoke() = repository.loadCompetenceList()
}