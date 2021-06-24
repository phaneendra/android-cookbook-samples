package com.example.composecookbook.app.components

import androidx.compose.material.*
import androidx.compose.runtime.Composable
import com.example.composecookbook.app.navigation.Screens
import com.example.composecookbook.ui.theme.appTypography

@Composable
fun BottomBar(currentScreen: Screens, onNavItemClick: (Screens) -> Unit) {
    val bottomNavScreens = listOf(
        Screens.MainScreens.Animation,
        Screens.MainScreens.Theming,
        Screens.MainScreens.Home,
        Screens.MainScreens.Widgets,
        Screens.MainScreens.Templates,
    )

    BottomNavigation( backgroundColor = MaterialTheme.colors.surface) {
        bottomNavScreens.forEach { screen ->
           BottomNavigationItem(
               icon = { Icon(imageVector = screen.icon, contentDescription = "") },
               label = { Text(text = screen.title, style = appTypography.caption) },
               selectedContentColor = MaterialTheme.colors.primary,
               unselectedContentColor = MaterialTheme.colors.onSurface.copy(alpha = ContentAlpha.medium),
               selected = currentScreen == screen,
               onClick = {
                   onNavItemClick(screen)
               }
           )
       }
    }
}