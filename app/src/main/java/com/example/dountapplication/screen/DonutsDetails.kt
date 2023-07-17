package com.example.dountapplication.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.dountapplication.composable.BottomSheet
import com.example.dountapplication.ui.theme.backgroundPink
import com.example.dountapplication.ui.theme.pink700
import com.teckiti.R

@Composable
fun DonutsDetails(){
    Column(modifier = Modifier
        .fillMaxSize()
        .background(backgroundPink)) {
        Image(
            painter = painterResource(id = R.drawable.baseline_arrow_back_ios_24),
            contentDescription = "back",
            modifier = Modifier
                .padding(top = 45.dp, start = 32.dp)
                .size(30.dp),
            colorFilter = ColorFilter.tint(pink700)
            )
        Spacer(modifier = Modifier.height(16.dp))
        Image(
            painter = painterResource(id = R.drawable.img2),
            contentDescription = "details",
            modifier = Modifier.scale(1.5f)
        )
        Spacer(modifier = Modifier.height(16.dp))
        Column(
            modifier = Modifier.clip(RoundedCornerShape(topStart = 36.dp, topEnd = 36.dp))
        ) {
            BottomSheet()
        }

    }
}
@Composable
@Preview
fun PreviewDonuts(){
    DonutsDetails()
}