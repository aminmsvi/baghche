package com.aminmsvi.baghche.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.aminmsvi.baghche.R

private val fontFamily = FontFamily(
    fonts = listOf(
        Font(R.font.vazirmatn_regular, FontWeight.W400),
        Font(R.font.vazirmatn_medium, FontWeight.W500),
    ),
)

val Typography = Typography(
    displayLarge = TextStyle(
        fontFamily = fontFamily,
        lineHeight = 64.sp,
        fontSize = 57.sp,
        letterSpacing = 0.sp,
        fontWeight = FontWeight.W400,
    ),
    displayMedium = TextStyle(
        fontFamily = fontFamily,
        lineHeight = 52.sp,
        fontSize = 45.sp,
        letterSpacing = 0.sp,
        fontWeight = FontWeight.W400,
    ),
    displaySmall = TextStyle(
        fontFamily = fontFamily,
        lineHeight = 44.sp,
        fontSize = 36.sp,
        letterSpacing = 0.sp,
        fontWeight = FontWeight.W400,
    ),
    headlineLarge = TextStyle(
        fontFamily = fontFamily,
        lineHeight = 40.sp,
        fontSize = 32.sp,
        letterSpacing = 0.sp,
        fontWeight = FontWeight.W400,
    ),
    headlineMedium = TextStyle(
        fontFamily = fontFamily,
        lineHeight = 36.sp,
        fontSize = 28.sp,
        letterSpacing = 0.sp,
        fontWeight = FontWeight.W400,
    ),
    headlineSmall = TextStyle(
        fontFamily = fontFamily,
        lineHeight = 32.sp,
        fontSize = 24.sp,
        letterSpacing = 0.sp,
        fontWeight = FontWeight.W400,
    ),
    titleLarge = TextStyle(
        fontFamily = fontFamily,
        lineHeight = 28.sp,
        fontSize = 22.sp,
        letterSpacing = 0.sp,
        fontWeight = FontWeight.W400,
    ),
    titleMedium = TextStyle(
        fontFamily = fontFamily,
        lineHeight = 24.sp,
        fontSize = 16.sp,
        letterSpacing = 0.15.sp,
        fontWeight = FontWeight.W500,
    ),
    titleSmall = TextStyle(
        fontFamily = fontFamily,
        lineHeight = 20.sp,
        fontSize = 14.sp,
        letterSpacing = 0.1.sp,
        fontWeight = FontWeight.W500,
    ),
    labelLarge = TextStyle(
        fontFamily = fontFamily,
        lineHeight = 20.sp,
        fontSize = 14.sp,
        letterSpacing = 0.1.sp,
        fontWeight = FontWeight.W500,
    ),
    labelMedium = TextStyle(
        fontFamily = fontFamily,
        lineHeight = 16.sp,
        fontSize = 12.sp,
        letterSpacing = 0.5.sp,
        fontWeight = FontWeight.W500,
    ),
    labelSmall = TextStyle(
        fontFamily = fontFamily,
        lineHeight = 16.sp,
        fontSize = 11.sp,
        letterSpacing = 0.5.sp,
        fontWeight = FontWeight.W500,
    ),
    bodyLarge = TextStyle(
        fontFamily = fontFamily,
        lineHeight = 24.sp,
        fontSize = 16.sp,
        letterSpacing = 0.5.sp,
        fontWeight = FontWeight.W400,
    ),
    bodyMedium = TextStyle(
        fontFamily = fontFamily,
        lineHeight = 20.sp,
        fontSize = 14.sp,
        letterSpacing = 0.25.sp,
        fontWeight = FontWeight.W400,
    ),
    bodySmall = TextStyle(
        fontFamily = fontFamily,
        lineHeight = 16.sp,
        fontSize = 12.sp,
        letterSpacing = 0.4.sp,
        fontWeight = FontWeight.W400,
    ),
)
