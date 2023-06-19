package com.example.droidnotionapp.data.network.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class QuestionResultDTO(
    @SerializedName("object")
    @Expose
    var `object`: String? = null,

    @SerializedName("id")
    @Expose
    var id: String? = null,

    @SerializedName("created_time")
    @Expose
    var createdTime: String? = null,

    @SerializedName("last_edited_time")
    @Expose
    var lastEditedTime: String? = null,

    @SerializedName("created_by")
    @Expose
    var createdBy: CreatedByDTO? = null,

    @SerializedName("last_edited_by")
    @Expose
    var lastEditedBy: LastEditedByDTO? = null,

    @SerializedName("cover")
    @Expose
    var cover: Any? = null,

    @SerializedName("icon")
    @Expose
    var icon: Any? = null,

    @SerializedName("parent")
    @Expose
    var parent: ParentDTO? = null,

    @SerializedName("archived")
    @Expose
    var archived: Boolean? = null,

    @SerializedName("properties")
    @Expose
    var properties: QuestionPropertiesDTO? = null,

    @SerializedName("url")
    @Expose
    var url: String? = null,

    @SerializedName("public_url")
    @Expose
    var publicUrl: String? = null,
)