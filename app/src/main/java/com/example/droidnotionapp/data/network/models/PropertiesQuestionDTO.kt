package com.example.droidnotionapp.data.network.models

import android.icu.text.CaseMap.Title


data class PropertiesQuestionDTO(
    var status: StatusDTO? = null,
    var category: CategoryDTO? = null,
    var type: QuestionsDTO? = null,
    var source: QuestionSourceDTO? = null,
    var date: QuestionDateDTO? = null,
    var createdTime: QuestionCreatedTimeDTO? = null,
    var title: Title? = null,
)