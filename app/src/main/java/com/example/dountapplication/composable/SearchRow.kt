package com.example.dountapplication.composable

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.example.dountapplication.ui.theme.backgroundPink
import com.teckiti.R


@Composable
fun SearchRow() {
    Row (){
        HorizontalSpacer(space = 16)
        Column() {
            TitleText(text = "Let's Gonuts", fontSize = 24)
            Text(
                text = "Order your favourite donuts from here",
                fontWeight = FontWeight(500)
            )
        }
        FavouriteDetailsIcon(cardColor = backgroundPink, imageResourceId = R.drawable.baseline_search_24)
    }
}
@Composable
@Preview(widthDp = 360, heightDp = 800)
fun PreviewSearchRow(){
    SearchRow()
}