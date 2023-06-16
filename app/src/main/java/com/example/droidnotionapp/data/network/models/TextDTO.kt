package com.example.droidnotionapp.data.network.models

import com.google.gson.annotations.Expose

import com.google.gson.annotations.SerializedName


data class TextDTO(
    @SerializedName("content")
    @Expose
    var content: String? = null,

    @SerializedName("link")
    @Expose
    var link: Any? = null,
)