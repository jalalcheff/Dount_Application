package com.example.dountapplication

import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController

@Composable
fun DonutsScreenNavGraph(){
val navController = rememberNavController()
    DonutsScreen(navController = navController)
}