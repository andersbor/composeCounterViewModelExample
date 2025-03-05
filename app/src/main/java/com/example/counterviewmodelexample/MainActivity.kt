package com.example.counterviewmodelexample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.counterviewmodelexample.ui.theme.CounterViewModelExampleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Scaffold { innerPadding ->
                    CounterScreen(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun CounterScreen(
    modifier: Modifier = Modifier,
    counterViewModel: CounterViewModel = viewModel()
) {
    // add to gradle file
    // https://developer.android.com/develop/ui/compose/libraries#viewmodel

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Counter: ${counterViewModel.counterState}")
        Button(
            modifier = Modifier.width(200.dp),
            onClick = { counterViewModel.incrementCounter() }) {
            Text("Increment")
        }
        Button(
            modifier = Modifier.width(200.dp),
            onClick = { counterViewModel.decrementCounter() }) {
            Text("Decrement")
        }
        Button(modifier = Modifier.width(200.dp), onClick = { counterViewModel.resetCounter() }) {
            Text("Reset")
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun GreetingPreview() {
    CounterViewModelExampleTheme {
        CounterScreen()
    }
}