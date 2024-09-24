package com.example.assignment01

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class SecondPage : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Second()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Second() {
    Box(
        modifier = Modifier
            .clip(RoundedCornerShape(30.dp))
            .fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .background(Color(0x2E12AA73))
                .fillMaxSize()
        ) {
            Spacer(modifier = Modifier.height(60.dp))

            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .width(380.dp)
                    .height(45.dp)
                    .offset(16.dp)
            ) {
                Image(
                    painter = painterResource(R.drawable.ellipse),
                    contentDescription = "",
                    Modifier
                        .width(45.dp)
                        .height(45.dp)
                        .clip(CircleShape)
                )

                Image(
                    painter = painterResource(R.drawable.notification),
                    contentDescription = "",
                    Modifier
                        .width(24.dp)
                        .height(24.dp)
                        .offset(x = -31.dp)
                )
            }
            Spacer(Modifier.height(35.dp))
            var listDesigner: List<Pair> = listOf(
                Pair(type = Type.NONE, "Junior UX Designer"),
                Pair(type = Type.APPLIED, "Junior Product Designer"),
                Pair(type = Type.EXPRESS, "Middle motion Designer"),

                )
            CreateContainer("Designer", listDesigner)
            Spacer(Modifier.height(4.dp))
            var listAndroid: List<Pair> = listOf(
                Pair(type = Type.NONE, "Junior Android developer"),
                Pair(type = Type.EXPRESS, "Middle Android developer"),
                Pair(type = Type.EXPRESS, "Junior UX Designer"),

                )
            CreateContainer("Android", listAndroid)

        }
    }
}

@Composable
fun CreateContainer(name: String, pairs: List<Pair>) {
    Column(modifier = Modifier.offset(x = 16.dp)) {
        Text(
            text = name,
            fontSize = 12.sp,
            fontFamily = FontFamily(Font(R.font.poppins_semi_bold)),
            color = Color(0xFF434545),
            style = TextStyle(
                letterSpacing = 1.sp
            )
        )
        Spacer(Modifier.height(16.dp))
        for (pair in pairs) {
            println("Type: ${pair.type}, Title: ${pair.text}")
            CreateBox(pair.text, pair.type)
            Spacer(Modifier.height(16.dp))
        }

    }
}


@Composable
fun CreateBox(titleJob: String, type: Type) {
    Box(
        modifier = Modifier
            .width(380.dp)
            .height(103.dp)
            .clip(RoundedCornerShape(20.dp))
            .background(Color.White)
    ) {
        Box(modifier = Modifier.padding(start = 16.dp)) {
            Column(modifier = Modifier.offset(y = 17.dp)) {
                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Row {
                        Image(
                            painter = painterResource(R.drawable.rectangle),
                            contentDescription = "",
                            modifier = Modifier.size(35.dp)
                        )
                        Column(modifier = Modifier.offset(12.dp)) {
                            Text(
                                text = titleJob,
                                fontSize = 14.sp,
                                fontFamily = FontFamily(Font(R.font.poppins_semi_bold)),
                                color = Color(0xFF0D0D0D)
                            )
                            Text(
                                text = "Canva",
                                fontFamily = FontFamily(Font(R.font.poppins_regular)),
                                color = Color(0xFF434545),
                                fontSize = 12.sp,
                                style = TextStyle(
                                    letterSpacing = 0.25.sp,
                                    lineHeight = (12 * 1.3f).sp
                                )
                            )
                        }
                    }
                    doMark(type)
                }

                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier
                        .fillMaxWidth()
                        .offset(y = 11.dp)
                        .padding(end = 11.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .width(78.dp)
                            .height(24.dp)
                            .clip(RoundedCornerShape(30.dp))
                            .background(Color(0x2E12AA73)),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            "Paystack",
                            fontFamily = FontFamily(Font(R.font.poppins_regular)),
                            fontSize = 12.sp,
                            style = TextStyle(
                                letterSpacing = 0.25.sp,
                                lineHeight = (12 * 1.3f).sp, color = Color(0xFF53595F)
                            )
                        )
                    }

                    Text(
                        "\$40-60k/yearly",
                        fontFamily = FontFamily(Font(R.font.poppins_regular)),
                        style = TextStyle(
                            fontSize = 12.sp,
                            lineHeight = (12 * 1.3f).sp,
                            letterSpacing = 0.25.sp,
                            color = Color(0xFF53595F)
                        )

                    )

                }
            }
        }
    }
}

@Composable
fun doMark(type: Type) {
    if (type == Type.NONE) return
    var text = ""
    var icon = 0
    var width = 0
    var color: Color? = null;
    if (type == Type.APPLIED) {
        text = "Applied";
        icon = R.drawable.done_circular
        color = Color(0xFF07864B)
        width = 69
    } else {
        text = "Expires Soon"
        icon = R.drawable.info
        color = Color(0xFFDAA400)
        width = 93
    }
    Box(
        modifier = Modifier
            .width(width.dp)
            .height(20.dp)
            .background(color),
        contentAlignment = Alignment.Center
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Icon(
                painter = painterResource(icon), contentDescription = null, tint = Color.White
            )
            Text(
                text = text, fontSize = 10.sp,
                fontFamily = FontFamily(Font(R.font.poppins_semi_bold)),
                color = Color.White
            )
        }
    }

}

data class Pair(val type: Type, val text: String)

enum class Type {
    APPLIED, EXPRESS, NONE;
}












