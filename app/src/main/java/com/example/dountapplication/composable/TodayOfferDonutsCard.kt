package com.example.dountapplication.composable

import android.graphics.fonts.FontStyle
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.zIndex
import com.example.dountapplication.screen.DonutsHomeContent
import com.example.dountapplication.ui.theme.cardCyanColor
import com.example.dountapplication.viewModel.HomeScreenUiState
import com.teckiti.R

@Composable
fun TodayOfferDonutsCard(todayItems: HomeScreenUiState.TodayOffers, onClickDonuts: ()-> Unit) {
    Box(modifier = Modifier.clickable(onClick = onClickDonuts)) {
        Card(modifier = Modifier
            .width(193.dp)
            .height(250.dp),
            colors = CardDefaults.cardColors(cardCyanColor)
        ) {
            Column(
                Modifier
                    .fillMaxSize()
                    .padding(horizontal = 20.dp)
            ) {
                FavouriteDetailsIcon(shape = CircleShape, alignment = Alignment.Start)
                VerticalSpacer(space = 32)
                Subtitle(
                    text = todayItems.todayTitle,
                    )
                VerticalSpacer(space = 8)
                Text(
                    text = todayItems.todayDescription,
                    fontWeight = FontWeight.Light,
                    modifier = Modifier.padding(horizontal = 16.dp)
                )
                VerticalSpacer(space = 8)
                Row(modifier = Modifier.align(Alignment.End)) {
                    Text(
                        text = todayItems.todayOriginalPrice.toString(),
                        modifier = Modifier
                            .align(Alignment.Bottom)
                            .padding(bottom = 4.dp),
                        fontSize = 20.sp,
                        textDecoration = TextDecoration.LineThrough,
                        fontWeight = FontWeight.ExtraLight
                    )
                    HorizontalSpacer(space = 8)
                    androidx.compose.material3.Text(
                        text = todayItems.todayDiscountPrice.toString(),
                        fontSize = 32.sp,
                        fontWeight = FontWeight.SemiBold,
                        fontFamily = FontFamily(Font(R.font.inter_regular)),
                        modifier = Modifier.align(alignment = Alignment.CenterVertically)
                    )
                }

            }
        }
        Box(modifier = Modifier) {
            Image(
                painter = painterResource(todayItems.todayImageResource),
                contentDescription = "donuts",
                modifier = Modifier
                    .size(130.dp)
                    .scale(1f)
                    .offset(x = 115.dp, y = 0.dp)
                    .zIndex(1f),
            )
        }
    }

}
@Composable
@Preview(widthDp = 360, heightDp = 800)
fun PreviewTodayOfferDonutsCard() {
}