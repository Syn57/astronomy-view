package com.nodz.aview.navigation

sealed class Screen(val route: String) {
    object SplashScreen : Screen("splash_screen")
    object Onboarding : Screen("onboarding")

}