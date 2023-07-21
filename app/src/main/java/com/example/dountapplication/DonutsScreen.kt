package com.example.dountapplication

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.dountapplication.screen.Details
import com.example.dountapplication.screen.DonutsDetailsScreen
import com.example.dountapplication.screen.DonutsHomeScreen
import com.example.dountapplication.screen.DonutsInboarding
import com.example.dountapplication.screen.DonutsInboardingScreen
import com.example.dountapplication.screen.HomeScreen


@Composable
fun DonutsScreen(navController: NavHostController){
    NavHost(navController = navController, startDestination = "firstScreen"){
        composable("firstScreen"){ DonutsInboardingScreen(navController) }
        HomeScreen(navController)
        Details(navController)
    }
}