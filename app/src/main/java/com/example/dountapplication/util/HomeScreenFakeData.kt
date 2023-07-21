package com.example.dountapplication.util

import com.example.dountapplication.viewModel.HomeScreenDonutsModel
import com.example.dountapplication.viewModel.HomeScreenTodayModel
import com.teckiti.R

object HomeScreenFakeData {
    val listOfHomeScreenTodayFakeData = listOf(
        HomeScreenTodayModel(
            todayTitle = "Strawberry",
            todayDescription = "These Baked Strawberry Donuts are filled with fresh strawberries...",
            todayImageResource = R.drawable.today_image1,
            todayDiscountPrice = 16,
            todayOriginalPrice = 20,
        ),
        HomeScreenTodayModel(
            todayTitle = "Chocolate",
            todayDescription = "Moist and fluffy baked chocolate donuts full of chocolate flavor.",
            todayImageResource = R.drawable.today_image2,
            todayDiscountPrice = 16,
            todayOriginalPrice = 20,
        )
    )
    val listOfHomeScreenDonutsFakeData = listOf(
        HomeScreenDonutsModel(
            donutsImageResource = R.drawable.home_donuts1,
            donutsTitle = "Chocolate Cherry",
            donutsPrice = 10,

        ),
        HomeScreenDonutsModel(
            donutsImageResource = R.drawable.home_donuts2,
            donutsTitle = "Strawberry Rain",
            donutsPrice = 9,
        ),
        HomeScreenDonutsModel(
            donutsImageResource = R.drawable.home_donuts3,
            donutsTitle = "Strawberry Coco",
            donutsPrice = 12,
            ),
    )
}