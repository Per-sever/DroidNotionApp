package com.example.droidnotionapp.presentation

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.droidnotionapp.domain.models.CompetenceEntity
import com.example.droidnotionapp.domain.usecases.GetQuestionsList
import com.example.droidnotionapp.domain.usecases.LoadCompetenceList
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CompetenceListViewModel @Inject constructor(
    private val loadCompetenceList: LoadCompetenceList,
    private val getQuestionsList: GetQuestionsList,
) : ViewModel() {

    private val _listOfCompetence = MutableLiveData<List<CompetenceEntity>>()
    val listOfCompetence: LiveData<List<CompetenceEntity>>
        get() = _listOfCompetence


    fun load() {
        viewModelScope.launch {
            _listOfCompetence.postValue(loadCompetenceList.invoke())
        }
    }

    fun getQuestionList(idCompetence: String) {
        viewModelScope.launch {
            val getQuestionList = getQuestionsList.invoke(idCompetence)
            Log.d("CompetenceListViewModel", getQuestionList.toString())
        }
    }


}