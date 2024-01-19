package com.nodz.aview.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.nodz.aview.R

// Set of Material typography styles to start with
private val light = Font(R.font.poppins_400, FontWeight.W400)
private val regular = Font(R.font.poppins_500, FontWeight.W500)
private val medium = Font(R.font.poppins_600, FontWeight.W600)
private val semibold = Font(R.font.poppins_700, FontWeight.W700)

private val aviewFontFamily = FontFamily(fonts = listOf(light, regular, medium, semibold))

val aviewTypography = Typography(
    bodySmall = TextStyle(
        fontFamily = aviewFontFamily,
        fontWeight = FontWeight.W400,
        fontSize = 12.sp
    ),
    bodyMedium = TextStyle(
        fontFamily = aviewFontFamily,
        fontWeight = FontWeight.W400,
        fontSize = 14.sp
    ),
    bodyLarge = TextStyle(
        fontFamily = aviewFontFamily,
        fontWeight = FontWeight.W600,
        fontSize = 14.sp
    )
)