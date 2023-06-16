package com.example.droidnotionapp.data.network.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class StatusDTO(
    @SerializedName("id")
    @Expose
    var id: String? = null,

    @SerializedName("type")
    @Expose
    var type: String? = null,

    @SerializedName("status")
    @Expose
    var status: StatusTypeDTO? = null,
)