package com.example.themebuilder.app

import android.util.Log
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.rememberNavController
import com.example.themebuilder.app.components.BottomBar
import com.example.themebuilder.app.navigation.NavActions
import com.example.themebuilder.app.navigation.NavGraph
import com.example.themebuilder.app.navigation.Screens
import com.example.themebuilder.ui.theme.ComposeCookbookTheme

@Composable
fun ComposeCookbookApp() {

    // Initialize the view model
    val viewModel: AppViewModel = viewModel()
    // Initialize the navigation controller
    val navController = rememberNavController()
    val actions = remember(navController) {NavActions(navController)}

    // observe the currentScreen LiveData and navigate on change
    val currentScreen by viewModel.currentScreen.observeAsState(Screens.MainScreens.Home)
    Log.i("ComposeCookBook", "Debug:${currentScreen.route}")


    // Composable that wraps the app with a Theme for styling.
    ComposeCookbookTheme {
        // A surface container using the 'background' color from the theme
        Surface(color = MaterialTheme.colors.background) {
            Scaffold(
                bottomBar = { 
                    BottomBar( currentScreen, onNavItemClick = {  actions.navigateToScreen(it) } )
                }
            ) {
                NavGraph(viewModel, navController)
            }
        }
    }
}