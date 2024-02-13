package com.example.sitsocialapp.screens
import com.example.sitsocialapp.MainActivity
import android.view.animation.OvershootInterpolator
import android.window.SplashScreen
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.example.sitsocialapp.Navigation
import com.example.sitsocialapp.R
import com.example.sitsocialapp.ui.theme.Purple80
import kotlinx.coroutines.delay


@Composable
fun SplashScreen(navController: NavController, splashDisplayed: ()-> Unit) {

    val scale=remember{
        Animatable(0f)
    }
    LaunchedEffect(key1 = true){
        scale.animateTo(
            targetValue = 0.7f,
            animationSpec = tween(
                durationMillis = 1000,
                easing = {
                    OvershootInterpolator(3f).getInterpolation(it)
                }

            )
        )
        delay(2000)
        splashDisplayed()

    }
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier.fillMaxSize()
            .background(Purple80)
    ){
        Text(
            text = "Sit Social",
            fontSize = 80.sp,
            fontFamily = FontFamily(Font(R.font.playball)),
            modifier = Modifier.scale(scale.value)
        )
    }
}