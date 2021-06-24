package com.example.themebuilder.app.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import androidx.compose.ui.graphics.vector.ImageVector

sealed class Screens(val route: String, val title: String, val icon: ImageVector) {
    sealed class MainScreens(route: String, title: String,icon: ImageVector): Screens(route, title, icon) {
        object Animation: MainScreens("animation", "Anime", Icons.Outlined.Animation)
        object Theming: MainScreens("theming", "Theme", Icons.Outlined.FormatColorFill)
        object Widgets: MainScreens("widgets", "Widgets", Icons.Outlined.Widgets)
        object Templates: MainScreens("templates", "TMPL", Icons.Outlined.Dashboard)
        object Home: MainScreens("home", "Home", Icons.Outlined.Home)
    }

    sealed class WidgetScreens(route: String,title: String,icon: ImageVector): Screens(route,title,icon) {
        object Texts: WidgetScreens("texts", "Texts", Icons.Outlined.TextFormat)
        object Buttons: WidgetScreens("buttons", "Buttons", Icons.Outlined.SmartButton)
    }

    sealed class ThemingScreens(route: String,title: String,icon: ImageVector): Screens(route,title,icon) {
        object Typography: ThemingScreens("typography", "Typography", Icons.Outlined.Title)
        object Colors: ThemingScreens("colors", "Colors", Icons.Outlined.Palette)
    }
}



val widgetNavScreens = listOf<Screens.WidgetScreens>(
    Screens.WidgetScreens.Texts,
    Screens.WidgetScreens.Buttons
)

val themingNavScreens = listOf<Screens.ThemingScreens>(
    Screens.ThemingScreens.Typography,
    Screens.ThemingScreens.Colors
)