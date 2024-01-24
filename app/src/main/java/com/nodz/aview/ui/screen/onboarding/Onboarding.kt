package com.nodz.aview.ui.screen.onboarding

import android.app.Activity
import android.graphics.drawable.Drawable
import android.view.ViewGroup
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.BlurredEdgeTreatment
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.blur
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.constraintlayout.compose.ConstraintLayout
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.rememberPagerState
import com.google.accompanist.systemuicontroller.SystemUiController
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import com.nodz.aview.R
import com.primex.core.ExperimentalToolkitApi
import com.primex.core.blur.legacyBackgroundBlur
import com.primex.core.noise



@OptIn(
    ExperimentalFoundationApi::class,
    ExperimentalPagerApi::class, ExperimentalToolkitApi::class
)
@Composable
fun OnboardingScreen() {
    val pagerState = rememberPagerState()
    val listImgOnboard = listOf(R.drawable.bg_obscreen_1, R.drawable.bg_obscreen_2, R.drawable.bg_obscreen_3)
    ConstraintLayout(
        modifier = Modifier.fillMaxSize()
    ) {
        val (bg, card, text) = createRefs()
        HorizontalPager(
            state = pagerState,
            count = 3,
            modifier = Modifier
                .fillMaxWidth()
                .constrainAs(bg) { }
        ) { position ->
            Image(
                painter = painterResource(id = listImgOnboard[position]),
                contentDescription = "",
                contentScale = ContentScale.FillWidth,
                modifier = Modifier.fillMaxSize()
            )
        }

//        Image(
//            painter = painterResource(id = R.drawable.blur),
//            contentDescription = null,
//            modifier = Modifier
//                .fillMaxWidth()
//                .height(400.dp)
//                .constrainAs(card) {
//                    bottom.linkTo(parent.bottom)
//                    start.linkTo(parent.start)
//                    end.linkTo(parent.end)
//                }
//        )

        Card(
            colors = CardDefaults.cardColors(
                containerColor = Color.White,
            ),
            shape = RoundedCornerShape(12,12, 0,0),
            modifier = Modifier
                .height(400.dp)
                .fillMaxWidth()
                .legacyBackgroundBlur(
                    25f, // the radius of the blur effect, in pixels
                    0.4f // the alpha value of the blur effect, between 0 and 1
                )
                .background(Color.White.copy(0.7f)) // the background color of the top bar
                .noise(0.05f)
                .constrainAs(card) {
                    bottom.linkTo(parent.bottom)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                }
        ) {

        }
    }
}