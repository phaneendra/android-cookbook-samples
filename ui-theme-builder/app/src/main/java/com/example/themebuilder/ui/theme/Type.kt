package com.example.themebuilder.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.themebuilder.R


val poppinsFontFamily = FontFamily(
    Font(R.font.poppins_black, FontWeight.W900, FontStyle.Normal),
    Font(R.font.poppins_blackitalic, FontWeight.W900, FontStyle.Italic),
    Font(R.font.poppins_extrabold, FontWeight.W800, FontStyle.Normal),
    Font(R.font.poppins_extrabolditalic, FontWeight.W800, FontStyle.Italic),
    Font(R.font.poppins_bold, FontWeight.W700, FontStyle.Normal),
    Font(R.font.poppins_bolditalic, FontWeight.W700, FontStyle.Italic),
    Font(R.font.poppins_semibold, FontWeight.W600, FontStyle.Normal),
    Font(R.font.poppins_semibolditalic, FontWeight.W600, FontStyle.Italic),
    Font(R.font.poppins_medium, FontWeight.W500, FontStyle.Normal),
    Font(R.font.poppins_mediumitalic, FontWeight.W500, FontStyle.Italic),
    Font(R.font.poppins_regular, FontWeight.W400, FontStyle.Normal),
    Font(R.font.poppins_italic, FontWeight.W400, FontStyle.Italic),
    Font(R.font.poppins_light, FontWeight.W300, FontStyle.Normal),
    Font(R.font.poppins_lightitalic, FontWeight.W300, FontStyle.Italic),
    Font(R.font.poppins_extralight, FontWeight.W200, FontStyle.Normal),
    Font(R.font.poppins_extralightitalic, FontWeight.W200, FontStyle.Italic),
    Font(R.font.poppins_thin, FontWeight.W100, FontStyle.Normal),
    Font(R.font.poppins_thinitalic, FontWeight.W100, FontStyle.Italic)
)

// Set of Material typography styles to start with
val baseTypography = Typography(
    defaultFontFamily = poppinsFontFamily
)
val appTypography = Typography(
    h1 = baseTypography.h1.copy(fontSize = 96.sp, fontWeight = FontWeight.Light),
    h2 = baseTypography.h2.copy(fontSize = 60.sp, fontWeight = FontWeight.Light),
    h3 = baseTypography.h3.copy(fontSize = 48.sp, fontWeight = FontWeight.Normal),
    h4 = baseTypography.h4.copy(fontSize = 34.sp, fontWeight = FontWeight.Normal),
    h5 = baseTypography.h5.copy(fontSize = 24.sp, fontWeight = FontWeight.Normal),
    h6 = baseTypography.h6.copy(fontSize = 20.sp, fontWeight = FontWeight.Normal),
    subtitle1 = baseTypography.subtitle1.copy(fontSize = 16.sp, fontWeight = FontWeight.Bold),
    subtitle2 = baseTypography.subtitle2.copy(fontSize = 16.sp, fontWeight = FontWeight.Medium),
    body1 = baseTypography.body1.copy(fontSize = 16.sp, fontWeight = FontWeight.Normal),
    body2 = baseTypography.body2.copy(fontSize = 16.sp, fontWeight = FontWeight.Medium),
    button = baseTypography.button.copy(fontSize = 14.sp, fontWeight = FontWeight.Bold),
    caption = baseTypography.caption.copy(fontSize = 12.sp, fontWeight = FontWeight.Normal),
    overline = baseTypography.overline.copy(fontSize = 14.sp, fontWeight = FontWeight.Normal)
)