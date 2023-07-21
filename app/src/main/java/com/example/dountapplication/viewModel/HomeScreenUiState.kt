package com.example.dountapplication.viewModel

data class HomeScreenUiState(
    val todayOffers: List<TodayOffers> = emptyList(),
    val donuts: List<Donuts> = emptyList()
) {
    data class TodayOffers(
        val todayTitle: String = "",
        val todayDescription: String = "",
        val todayImageResource: Int = 0,
        val todayDiscountPrice: Int = 0,
        val todayOriginalPrice: Int = 0,
    )
    data class Donuts(
        val donutsImageResource: Int = 0,
        val donutsTitle: String = "",
        val donutsPrice: Int = 0,
    )
}
fun HomeScreenDonutsModel.toUiState() = HomeScreenUiState.Donuts(donutsImageResource, donutsTitle, donutsPrice)
fun HomeScreenTodayModel.toUiState() = HomeScreenUiState.TodayOffers(todayTitle, todayDescription, todayImageResource, todayDiscountPrice, todayOriginalPrice)
