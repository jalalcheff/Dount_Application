package com.example.dountapplication.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.dountapplication.ui.theme.pink700
import com.example.dountapplication.ui.theme.whiteBackground
import com.example.pizzaorderapp.R

@Composable
fun BottomSheet(){
    Card(shape = RoundedCornerShape(20.dp)) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(whiteBackground)
                .padding(horizontal = 40.dp)
                .clip(RoundedCornerShape(32.dp))
        ) {
            Spacer(modifier = Modifier.height(36.dp))
            TitleText(
                text = "Strawberry Wheel",
                fontSize = 24,
                Modifier.padding(0.dp)
            )
            VerticalSpacer(space = 36)
            Text(
                text = "About Gonut",
                fontWeight = FontWeight.SemiBold,
                fontFamily = FontFamily(Font(R.font.inter_regular)),
            )
            VerticalSpacer(space = 16)
            Text(
                text = stringResource(R.string.these_soft_cake),
                fontWeight = FontWeight.Light
            )
            VerticalSpacer(space = 26)
            Text(
                text = "Quantity",
                fontWeight = FontWeight.SemiBold,
                fontFamily = FontFamily(Font(R.font.inter_regular)),
            )
            VerticalSpacer(space = 16)
            Row() {
                IncDec(text = "-")
                IncDec(text = "1")
                IncDec(
                    text = "+",
                    textColor = Color.White,
                    cardColors = CardDefaults.cardColors(Color.Black)
                )
            }
            Spacer(modifier = Modifier.weight(1f))
            Row(modifier = Modifier.padding(bottom = 24.dp),
            ) {
                Text(
                    text = "$ 16",
                    fontSize = 32.sp,
                    fontWeight = FontWeight.SemiBold,
                    fontFamily = FontFamily(Font(R.font.inter_regular)),
                    modifier = Modifier.align(alignment = Alignment.CenterVertically)
                )
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp)
                        .padding(start = 8.dp),
                    colors = ButtonDefaults.buttonColors(pink700)
                ) {
                    Text(
                        text = "Add to Cart",
                        modifier = Modifier.padding(vertical = 16.dp),
                        color = Color.White,
                        fontSize = 24.sp
                    )
                }
            }
        }
    }

}

@Preview(widthDp = 360, heightDp = 800)
@Composable
fun PreviewBottomSheet(){
    BottomSheet()
}