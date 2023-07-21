package com.example.dountapplication.viewModel

data class HomeScreenTodayModel(
    val todayTitle: String ,
    val todayDescription: String,
    val todayImageResource: Int,
    val todayDiscountPrice: Int,
    val todayOriginalPrice:Int,
)
data class HomeScreenDonutsModel(
    val donutsImageResource: Int,
    val donutsTitle: String,
    val donutsPrice: Int,
)
