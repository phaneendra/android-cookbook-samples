package com.example.themebuilder.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

private val DarkColorPalette = darkColors(
    primary = OcRed200,
    onPrimary = OcGray800,
    primaryVariant = OcRed500,

    secondary = OcYellow200,
    secondaryVariant = OcYellow500,
    onSecondary = OcGray800,

    background = OcGray900,
    onBackground = OcGray50,

    surface = OcGray800,
    onSurface = OcGray100,

    error = Red600,
    onError = White50
)

private val LightColorPalette = lightColors(
    primary = Red500,
    onPrimary = Black900,
    primaryVariant = Red400,

    secondary = OcOrange600,
    secondaryVariant = OcOrange300,
    onSecondary = OcGray50,

    background = Gray50,
    onBackground = Gray900,

    surface = Gray100,
    onSurface = Gray900,

    error = Red600,
    onError = White50
)

@Composable
fun AppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable() () -> Unit
) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = appTypography,
        shapes = Shapes,
        content = content
    )
}