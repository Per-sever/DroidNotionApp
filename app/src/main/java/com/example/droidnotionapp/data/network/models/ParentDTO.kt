package com.example.droidnotionapp.data.network.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class ParentDTO(
    @SerializedName("type")
    @Expose
    var type: String? = null,

    @SerializedName("database_id")
    @Expose
    var databaseId: String? = null,
)