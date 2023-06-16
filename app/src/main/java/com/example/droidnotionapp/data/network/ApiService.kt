package com.example.droidnotionapp.data.network

import com.example.droidnotionapp.data.network.models.DbQueryDTO
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface ApiService {
    @POST("databases/{idDb}/{queryParam}")
    suspend fun getCompetenceList(
        @Path("idDb") id: String = QUERY_PARAM_ID_DB,
        @Path("queryParam") queryParam: String = QUERY_PARAM_CONTAIN_QUERY,
    ): DbQueryDTO

    companion object {
        private const val QUERY_PARAM_ID_DB = "eccd0fbe43114c449155dae7499df2ea"
        private const val QUERY_PARAM_CONTAIN_QUERY = "query"
    }
}