package com.example.droidnotionapp.data.network.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import org.w3c.dom.Text


data class TitleDTO(
    @SerializedName("type")
    @Expose
    var type: String? = null,

    @SerializedName("text")
    @Expose
    var text: TextDTO? = null,


    @SerializedName("plain_text")
    @Expose
    var plainText: String? = null,

    @SerializedName("href")
    @Expose
    var href: Any? = null,
)