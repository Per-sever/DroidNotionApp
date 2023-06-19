package com.example.droidnotionapp.data.network

data class Filter(val property: String, val relation: Relation)
data class Relation(val contains: String)
data class RequestBody(val filter: Filter)