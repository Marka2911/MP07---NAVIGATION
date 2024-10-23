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
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun Oracle(onFrmSendClick : (String) -> Unit = {}){

    var pregunta = remember { mutableStateOf("")}
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = MaterialTheme.colorScheme.primaryContainer)
            .padding(20.dp),
        verticalArrangement = Arrangement.Center,

    ){
        Text(text = "Pregunta", fontSize = 30.sp)
        TextField(
            onValueChange = {value ->
                pregunta.value = value},
            value = pregunta.value,
            modifier = Modifier
                .fillMaxWidth())
        Spacer(modifier = Modifier
            .height(30.dp))
        Button(onClick = {onFrmSendClick(pregunta.value)},
            modifier = Modifier
                .fillMaxWidth()) {
            Text("Respon", style = MaterialTheme.typography.headlineMedium)
        }
    }
}