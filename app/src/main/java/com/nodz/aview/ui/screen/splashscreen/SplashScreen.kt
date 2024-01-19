package com.nodz.aview.ui.screen.splashscreen

import android.app.Activity
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.BlendMode.Companion.Screen
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalView
import androidx.navigation.NavHostController
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition
import com.google.accompanist.systemuicontroller.SystemUiController
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import com.nodz.aview.R

@Composable
fun SplashScreen(
    navController: NavHostController,
    systemUiController: SystemUiController
) {
    Scaffold(
        modifier = Modifier.fillMaxSize()
    ) {

        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(it)
        ) {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .wrapContentSize(align = Alignment.Center)
                    .align(
                        Alignment.Center
                    )
            ) {
                val composition by rememberLottieComposition(spec = LottieCompositionSpec.RawRes(R.raw.space))
                val progress by animateLottieCompositionAsState(composition = composition)
                val progressState = animateLottieCompositionAsState(composition = composition)
                LottieAnimation(
                    composition = composition,
                    modifier = Modifier.fillMaxSize(0.4f),
                    progress = {
                        progress
                    }
                )
//                systemUiController.setSystemBarsColor(
//                    color = Color(0xFF635B70)
//                )
                if (progressState.isAtEnd && progressState.isPlaying) {
                    navController.popBackStack()
                    navController.navigate("onboarding")
                }
            }
        }
    }
}