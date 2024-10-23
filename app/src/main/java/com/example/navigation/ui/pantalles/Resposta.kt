package com.example.navigation.ui.pantalles

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlin.random.Random

@Composable
fun Resposta(pregunta : String){
    val respostes : List<String> = listOf("si", "no", "pot ser", "impossible", "estas boig", "tota la rao", "360noScope")
    Column(modifier = Modifier
        .fillMaxSize()
        .background(color = MaterialTheme.colorScheme.secondaryContainer),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {
        Text(text = pregunta,
            modifier = Modifier
            ,
            fontSize = 30.sp)
        Spacer(modifier = Modifier.height(50.dp))
        val respostaDefinitiva = respostes.random()
        Text(text = respostaDefinitiva,
            modifier = Modifier
            ,
            fontSize = 30.sp)
    }
}