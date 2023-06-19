package com.example.droidnotionapp.data.mappers

import com.example.droidnotionapp.data.network.models.DbQueryDTO
import com.example.droidnotionapp.domain.models.CompetenceEntity
import javax.inject.Inject

class CompetenceMapper @Inject constructor() {
     fun mapJSONResponseToCompetenceEntityList(result: DbQueryDTO):
            List<CompetenceEntity> {
        val competenceEntityList = mutableListOf<CompetenceEntity>()
        result.results?.map {
            val idCompetence = it.id
            it.properties?.name?.title?.map {
                competenceEntityList.add(
                    CompetenceEntity(
                        it.text?.content.toString(), idCompetence
                            .toString()
                    )
                )
            }
        }
        return competenceEntityList
    }
}