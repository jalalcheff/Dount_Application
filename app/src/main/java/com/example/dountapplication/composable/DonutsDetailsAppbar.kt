package com.example.dountapplication.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.dountapplication.ui.theme.pink700

@Composable
fun DonutsDetailsAppbar(imageResourceId: Int, onClickBack: () -> Unit) {
    Image(
        painter = painterResource(id = imageResourceId),
        contentDescription = "back",
        modifier = Modifier
            .padding(top = 45.dp, start = 32.dp)
            .size(30.dp).clickable(onClick = onClickBack)
        ,
        colorFilter = ColorFilter.tint(pink700)
    )
}