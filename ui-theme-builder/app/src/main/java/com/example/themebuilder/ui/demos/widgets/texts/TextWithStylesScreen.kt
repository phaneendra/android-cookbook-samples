package com.example.themebuilder.ui.demos.widgets.texts

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.themebuilder.ui.theme.appTypography

@Composable
fun TextWithStylesScreen() {
    Surface(color = MaterialTheme.colors.background) {
        Text(
            text = "Text Views",
            style = appTypography.h6,
            modifier = Modifier.padding(8.dp)
        )

    }
}

@Preview(showBackground = true)
@Composable
fun PreviewTextWithStylesScreen() {
    Column {
        TextWithStylesScreen()
    }
}