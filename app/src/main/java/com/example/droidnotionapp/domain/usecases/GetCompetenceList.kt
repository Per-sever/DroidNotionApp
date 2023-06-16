package com.example.droidnotionapp.domain.usecases

import com.example.droidnotionapp.domain.NotionDbRepository
import javax.inject.Inject

class GetCompetenceList @Inject constructor(private val repository: NotionDbRepository) {
    operator fun invoke() = repository.getCompetenceList()
}