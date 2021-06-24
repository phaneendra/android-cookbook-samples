package com.example.themebuilder.app.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.themebuilder.app.AppViewModel
import com.example.themebuilder.app.home.HomeScreen
import com.example.themebuilder.ui.demos.animation.AnimationScreen
import com.example.themebuilder.ui.demos.templates.TemplatesScreen
import com.example.themebuilder.ui.demos.theming.ThemingScreen
import com.example.themebuilder.ui.demos.widgets.WidgetsScreen

@Composable
fun NavGraph(
    viewModel: AppViewModel,
    navController: NavHostController,
    startDestination: String = Screens.MainScreens.Home.route
) {

    NavHost(navController = navController, startDestination = startDestination) {
        composable(Screens.MainScreens.Home.route) { HomeScreen(viewModel) }
        composable(Screens.MainScreens.Theming.route) { ThemingScreen(viewModel) }
        composable(Screens.MainScreens.Widgets.route) { WidgetsScreen(viewModel) }
        composable(Screens.MainScreens.Templates.route) { TemplatesScreen(viewModel) }
        composable(Screens.MainScreens.Animation.route) { AnimationScreen(viewModel) }
    }
}