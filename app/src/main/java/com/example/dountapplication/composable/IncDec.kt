package com.example.dountapplication.composable

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun IncDec(
    text: String,
    textColor:Color = Color.Black,
    cardColors: CardColors = CardDefaults.cardColors(Color.White),
    onClick:(String)->Unit
    ){
    Card(
        modifier = Modifier
            .size(45.dp)
            .clickable {onClick(text)},
        colors = cardColors,

    ) {
        Text(
            text = text,
            textAlign = TextAlign.Center,
            color = textColor,
            fontSize = 32.sp,
            modifier = Modifier.fillMaxWidth(),
        )
    }
    HorizontalSpacer(space = 12)
}