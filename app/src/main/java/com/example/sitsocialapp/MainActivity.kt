package com.example.sitsocialapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.internal.composableLambda
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.sitsocialapp.screens.MainScreen
import com.example.sitsocialapp.screens.SecondScreen
import com.example.sitsocialapp.screens.SplashScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            val rememberSplash = remember{ mutableStateOf(false) }
            Navigation(navController = navController, rememberSplash)
        }
    }
}

@Composable
fun Navigation(navController: NavHostController, rememberSplash: MutableState<Boolean>){
    NavHost(navController = navController, startDestination = if(!rememberSplash.value){"SplashScreen"}else{"MainScreen"}){
        composable("SplashScreen"){
            SplashScreen(navController = navController) {
                rememberSplash.value = true
                navController.navigate("MainScreen")
            }
        }
        composable("MainScreen"){
            MainScreen(navController = navController)
        }
        composable("SecondScreen"){
            SecondScreen()
        }
    }
}