package com.example.droidnotionapp.data.network.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


data class QuestionPropertiesDTO(
    @SerializedName("Status")
    @Expose
    var status: StatusDTO? = null,
    @SerializedName("category")
    @Expose
    var category: CategoryDTO? = null,
    @SerializedName("Type")
    @Expose
    var type: QuestionsDTO? = null,
    @SerializedName("Source")
    @Expose
    var source: QuestionSourceDTO? = null,
    @SerializedName("Date")
    @Expose
    var date: QuestionDateDTO? = null,
    @SerializedName("Created time")
    @Expose
    var createdTime: QuestionCreatedTimeDTO? = null,
    @SerializedName("Title")
    @Expose
    var title: QuestionTitleDb? = null,
)