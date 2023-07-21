package com.example.dountapplication.viewModel

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.dountapplication.util.HomeScreenFakeData
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class HomeScreenViewModel : ViewModel() {
    private val fakeData = HomeScreenFakeData
    private val _state = MutableStateFlow(HomeScreenUiState())
    val state = _state.asStateFlow()
    init {
        fetchData()
    }

    private fun fetchData() {
        _state.update { it.copy(
            donuts = fakeData.listOfHomeScreenDonutsFakeData.map {donuts ->
                donuts.toUiState() },
            todayOffers = fakeData.listOfHomeScreenTodayFakeData.map {todayDonuts ->
                todayDonuts.toUiState() }
        ) }
    }
}