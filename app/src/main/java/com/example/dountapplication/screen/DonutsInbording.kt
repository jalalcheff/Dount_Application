package com.example.dountapplication.screen

import androidx.compose.animation.core.InfiniteRepeatableSpec
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.animateValue
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.dountapplication.ui.theme.backgroundPink
import com.example.dountapplication.ui.theme.pink500
import com.example.dountapplication.ui.theme.pink700
import com.teckiti.R

@Composable
fun DonutsInboardingScreen(
    navController: NavController
){
    DonutsInboarding { navController.navigateToHomeScreen() }
}
@Composable
fun DonutsInboarding(
    onClickStarted: () -> Unit
){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(backgroundPink)
    ) {
        val infiniteTransition = rememberInfiniteTransition()
        val donutsAnimate by infiniteTransition.animateFloat(
            targetValue = -50f,
            initialValue = 20f,
            animationSpec = InfiniteRepeatableSpec(tween(6000), repeatMode = RepeatMode.Reverse)
        )
        Image(
            painter = painterResource(id = R.drawable.img),
            contentDescription = "background",
            modifier = Modifier
                .fillMaxWidth()
                .scale(1.6f)
                .padding(top = 52.dp)
                .offset(y = donutsAnimate.dp, x = donutsAnimate.dp)
            )
            Text(
                text = "Gonuts\nwith\nDonuts",
                        style = TextStyle(
                        fontSize = 42.sp,
                fontFamily = FontFamily(Font(R.font.inter_regular)),
                fontWeight = FontWeight(700),
                color = pink700,
            ),
                maxLines = 3,
                modifier = Modifier.padding(start = 16.dp)
            )
        Text(
            text = "Gonuts with Donuts is a Sri Lanka dedicated food outlets for specialize manufacturing of Donuts in Colombo, Sri Lanka.",
            style = TextStyle(
                fontSize = 18.sp,
                fontFamily = FontFamily(Font(R.font.inter_regular)),
                fontWeight = FontWeight(500),
                color = pink500,
            ),
            modifier = Modifier.padding(horizontal = 16.dp)
        )
        Spacer(modifier = Modifier.weight(1f))
        Button(
            onClick =  onClickStarted ,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)
                .padding(bottom = 24.dp),
            colors = ButtonDefaults.buttonColors(Color.White)
            ) {
            Text(
                text = "Get Started",
                modifier = Modifier.padding(vertical = 16.dp),
                color = Color.Black,
                fontSize = 24.sp
                )
        }
    }
}

@Composable
@Preview(widthDp = 360, heightDp = 800)
fun PreviewDonutsBoarding(){
}