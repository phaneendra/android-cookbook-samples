package com.example.composecookbook.ui.demos.theming

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.composecookbook.app.CookbookAppViewModel
import com.example.composecookbook.app.navigation.Screens
import com.example.composecookbook.ui.theme.appTypography

@Composable
fun ThemingScreen(viewModel: CookbookAppViewModel) {
    viewModel.setCurrentScreen(Screens.MainScreens.Theming)
    ThemingContent()
}

@Composable
fun ThemingContent(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Theming Screen", style = appTypography.h4)
    }
}

@Preview
@Composable
fun PreviewThemingScreen() {
    Column {
        ThemingContent()
    }
}