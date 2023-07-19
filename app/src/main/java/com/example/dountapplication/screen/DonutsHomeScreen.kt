package com.example.dountapplication.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.dountapplication.composable.SearchRow
import com.example.dountapplication.composable.Subtitle
import com.example.dountapplication.composable.TodayOfferDonutsCard
import com.example.dountapplication.composable.VerticalSpacer
import com.teckiti.R

@Composable
fun DonutsHomeScreen() {

}

@Composable
fun DonutsHomeContent() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(16.dp)
    ) {
        SearchRow()
        VerticalSpacer(space = 54)
        Subtitle("Today Offers")
        VerticalSpacer(space = 25)
        LazyRow(contentPadding = PaddingValues(4.dp)){
            item {
                TodayOfferDonutsCard()
                TodayOfferDonutsCard()
            }
        }
    }
}




@Composable
@Preview(widthDp = 360, heightDp = 800)
fun PreviewDonutsHomeContent() {
    DonutsHomeContent()
}