package com.nodz.aview.ui.screen.onboarding

import android.app.Activity
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalView
import androidx.compose.ui.res.painterResource
import androidx.constraintlayout.compose.ConstraintLayout
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.rememberPagerState
import com.google.accompanist.systemuicontroller.SystemUiController
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import com.nodz.aview.R

@OptIn(
    ExperimentalFoundationApi::class,
    ExperimentalPagerApi::class
)
@Composable
fun OnboardingScreen(systemUiController: SystemUiController) {
    val pagerState = rememberPagerState()
    val listImgOnboard = listOf(R.drawable.bg_obscreen_1, R.drawable.bg_obscreen_2, R.drawable.bg_obscreen_3)
    ConstraintLayout(
        modifier = Modifier.fillMaxSize()
    ) {
        HorizontalPager(
            state = pagerState,
            count = 3,
            modifier = Modifier.fillMaxWidth()
        ) { position ->
            Image(
                painter = painterResource(id = listImgOnboard[position]),
                contentDescription = "",
                contentScale = ContentScale.FillWidth,
                modifier = Modifier.fillMaxSize()
            )

        }
    }
}