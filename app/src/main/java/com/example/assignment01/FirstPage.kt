package com.example.assignment01

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class FirstPage: ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val backgroundGradient = Brush.linearGradient(
            colors =
            listOf(
                Color(0xFF12AA73),
                Color(0xCF135B46),
                Color(0xCF135B46)
            )
        )
        setContent() {

            Column(
                modifier = Modifier
                    .background(backgroundGradient)
                    .fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
//                verticalArrangement = Arrangement.SpaceEvenly
            ) {
                Spacer(modifier = Modifier.height(calcDp(86.03)))
                Image(
                    painter = painterResource(id = R.drawable.smartr),
                    contentDescription = null,
                    modifier = Modifier
                        .width(calcDp(97.6))
                        .height(calcDp(19.77))
                )
                Spacer(modifier = Modifier.height(calcDp(52.98)))

                Image(
                    painter = painterResource(id = R.drawable.signup_man),
                    contentDescription = null,
                    modifier = Modifier
                        .width(calcDp(inDpI = 200))
                        .height(calcDp(inDpI = 211))
                )
                Spacer(modifier = Modifier.height(calcDp(19.8)))

                Text(
                    text = "Fresh look, same login.",
                    color = Color(0xFFF4F4F4),
                    fontFamily = FontFamily(Font(R.font.poppins)),
                    fontWeight = FontWeight.SemiBold,
                    fontSize = calcSp(24)
                )

                Spacer(modifier = Modifier.height(calcDp(34.76)))

                Column(verticalArrangement = Arrangement.SpaceBetween) {
                    CreateTextWithIcon(
                        text = "SmartRecruiters candidate portal is now Smartr.",
                        id = R.drawable.resource_switch,
                        contentDescriptionOfIcon = ""
                    )
                    Spacer(modifier = Modifier.height(calcDp(34.46)))

                    CreateTextWithIcon(
                        text = "Enter the same login info used for your SmartrProfile",
                        id = R.drawable.log_in,
                        contentDescriptionOfIcon = ""
                    )
                    Spacer(modifier = Modifier.height(calcDp(34.46)))

                    CreateTextWithIcon(
                        text = "If login details were saved, you may need to re-save.",
                        id = R.drawable.refresh,
                        contentDescriptionOfIcon = ""
                    )

                }
                Spacer(modifier = Modifier.height(calcDp(48.43)))

                Text(
                    text = "Why Smartr? Read here",
                    fontFamily = FontFamily(Font(R.font.poppins)),
                    fontSize = calcSp(10),
                    fontWeight = FontWeight.SemiBold,
                    color = Color(0xFFF4F4F4),
                    textAlign = TextAlign.Center
                )
                Spacer(modifier = Modifier.height(calcDp(8.99)))

                Button(
                    onClick = {},
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFFBFDBD1),
                        contentColor = Color(0xCC135B46)
                    ),
                    shape = RoundedCornerShape(30.dp),
                    modifier = Modifier
                        .width(calcDp(inDpI = 274))
                        .height(calcDp(inDpI = 42))
                ) {
                    Text(
                        text = "GET STARTED",
                        fontSize = calcSp(15),
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center
                    )
                }
            }
        }
    }
}

val percentageToMultiply = 1.15

@Composable
fun calcDp(inDp: Double = 0.0, inDpI: Int = 0): Dp {
    if (inDp == 0.0)return (inDpI * percentageToMultiply).dp
    return (inDp * percentageToMultiply).dp
}

@Composable
fun calcSp(spV: Int = 0): TextUnit {
    return (spV * percentageToMultiply).sp
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
                .width(calcDp(23.73))
                .height(calcDp(26.02)),
            tint = Color(0xFFF4F4F4)
        )

        Text(
            text = text,
            color = Color(0xFFF4F4F4),
            fontFamily = FontFamily(Font(R.font.poppins)),
            fontSize = calcSp(12),
            fontWeight = FontWeight.SemiBold,
            modifier = Modifier
                .height(calcDp(48.5))
                .width(calcDp(134.51))
                .padding(start = calcDp(16.33))
        )

    }

}