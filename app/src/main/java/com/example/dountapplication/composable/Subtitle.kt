package com.example.dountapplication.composable

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import com.teckiti.R

@Composable
fun Subtitle(text: String) {
    Text(
        text = text,
        fontWeight = FontWeight.SemiBold,
        fontFamily = FontFamily(Font(R.font.inter_regular)),
    )
}