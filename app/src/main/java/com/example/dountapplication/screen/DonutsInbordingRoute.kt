package com.example.dountapplication.screen

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable

const val ROUTE = "secondScreen"
fun NavGraphBuilder.HomeScreen(navController: NavController){
    composable(ROUTE){
        DonutsHomeScreen(navController = navController)
    }
}

fun NavController.navigateToHomeScreen(){
    navigate(ROUTE)
}