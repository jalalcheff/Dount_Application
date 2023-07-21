package com.example.dountapplication.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.zIndex
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.ViewModel
import androidx.navigation.NavController
import com.example.dountapplication.composable.DonutsCard
import com.example.dountapplication.composable.HorizontalSpacer
import com.example.dountapplication.composable.SearchRow
import com.example.dountapplication.composable.Subtitle
import com.example.dountapplication.composable.TodayOfferDonutsCard
import com.example.dountapplication.composable.VerticalSpacer
import com.example.dountapplication.viewModel.HomeScreenUiState
import com.example.dountapplication.viewModel.HomeScreenViewModel
import com.teckiti.R

@Composable
fun DonutsHomeScreen(
    navController: NavController,
    viewModel: HomeScreenViewModel = hiltViewModel()) {
val state by viewModel.state.collectAsState()
    DonutsHomeContent(
        state, onClickDonuts = { navController.navigateToDetails() }
    )
}

@Composable
fun DonutsHomeContent(state: HomeScreenUiState, onClickDonuts: () -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White).padding(bottom = 16.dp)
    ) {
        Spacer(modifier = Modifier.size(16.dp))
        SearchRow()
        VerticalSpacer(space = 54)
        Subtitle("Today Offers")
        VerticalSpacer(space = 25)
        LazyRow(contentPadding = PaddingValues(4.dp), modifier = Modifier.zIndex(1f)){
            items(state.todayOffers) {
                TodayOfferDonutsCard(it, onClickDonuts)
                HorizontalSpacer(space = 42)
            }
        }
        VerticalSpacer(space = 36)
        Subtitle(text = "Donuts")
        VerticalSpacer(space = 36)
        LazyRow(contentPadding = PaddingValues(8.dp), modifier = Modifier.zIndex(1f)){
            items(state.donuts) {
                DonutsCard(it)
            }
        }
        Spacer(modifier = Modifier.weight(1f))
        Card(modifier = Modifier.fillMaxWidth(),
            colors = CardDefaults.cardColors(Color.Transparent)
            ) {
            Row(
                modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Image(painter = painterResource(id = R.drawable.home), contentDescription = "bottomBar")
                Image(painter = painterResource(id = R.drawable.heart), contentDescription = "bottomBar")
                Image(painter = painterResource(id = R.drawable.notification), contentDescription = "bottomBar")
                Image(painter = painterResource(id = R.drawable.buy), contentDescription = "bottomBar")
                Image(painter = painterResource(id = R.drawable.group), contentDescription = "bottomBar")
            }
        }
    }
}


@Composable
@Preview(widthDp = 360, heightDp = 800)
fun PreviewDonutsHomeContent() {
    DonutsHomeContent(HomeScreenUiState(emptyList(), emptyList()), {})
}