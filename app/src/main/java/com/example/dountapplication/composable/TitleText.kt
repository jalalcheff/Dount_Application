package com.example.dountapplication.composable

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.dountapplication.ui.theme.pink700
import com.example.pizzaorderapp.R

@Composable
fun TitleText(
    text: String,
    fontSize: Int = 42,
    modifier: Modifier = Modifier.padding(start = 16.dp)
    ){
    Text(
        text = text,
        style = TextStyle(
            fontSize = fontSize.sp,
            fontFamily = FontFamily(Font(R.font.inter_regular)),
            fontWeight = FontWeight(700),
            color = pink700,
        ),
        maxLines = 3,
        modifier = modifier
    )
}