package com.example.themebuilder.ui.components.texts

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.themebuilder.ui.theme.appTypography

@Composable
fun SecondaryText(secondaryText: String, modifier: Modifier = Modifier) {
    Text(
        text = secondaryText,
        style = appTypography.body2,
        color = MaterialTheme.colors.onSurface.copy(alpha = 0.60f),
        modifier = modifier.padding(8.dp)
    )
}

@Preview(showBackground = true)
@Composable
fun PreviewSecondaryText() {
    Column {
        SecondaryText(secondaryText = " My Sample Secondary text \n this is a second line ")
    }
}