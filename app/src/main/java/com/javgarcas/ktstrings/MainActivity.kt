package com.javgarcas.ktstrings

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.javgarcas.ktstrings.ui.theme.KtStringsTheme

class MainActivity : ComponentActivity() {
    private val emailValues = listOf("user@domain.com", "wrongemail@domain", "user@domain.xx")
    private val phoneValues = listOf("123","123123123","1231231230")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            KtStringsTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    Column {
                        Greeting("Android")
                        emailValues.forEach {
                            RegexTest(value = it, result = it.isValidEmail().toString())
                        }
                        phoneValues.forEach {
                            RegexTest(value = it, result = it.isValidPhone().toString())
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun RegexTest(value: String, result: String) {
    Row(horizontalArrangement = Arrangement.SpaceBetween, modifier = Modifier.fillMaxWidth()) {
        Text(text = value)
        Text(text = result)
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
            text = "Hello $name!",
            modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    KtStringsTheme {
        Greeting("Android")
    }
}