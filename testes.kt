package com.example.testes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.testes.ui.theme.TestesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TestesTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Mensagem(
                        name = "Rodrigo",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

    @Composable
    fun Mensagem(name: String, modifier: Modifier = Modifier) {

        val msg: String = "voce recebeu uma mensagem de $name!"

        Text(
            text = msg,
            modifier = modifier
        )
    }

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TestesTheme {
        Mensagem("Rodrigo")
    }
}