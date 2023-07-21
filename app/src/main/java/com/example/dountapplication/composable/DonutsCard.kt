package com.example.dountapplication.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.zIndex
import com.example.dountapplication.viewModel.HomeScreenUiState

@Composable
fun DonutsCard(donuts: HomeScreenUiState.Donuts) {
    Box(Modifier.padding(top = 20.dp)) {
        Card(
            shape = RoundedCornerShape(topStart = 16.dp, topEnd = 16.dp),
            modifier = Modifier
                .width(138.dp)
                .height(111.dp)
                .padding(horizontal = 8.dp)
        ) {
            VerticalSpacer(space = 42)
                Subtitle(text = donuts.donutsTitle)
                Text(
                    text = donuts.donutsPrice.toString(),
                    modifier = Modifier
                        .padding(bottom = 4.dp)
                        .fillMaxWidth(),
                    fontSize = 20.sp,
                    fontWeight = FontWeight.ExtraLight,
                    textAlign = TextAlign.Center
                )
        }
        Box(
            modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.TopStart) {
            Image(
                painter = painterResource(id = donuts.donutsImageResource),
                contentDescription = "image",
                modifier = Modifier
                    .size(80.dp)
                    .scale(1f)
                    .zIndex(1f)
                    .offset(x = 24.dp, y = (-34).dp)
            )
        }
    }


}

@Composable
@Preview(widthDp = 360, heightDp = 800)
fun PreviewDonutsCard() {
}