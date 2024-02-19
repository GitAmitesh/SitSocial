package com.example.sitsocialapp.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.sitsocialapp.ui.theme.AccentColor
import com.example.sitsocialapp.ui.theme.fontAccentFamily
import com.example.sitsocialapp.ui.theme.fontPrimaryFamily
import com.example.sitsocialapp.ui.theme.gradient

@Preview
@Composable
fun SignupScreen(){
    val scrollState = rememberScrollState()
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(gradient),
        contentAlignment = Alignment.Center,
        )
    {
        Card(
            modifier = Modifier
                .size(width = 350.dp, height = 550.dp),
            shape = RoundedCornerShape(15.dp),
            colors = CardDefaults.cardColors(Color.LightGray.copy(alpha = 0.6f))
        ) {
            Column(
                verticalArrangement = Arrangement.SpaceEvenly,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.fillMaxSize()
                    .verticalScroll(rememberScrollState())

            ) {
                Text(text = "Create new account",
                    fontFamily = fontPrimaryFamily,
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black
                )
                TextInput("Full name","")
                TextInput("Username","Visible to public")
                TextInput("Silicon email address","branch.sic@silicon.ac.in")
                TextInput("Password","")
                TextInput("Confirm password","")
                Button(onClick = { /* TODO: Sign In event */ },
                    colors = ButtonDefaults.buttonColors(containerColor = AccentColor),
                    modifier = Modifier.size(width = 150.dp, height = 50.dp),
                    elevation = ButtonDefaults.buttonElevation(20.dp)
                ) {
                    Text(text = "Sign Up",
                        fontSize = 24.sp,
                        fontFamily = fontAccentFamily,
                        color = Color.White
                    )
                }
            }
        }
    }
}