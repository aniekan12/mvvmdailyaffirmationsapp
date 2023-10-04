package com.example.mvvmdailyaffirmationsapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.mvvmdailyaffirmationsapp.data.models.NavItems
import com.example.mvvmdailyaffirmationsapp.ui.screens.HomeScreen
import com.example.mvvmdailyaffirmationsapp.ui.screens.SplashScreen

@Composable
fun AppNavigation(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = NavItems.HomeRoute.route,
        builder = {
            composable(NavItems.HomeRoute.route){
                HomeScreen(navController = navController)
            }

            composable(NavItems.SplashScreen.route){
                SplashScreen()
            }
        })
}