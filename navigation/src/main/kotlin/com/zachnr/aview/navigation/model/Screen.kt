package com.zachnr.aview.navigation.model

import androidx.compose.ui.graphics.vector.ImageVector

data class Screen<T: Any>(
    val name: String,
    val route: T,
    val icon: ImageVector?
)
