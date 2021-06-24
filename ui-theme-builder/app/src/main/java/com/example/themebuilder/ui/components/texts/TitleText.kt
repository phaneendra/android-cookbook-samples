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
fun TitleText(titletext: String, modifier: Modifier = Modifier) {
    Text(
        text = titletext,
        style = appTypography.h6,
        modifier = modifier.padding(8.dp)
    )
}

@Preview(showBackground = true)
@Composable
fun PreviewTitleText() {
    Column {
        TitleText(titletext = "This is a Sample Title")
    }
}