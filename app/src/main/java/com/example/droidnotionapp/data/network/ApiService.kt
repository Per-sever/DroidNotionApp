package com.example.droidnotionapp.data.network

import com.example.droidnotionapp.data.network.models.CompetenceDbQueryDTO
import com.example.droidnotionapp.data.network.models.QuestionsDbQueryDTO
import retrofit2.http.Body
import retrofit2.http.POST
import retrofit2.http.Path

interface ApiService {
    @POST("databases/{idDb}/{queryParam}")
    suspend fun getCompetenceList(
        @Path("idDb") id: String = QUERY_PARAM_ID_COMPETENCE_DB,
        @Path("queryParam") queryParam: String = QUERY_PARAM_CONTAIN_QUERY,
    ): CompetenceDbQueryDTO

    @POST("databases/{idDb}/{queryParam}")
    suspend fun getQuestionsList(
        @Path("idDb") id: String = QUERY_PARAM_ID_QUESTIONS_DB,
        @Path("queryParam") queryParam: String = QUERY_PARAM_CONTAIN_QUERY,
        @Body requestBody: RequestBody,
    ): QuestionsDbQueryDTO

    companion object {
        private const val QUERY_PARAM_ID_COMPETENCE_DB = "eccd0fbe43114c449155dae7499df2ea"
        private const val QUERY_PARAM_CONTAIN_QUERY = "query"
        private const val QUERY_PARAM_ID_QUESTIONS_DB = "632c027d7a2a4c56b186939d603450f9"
    }
}