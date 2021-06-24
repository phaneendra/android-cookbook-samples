package com.example.themebuilder.ui.demos.widgets

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.themebuilder.app.AppViewModel
import com.example.themebuilder.app.navigation.Screens
import com.example.themebuilder.ui.theme.appTypography

@Composable
fun WidgetsScreen(viewModel: AppViewModel) {
    viewModel.setCurrentScreen(Screens.MainScreens.Widgets)
    WidgetsContent()
}

@Composable
fun WidgetsContent(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Widgets Screen", style = appTypography.h4)
    }
}

@Preview
@Composable
fun PreviewWidgetsScreen() {
    Column {
        WidgetsContent()
    }
}


