package com.example.droidnotionapp.presentation

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.droidnotionapp.domain.usecases.GetQuestionsList
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class QuestionsListViewModel @Inject constructor(
    private val getQuestionsList: GetQuestionsList,
) : ViewModel() {

    fun getQuestionList(idCompetence: String) {
        viewModelScope.launch {
            val getQuestionList = getQuestionsList.invoke(idCompetence)
            Log.d("CompetenceListViewModel", getQuestionList.toString())
        }
    }
}