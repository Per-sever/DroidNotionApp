package com.example.droidnotionapp.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.droidnotionapp.domain.usecases.LoadCompetenceList
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CompetenceListViewModel @Inject constructor(
    private val loadCompetenceList: LoadCompetenceList,
) : ViewModel() {
    fun showLog() {
        viewModelScope.launch {
            loadCompetenceList.invoke()
        }
    }
}