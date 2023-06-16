package com.example.droidnotionapp.data.network.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class RelationDTO(
    @SerializedName("id")
    @Expose
    var id: String? = null,
)
