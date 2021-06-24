package com.example.composecookbook.app.home

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
fun HomeScreen(viewModel: CookbookAppViewModel) {
    viewModel.setCurrentScreen(Screens.MainScreens.Home)
    HomeContent()
}

@Composable
fun HomeContent(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Home Screen", style = appTypography.h4)
    }
}

@Preview
@Composable
fun PreviewHomeScreen() {
    Column {
        HomeContent()
    }
}
