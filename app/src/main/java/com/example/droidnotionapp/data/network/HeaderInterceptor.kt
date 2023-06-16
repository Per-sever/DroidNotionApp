package com.example.droidnotionapp.data.network

import okhttp3.Interceptor
import okhttp3.Response

class HeaderInterceptor : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val originalRequest = chain.request();
        val modifiedRequest = originalRequest.newBuilder()
            .addHeader("Authorization", HEADER_AUTH_VALUE)
            .addHeader("Notion-Version", HEADER_NOTION_VERSION_VALUE)
            .build()
        return chain.proceed(modifiedRequest)
    }

    companion object {
        private const val HEADER_AUTH_VALUE = "Bearer " +
                "secret_QXWJQjJ1z2n71TL59qgg54ZhN6wyqaIimUcUAAvAgAw"
        private const val HEADER_NOTION_VERSION_VALUE = "2022-06-28"
    }
}