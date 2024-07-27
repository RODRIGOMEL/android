package com.example.formulario

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.TextField
import androidx.compose.ui.unit.dp
import com.example.formulario.ui.theme.FormularioTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FormularioTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    formulario(
                        modifier = Modifier.padding(innerPadding),
                        nome = "",
                        endereco = "",
                        telefone = 0,
                        cidade = "",
                    )
                }
            }
        }
    }
}



@Composable
fun formulario(modifier: Modifier = Modifier, nome: String, endereco: String, telefone: Int, cidade: String) {
    Column(
        Modifier
            .background(Color.Black)
    ) {
        Row (
            Modifier
                .padding(20.dp)
        ){

        }
        Row(
            Modifier
                .fillMaxWidth(),
            Arrangement.Center
        ) {
            Text (
                text =  "App Database",
                fontFamily = FontFamily.Serif,
                fontWeight = FontWeight.Bold,
                fontSize = 30.dp
            )
        }
        Row(
            Modifier
                .padding(20.dp)
        ) {

        }
        Row(
            Modifier
                .fillMaxWidth(),
            Arrangement.Center
        ) {
            TextField(
                value = nome,
                onValueChange = {nome = it},
                label = { Text("Nome:")}
            )
        }
        Row(
            Modifier
                .fillMaxWidth(),
            Arrangement.Center
        ) {
            TextField(
                value = endereco,
                onValueChange = {endereco = it},
                label = { Text("Endereço:")}
            )
        }
        Row(
            Modifier
                .fillMaxWidth(),
            Arrangement.Center
        ) {
            TextField(
                value = telefone,
                onValueChange = {telefone = it},
                label = { Text("Telefone:")}
            )
        }
        Row(
            Modifier
                .fillMaxWidth(),
            Arrangement.Center
        ) {
            TextField(
                value = cidade,
                onValueChange = {cidade = it},
                label = { Text("Cidade:")}
            )
        }




    }

}


























