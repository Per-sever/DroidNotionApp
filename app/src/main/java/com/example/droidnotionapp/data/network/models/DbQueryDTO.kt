package com.example.droidnotionapp.data.network.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class DbQueryDTO(
    @SerializedName("object")
    @Expose
    var `object`: String? = null,

    @SerializedName("results")
    @Expose
    var results: List<ResultDTO>? = null,

    @SerializedName("next_cursor")
    @Expose
    var nextCursor: Any? = null,

    @SerializedName("has_more")
    @Expose
    var hasMore: Boolean? = null,

    @SerializedName("type")
    @Expose
    var type: String? = null,


    @SerializedName("developer_survey")
    @Expose
    var developerSurvey: String? = null,
)
