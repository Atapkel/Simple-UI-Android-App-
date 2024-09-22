package com.example.assignment01

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class FirstPage : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
}

@Preview(showBackground = true)
@Composable
fun First() {
    val backgroundGradient = Brush.linearGradient(
        colors =
        listOf(
            Color(0xFF12AA73),
            Color(0xCF135B46),
            Color(0xCF135B46)
        )
    )
    Box(
        modifier = Modifier
            .clip(RoundedCornerShape(30.dp))

    ) {


        Column(
            modifier = Modifier
                .background(backgroundGradient)
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,

            ) {
            Spacer(modifier = Modifier.height(86.03.dp))
            Image(
                painter = painterResource(id = R.drawable.smartr),
                contentDescription = null,
                modifier = Modifier
                    .width((97.6).dp)
                    .height((19.77.dp))
            )
            Spacer(modifier = Modifier.height((52.98.dp)))

            Image(
                painter = painterResource(id = R.drawable.signup_man),
                contentDescription = null,
                modifier = Modifier
                    .width((200.dp))
                    .height((211.dp))
            )
            Spacer(modifier = Modifier.height((19.8).dp))

            Text(
                text = "Fresh look, same login.",
                color = Color(0xFFF4F4F4),
                fontFamily = FontFamily(Font(R.font.poppins6)),
                fontWeight = FontWeight.SemiBold,
                fontSize = 24.sp
            )

            Spacer(modifier = Modifier.height((34.76.dp)))

            Column(verticalArrangement = Arrangement.SpaceBetween) {
                CreateTextWithIcon(
                    text = "SmartRecruiters candidate portal is now Smartr.",
                    id = R.drawable.resource_switch,
                    contentDescriptionOfIcon = ""
                )
                Spacer(modifier = Modifier.height((34.46.dp)))

                CreateTextWithIcon(
                    text = "Enter the same login info used for your SmartrProfile",
                    id = R.drawable.log_in,
                    contentDescriptionOfIcon = ""
                )
                Spacer(modifier = Modifier.height((34.46.dp)))

                CreateTextWithIcon(
                    text = "If login details were saved, you may need to re-save.",
                    id = R.drawable.refresh,
                    contentDescriptionOfIcon = ""
                )

            }
            Spacer(modifier = Modifier.height((48.43.dp)))

            Text(
                text = "Why Smartr? Read here",
                fontFamily = FontFamily(Font(R.font.poppins6)),
                fontSize = 10.sp,
                fontWeight = FontWeight.SemiBold,
                color = Color(0xFFF4F4F4),
                textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.height((8.99).dp))

            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFFBFDBD1),
                    contentColor = Color(0xCC135B46)
                ),
                shape = RoundedCornerShape(30.dp),
                modifier = Modifier
                    .width(272.dp)
                    .height(42.dp)
            ) {
                Text(
                    text = "GET STARTED",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center
                )
            }
        }
    }
}

@Composable
fun CreateTextWithIcon(
    text: String = "text",
    id: Int,
    contentDescriptionOfIcon: String
) {
    Row {
        Icon(
            painter = painterResource(id),
            contentDescription = contentDescriptionOfIcon,
            modifier = Modifier
                .width((23.73.dp))
                .height((26.02.dp)),
            tint = Color(0xFFF4F4F4)
        )
        Text(
            text = text,
            color = Color(0xFFF4F4F4),
            fontFamily = FontFamily(Font(R.font.poppins6)),
            fontSize = 12.sp,
            fontWeight = FontWeight.SemiBold,
            modifier = Modifier
                .height((48.5).dp)
                .width((134.51.dp))
                .padding(start = (16.33.dp))
        )
    }
}