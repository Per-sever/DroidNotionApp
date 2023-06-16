package com.example.droidnotionapp.data.network.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class LastEditedByDTO(
    @SerializedName("object")
    @Expose
    var `object`: String? = null,

    @SerializedName("id")
    @Expose
    var id: String? = null,
)
