package com.nodz.aview.navigation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.google.accompanist.systemuicontroller.SystemUiController
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import com.nodz.aview.ui.screen.onboarding.OnboardingScreen
import com.nodz.aview.ui.screen.splashscreen.SplashScreen

@Composable
fun AviewNav() {
    val navController = rememberNavController()
    val systemUiController = rememberSystemUiController()
    NavHost(
        navController = navController,
        startDestination = Screen.SplashScreen.route
    ) {
        composable(Screen.SplashScreen.route) {
            SideEffect {
                systemUiController.setSystemBarsColor(
                    color = Color.White
                )
            }
            SplashScreen(navController)
        }
        composable("main_screen") {
            MainScreen()
        }
        composable(Screen.Onboarding.route) {
            SideEffect {
                systemUiController.setSystemBarsColor(
                    color = Color(0xFF5D5D72)
                )
            }
            OnboardingScreen()
        }
    }
}

@Composable
fun MainScreen() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Hello compose")
    }
}