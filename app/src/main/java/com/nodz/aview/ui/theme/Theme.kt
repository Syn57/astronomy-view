package com.nodz.aview.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

val aviewColors = lightColorScheme(
    primary = primaryLight,
    secondary = secondaryLight,
    background = Color.White
)


@Composable
fun AstronomyViewTheme(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = aviewColors,
        typography = aviewTypography,
        content = content
    )
}