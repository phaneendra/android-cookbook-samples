package com.example.themebuilder.ui.components.texts

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.themebuilder.ui.theme.appTypography

@Composable
fun Subtitle(subtitle: String, modifier: Modifier = Modifier) {
    Text(
        text = subtitle,
        style = appTypography.subtitle1,
        modifier = modifier.padding(8.dp)
    )
}

@Preview(showBackground = true)
@Composable
fun PreviewSubtitle() {
    Column {
        Subtitle(subtitle = "Sample Subtitle")
    }
}