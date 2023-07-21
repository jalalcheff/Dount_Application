package com.example.dountapplication.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.ui.Alignment
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.dountapplication.ui.theme.pink500
import androidx.compose.foundation.layout.offset
import androidx.compose.material3.CardDefaults
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.zIndex
import com.example.dountapplication.ui.theme.pink700
import com.teckiti.R


@Composable
fun FavouriteDetailsIcon(
    modifier: Modifier = Modifier,
    cardColor: Color = Color.White,
    shape: Shape = CardDefaults.shape,
    alignment: Alignment.Horizontal = Alignment.End,
    imageResourceId: Int = R.drawable.baseline_favorite_border_24
) {
    Column(modifier = modifier.fillMaxWidth()) {
        Card(
            modifier = Modifier
                .offset(x = 0.dp, y = 18.dp)
                .padding(end = 12.dp)
                .align(alignment = alignment),
            colors = CardDefaults.cardColors(containerColor = cardColor),
            shape = shape
        ) {
            Image(
                painter = painterResource(id = imageResourceId),
                contentDescription = "fav",
                modifier = Modifier
                    .padding(8.dp)
                    .size(24.dp),
                colorFilter = ColorFilter.tint(pink700),
            )
        }
    }
}