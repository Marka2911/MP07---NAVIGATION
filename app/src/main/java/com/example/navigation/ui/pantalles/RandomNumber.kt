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
import androidx.compose.material3.RangeSlider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun RandomNumber(onRandomNumber: (Int, Int) -> Unit ) {
    var sliderPosition by remember { mutableStateOf(0f..100f) }
    Column(modifier = Modifier
        .fillMaxSize()
        .background(color = MaterialTheme.colorScheme.secondaryContainer)
        .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        var min = 0
        var max = 100
        RangeSlider(
            value = sliderPosition,
            steps = 100,
            onValueChange = {
                range -> sliderPosition = range},
            valueRange = 0f..100f,
        )
        Text(text = "${sliderPosition.start.toInt()}\t\t\t\t\t\t${sliderPosition.endInclusive.toInt()}",
            style = MaterialTheme.typography.headlineSmall)

        Spacer(modifier = Modifier
            .height(20.dp))
        Button(onClick = {
            min = sliderPosition.start.toInt()
            max = sliderPosition.endInclusive.toInt()
            onRandomNumber(min, max)},
            modifier = Modifier
                .fillMaxWidth()) {
            Text(text ="Sorteja!",
                style = MaterialTheme.typography.headlineMedium)
        }
    }
}