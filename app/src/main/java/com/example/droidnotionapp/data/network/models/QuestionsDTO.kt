package com.example.droidnotionapp.data.network.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class QuestionsDTO(
    @SerializedName("id")
    @Expose
    var id: String? = null,

    @SerializedName("type")
    @Expose
    var type: String? = null,

    @SerializedName("relation")
    @Expose
    var relation: List<RelationDTO>? = null,

    @SerializedName("has_more")
    @Expose
    var hasMore: Boolean? = null,
)