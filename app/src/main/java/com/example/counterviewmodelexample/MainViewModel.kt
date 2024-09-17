package com.example.counterviewmodelexample

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {
    var counterState by mutableIntStateOf(0)

    fun incrementCounter() {
        counterState++
    }

    fun decrementCounter() {
        counterState--
    }

    fun resetCounter() {
        counterState = 0
    }
}