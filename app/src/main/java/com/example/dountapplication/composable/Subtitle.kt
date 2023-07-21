package com.example.dountapplication.composable

import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import com.example.pizzaorderapp.R

@Composable
fun Subtitle(text: String) {
    Row() {
        HorizontalSpacer(space = 16)
        Text(
            text = text,
            fontWeight = FontWeight.SemiBold,
            fontFamily = FontFamily(Font(R.font.inter_regular)),
        )
    }
}