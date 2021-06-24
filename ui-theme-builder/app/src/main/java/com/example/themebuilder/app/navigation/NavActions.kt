package com.example.themebuilder.app.navigation

import androidx.navigation.NavHostController

class NavActions(navController: NavHostController) {
    val mainScreen: () -> Unit = {
        navController.navigate(Screens.MainScreens.Home.route)
    }
    val upPress: () -> Unit = {
        navController.navigateUp()
    }
    val navigateToRoute: (String) -> Unit = {
        navController.navigate(it)
    }
    val navigateToScreen: (Screens) -> Unit = {
        navController.navigate(it.route)
    }
}