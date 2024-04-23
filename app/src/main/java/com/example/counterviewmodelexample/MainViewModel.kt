package com.example.counterviewmodelexample

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {
    // MutableState to handle our UI state
    // TODO by??
    var counterState by mutableIntStateOf(0)

    // Function to increment the counter
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