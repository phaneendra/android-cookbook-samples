package com.example.composecookbook.app.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.composecookbook.app.CookbookAppViewModel
import com.example.composecookbook.app.home.HomeScreen
import com.example.composecookbook.ui.demos.animation.AnimationScreen
import com.example.composecookbook.ui.demos.templates.TemplatesScreen
import com.example.composecookbook.ui.demos.theming.ThemingScreen
import com.example.composecookbook.ui.demos.widgets.WidgetsScreen

@Composable
fun NavGraph(
    viewModel: CookbookAppViewModel,
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