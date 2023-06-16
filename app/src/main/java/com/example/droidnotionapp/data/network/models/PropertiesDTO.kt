package com.example.droidnotionapp.data.network.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class PropertiesDTO(
    @SerializedName("projects")
    @Expose
    var projects: ProjectsDTO? = null,

    @SerializedName("Status")
    @Expose
    var status: StatusDTO? = null,

    @SerializedName("Questions")
    @Expose
    var questions: QuestionsDTO? = null,

    @SerializedName("Name")
    @Expose
    var name: NameDTO? = null,
)