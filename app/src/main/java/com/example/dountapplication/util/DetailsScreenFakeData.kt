package com.example.dountapplication.util

import com.example.dountapplication.viewModel.DetailsScreenModel
import com.example.dountapplication.viewModel.HomeScreenDonutsModel
import com.example.dountapplication.viewModel.HomeScreenTodayModel
import com.example.pizzaorderapp.R

object DetailsScreenFakeData {
    val detailsDonuts =
        DetailsScreenModel(
            title = "Strawberry",
            description = "These Baked Strawberry Donuts are filled with fresh strawberries...",
            imageResource = R.drawable.today_image2,
            price = 16,
            quantity = 1
        )
}