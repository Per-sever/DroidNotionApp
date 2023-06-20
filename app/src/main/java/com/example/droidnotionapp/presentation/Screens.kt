package com.example.droidnotionapp.presentation

import com.github.terrakok.cicerone.androidx.FragmentScreen


object Screens {
    fun mainScreen() = FragmentScreen { CompetenceFragment() }
    fun questionsScreen() = FragmentScreen { QuestionsFragment() }
}