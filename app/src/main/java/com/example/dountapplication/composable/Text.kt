package com.example.dountapplication.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.zIndex
import com.teckiti.R

@Composable
fun Test(){
Column(modifier = Modifier
    .background(Color.White)
    .fillMaxSize()) {
    Spacer(modifier = Modifier.height(100.dp))
    Card(modifier = Modifier
        .size(200.dp)
        .zIndex(1f)) {
        Box(modifier = Modifier.zIndex(1f)) {
            Image(
                painter = painterResource(R.drawable.img2),
                contentDescription = "back",
                modifier = Modifier
                    .offset(x = 105.dp, y = 0.dp)
                    .zIndex(1f)
            )
        }
    }
}
}
@Composable
@Preview(widthDp = 360, heightDp = 800)
fun previewTest(){
    Test()
}