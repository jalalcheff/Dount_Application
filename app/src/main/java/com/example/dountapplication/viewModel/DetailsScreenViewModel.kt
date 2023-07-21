package com.example.dountapplication.viewModel

import androidx.lifecycle.ViewModel
import com.example.dountapplication.util.DetailsScreenFakeData
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class DetailsScreenViewModel : ViewModel() {
    private val detailsData = DetailsScreenFakeData.detailsDonuts
    private val _state = MutableStateFlow(DetailsScreenUiState())
    val state = _state.asStateFlow()
    init {
        fetchData()
    }

    private fun fetchData() {
        _state.update { it.copy(
            title = detailsData.title,
            imageResource = detailsData.imageResource,
            description = detailsData.description,
            price = detailsData.price,
            quantity = detailsData.quantity,
        ) }
    }
     fun updateQuantity(incDec: String){
        if (incDec == "-" && _state.value.quantity > 0){
            _state.update { it.copy(quantity = it.quantity - 1) }
        }
        else if (incDec == "+"){
            _state.update { it.copy(quantity = it.quantity + 1) }

        }
    }
}
