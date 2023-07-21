package com.example.dountapplication.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.res.painterResource

@Composable
fun SelectedDonutsImageDetails(imageResourceId: Int) {
    Image(
        painter = painterResource(id = imageResourceId),
        contentDescription = "details",
        modifier = Modifier.scale(1.5f).fillMaxWidth(),
        alignment = Alignment.Center
    )
}