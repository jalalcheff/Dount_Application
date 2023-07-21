package com.example.dountapplication.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.zIndex
import com.example.dountapplication.composable.BottomSheet
import com.example.dountapplication.composable.DonutsDetailsAppbar
import com.example.dountapplication.composable.FavouriteDetailsIcon
import com.example.dountapplication.composable.SelectedDonutsImageDetails
import com.example.dountapplication.composable.VerticalSpacer
import com.example.dountapplication.ui.theme.backgroundPink
import com.example.pizzaorderapp.R

@Composable
fun DonutsDetails(){
    Column(modifier = Modifier
        .fillMaxSize()
        .background(backgroundPink)) {
        DonutsDetailsAppbar(imageResourceId = R.drawable.baseline_arrow_back_ios_24)
        VerticalSpacer(16)
        SelectedDonutsImageDetails(imageResourceId = R.drawable.img2)
        VerticalSpacer(space = 16)
        Column(
            modifier = Modifier
                .clip(RoundedCornerShape(topStart = 36.dp, topEnd = 36.dp))
                .fillMaxWidth()
        ) {
            FavouriteDetailsIcon(modifier = Modifier.zIndex(1f))
            BottomSheet()
        }

    }
}
@Composable
@Preview
fun PreviewDonuts(){
    DonutsDetails()
}