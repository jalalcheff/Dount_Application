package com.example.dountapplication.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.dountapplication.ui.theme.backgroundPink
import com.example.dountapplication.ui.theme.pink500
import com.example.dountapplication.ui.theme.pink700
import com.example.pizzaorderapp.R

@Composable
fun DonutsInboarding(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(backgroundPink)
    ) {
        Image(
            painter = painterResource(id = R.drawable.img),
            contentDescription = "background",
            modifier = Modifier
                .fillMaxWidth()
                .scale(1.6f)
                .padding(top = 52.dp)
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
            onClick = { /*TODO*/ },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp).padding(bottom = 24.dp),
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
    DonutsInboarding()
}