package com.example.dountapplication.composable

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.res.painterResource
import com.teckiti.R

@Composable
fun SelectedDonutsImageDetails(imageResourceId: Int) {
    Image(
        painter = painterResource(id = imageResourceId),
        contentDescription = "details",
        modifier = Modifier.scale(1.5f)
    )
}