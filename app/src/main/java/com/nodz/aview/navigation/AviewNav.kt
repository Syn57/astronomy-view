package com.nodz.aview.navigation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.nodz.aview.ui.screen.onboarding.OnboardingScreen
import com.nodz.aview.ui.screen.splashscreen.SplashScreen

@Composable
fun AviewNav(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "splash_screen"){
        composable("splash_screen"){
            SplashScreen(navController)
        }
        composable("main_screen"){
            MainScreen()
        }
        composable("onboarding") {
            OnboardingScreen()
        }
    }
}

@Composable
fun MainScreen(){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Hello compose")
    }
}