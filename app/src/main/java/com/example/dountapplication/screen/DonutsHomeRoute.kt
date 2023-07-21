package com.example.dountapplication.screen

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable

const val ROUTE_DETAILS = "thirdScreen"
fun NavGraphBuilder.Details(navController: NavController){
    composable(ROUTE_DETAILS){
        DonutsDetailsScreen(navController = navController)
    }
}

fun NavController.navigateToDetails(){
    navigate(ROUTE_DETAILS)
}