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
import androidx.compose.material3.Surface
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
            setContent {
                MaterialTheme {
                    Surface(color = MaterialTheme.colorScheme.background) {
                        CounterScreen()
                    }
                }
            }
        }
    }
}

// https://www.phind.com/search?cache=s3kl4kl8922giemg0zy6b9wo
@Composable
fun CounterScreen(mainViewModel: MainViewModel = viewModel()) {
    // UI that reacts to state changes
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Counter: ${mainViewModel.counterState}")
        Button(modifier = Modifier.width(200.dp),
            onClick = { mainViewModel.incrementCounter() }) {
            Text("Increment")
        }
        Button(modifier = Modifier.width(200.dp),
            onClick = { mainViewModel.decrementCounter() }) {
            Text("Decrement")
        }
        Button(modifier = Modifier.width(200.dp),
            onClick = { mainViewModel.resetCounter() }) {
            Text("Reset")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CounterViewModelExampleTheme {
        CounterScreen()
    }
}