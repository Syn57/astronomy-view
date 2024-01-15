package com.nodz.aview.ui.screen.onboarding

import androidx.compose.foundation.ExperimentalFoundationApi

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.PagerState

@OptIn(
    ExperimentalFoundationApi::class,
    ExperimentalPagerApi::class
)
@Composable
fun OnboardingScreen() {
    val pagerState by remember { mutableStateOf(PagerState(0)) }

}