package com.example.navigation.ui.pantalles

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import kotlin.random.Random

@Composable
fun Home(onCaraCreuClick: (Int) -> Unit, onNumeroClick: () -> Unit, onOracleClick: () -> Unit)
{
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = MaterialTheme.colorScheme.secondaryContainer)
            .padding(24.dp),
        verticalArrangement = Arrangement.Center
    ) {
            Button(onClick = {
                val resultat = Random.nextInt(1,3)
                (onCaraCreuClick(resultat))

            }) {
                Text(
                    text = "Cara o creu", Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center,
                    style = MaterialTheme.typography.headlineLarge
                )
            }
            Spacer(modifier = Modifier.height(50.dp))
        Button(onClick = {
            (onNumeroClick())
        }) {
            Text(
                text = "Nombre random", Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center,
                style = MaterialTheme.typography.headlineLarge
            )
        }
        Spacer(modifier = Modifier.height(50.dp))
        Button(
            onClick = {
                (onOracleClick())
            }) {
            Text(
                text = "Oracle", Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center,
                style = MaterialTheme.typography.headlineLarge
            )
        }
    }
}