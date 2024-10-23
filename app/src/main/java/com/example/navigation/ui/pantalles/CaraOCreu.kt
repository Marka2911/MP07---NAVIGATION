package com.example.navigation.ui.pantalles

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Close
import androidx.compose.material.icons.rounded.Face
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kotlin.random.Random

@Composable
fun CaraOCreu(num : Int)
{
    Column (modifier = Modifier
        .fillMaxSize()
        .background(color = MaterialTheme.colorScheme.secondaryContainer)
        .padding(10.dp)
        ,
        horizontalAlignment = Alignment.CenterHorizontally){  }
    if (num == 1) {
        Icon(
            Icons.Rounded.Face,
            contentDescription = null,
            modifier = Modifier
                .fillMaxSize()
        )
    }
    else
    {
        Icon(
            Icons.Rounded.Close,
            contentDescription = null,
            modifier = Modifier
                    .fillMaxSize()
        )
    }
}