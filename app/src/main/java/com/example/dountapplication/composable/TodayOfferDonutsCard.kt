package com.example.dountapplication.composable

import android.graphics.fonts.FontStyle
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
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
import com.example.dountapplication.screen.DonutsHomeContent
import com.example.dountapplication.ui.theme.cardCyanColor
import com.teckiti.R

@Composable
fun TodayOfferDonutsCard() {
    Card(modifier = Modifier
        .width(193.dp)
        .height(325.dp).padding(horizontal = 16.dp),
        colors = CardDefaults.cardColors(cardCyanColor)
        ) {
        Column(Modifier.fillMaxSize()) {
            FavouriteDetailsIcon(shape = CircleShape, alignment = Alignment.Start)
            Image(
                painter = painterResource(id = R.drawable.image7),
                contentDescription = "donuts",
                modifier = Modifier
                    .size(137.dp)
                    .scale(1.3f)
                    .align(Alignment.End),
                )
            VerticalSpacer(space = 16)
            Subtitle(text = "Chocolate Glaze")
            VerticalSpacer(space = 8)
            Text(
                text = stringResource(R.string.moist_and_fluffy_baked),
                fontWeight = FontWeight.Light
                )
            VerticalSpacer(space = 8)
            Row() {
                Text(
                    text = "$20",
                    modifier = Modifier
                        .align(Alignment.Bottom)
                        .padding(bottom = 4.dp),
                    fontSize = 20.sp,
                    textDecoration = TextDecoration.LineThrough,
                    fontWeight = FontWeight.ExtraLight
                    )
                HorizontalSpacer(space = 8)
            androidx.compose.material3.Text(
                text = "$16",
                fontSize = 32.sp,
                fontWeight = FontWeight.SemiBold,
                fontFamily = FontFamily(Font(R.font.inter_regular)),
                modifier = Modifier.align(alignment = Alignment.CenterVertically)
            )
            }

        }
    }
}
@Composable
@Preview(widthDp = 360, heightDp = 800)
fun PreviewTodayOfferDonutsCard() {
    TodayOfferDonutsCard()
}