package com.example.droidnotionapp.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.droidnotionapp.domain.models.CompetenceEntity
import com.example.droidnotionapp.domain.usecases.LoadCompetenceList
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CompetenceListViewModel @Inject constructor(
    private val loadCompetenceList: LoadCompetenceList,
) : ViewModel() {

    private val _listOfCompetence = MutableLiveData<List<CompetenceEntity>>()
    val listOfCompetence: LiveData<List<CompetenceEntity>>
        get() = _listOfCompetence

    //    fun loadCompetence() {

   fun load() {
       viewModelScope.launch {
           _listOfCompetence.postValue( loadCompetenceList.invoke())
       }
    }
//    }
}