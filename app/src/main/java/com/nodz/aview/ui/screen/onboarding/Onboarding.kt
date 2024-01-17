package com.nodz.aview.ui.screen.onboarding

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.constraintlayout.compose.ConstraintLayout
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.PagerState
import com.nodz.aview.R

@OptIn(
    ExperimentalFoundationApi::class,
    ExperimentalPagerApi::class
)
@Composable
fun OnboardingScreen() {
    ConstraintLayout(
        modifier = Modifier.fillMaxSize()
    ) {
        val pagerState by remember { mutableStateOf(PagerState(0)) }
        val listImgOnboard = listOf(R.drawable.bg_obscreen_1, R.drawable.bg_obscreen_2, R.drawable.bg_obscreen_3)
        val imgOnboard = painterResource(id = listImgOnboard[pagerState.currentPage])

        HorizontalPager(
            state = pagerState,
            count = listImgOnboard.size,
            modifier = Modifier.fillMaxWidth()
        ) {
            Image(
                painter = imgOnboard,
                contentDescription = "",
                contentScale = ContentScale.FillWidth,
                modifier = Modifier.fillMaxSize()
            )
        }
    }
}