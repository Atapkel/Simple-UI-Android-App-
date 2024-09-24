package com.example.assignment01

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Space
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.ContentView
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.HorizontalDivider
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

class ThirdPage : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContent {
//            Third()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Third() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFBFDBD1))
    ) {

        Box(
            Modifier
                .background(Color.White)
                .fillMaxWidth()
                .height(249.dp),
            contentAlignment = Alignment.Center
        ) {
            Column(
                Modifier
                    .width(363.dp)
                    .fillMaxHeight()
            ) {
                Spacer(Modifier.height(32.dp))
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Image(
                        painter = painterResource(R.drawable.arrow_back),
                        contentDescription = null,
                        modifier = Modifier.size(24.dp)
                    )
            HorizontalDivider(

            )
                    Image(
                        painter = painterResource(R.drawable.favorite_border_24px),
                        contentDescription = null,
                        modifier = Modifier.size(24.dp)
                    )
                }
                Spacer(Modifier.height(24.dp))
                Column(
                    Modifier
                        .background(Color.White)
                        .fillMaxSize()
                ) {
                    Image(
                        painter = painterResource(R.drawable.rectangle), contentDescription = null,
                        Modifier.size(60.dp)
                    )
                    Spacer(Modifier.height(5.dp))

                    Text(
                        "Junior UX Designer",
                        Modifier.offset(y = 5.dp),
                        style = TextStyle(
                            fontFamily = FontFamily(Font(R.font.poppins_semi_bold)),
                            fontSize = 24.sp,
                            lineHeight = 26.4.sp,
                        )
                    )
                    Spacer(Modifier.height(5.dp))
                    Text(
                        "Canva ",
                        Modifier.offset(y = 5.dp),
                        style = TextStyle(
                            fontFamily = FontFamily(Font(R.font.poppins_semi_bold)),
                            fontSize = 14.sp,
                            lineHeight = 15.4.sp,
                        )
                    )
                    Spacer(Modifier.height(5.dp))
                    Text(
                        "Posted on 3 March ",
                        Modifier
                            .padding(bottom = 5.dp)
                            .offset(y = 5.dp),
                        style = TextStyle(
//                        fontFamily = FontFamily(Font(R.font.poppins_regular)),
                            fontSize = 12.sp,
                            lineHeight = 13.2.sp,
                        )
                    )
                }
            }
            Spacer(Modifier.height(20.dp))
        }

        Spacer(Modifier.height(5.dp))


        Box(
            Modifier
                .background(Color.White)
                .fillMaxWidth()
                .height(153.dp),
            contentAlignment = Alignment.Center
        ) {

            Column(
                Modifier
                    .width(363.dp)
                    .fillMaxHeight()
            ) {
                Row(
                    Modifier
                        .height(76.5.dp)
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Column(
                        Modifier
                            .fillMaxHeight()
                            .width(181.5.dp),
                        verticalArrangement = Arrangement.SpaceBetween,
                    ) {


                        description("APPLY BEFORE")
                        Spacer(Modifier.height(10.dp))
                        Text(
                            "03 June, 2022",
                            style = TextStyle(
                                fontSize = 12.sp,
                                fontFamily = FontFamily(Font(R.font.poppins_regular)),
                            )
                        )
                    }
                    Column(
                        Modifier
                            .fillMaxHeight()
                            .width(181.5.dp)
                    ) {
                        description("JOB NATURE")
                        Spacer(Modifier.height(10.dp))

                        Box(
                            modifier = Modifier
                                .clip(RoundedCornerShape(30.dp))
                                .background(Color(0xFFBFDBD1))
                                .width(70.dp)
                                .height(20.dp),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                "Full-time",
                                style = TextStyle(
                                    fontSize = 12.sp,
                                    fontFamily = FontFamily(Font(R.font.poppins_regular)),
                                )
                            )
                        }
                    }
                }
                Spacer(Modifier.height(10.dp))
                Row(
                    Modifier
                        .height(76.5.dp)
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Column(
                        Modifier
                            .fillMaxHeight()
                            .width(181.5.dp)
                            .offset(y = -17.dp)
                    ) {

                        description("SALARY RANGE")
                        Spacer(Modifier.height(10.dp))
                        Text(
                            "40k - 60k/yearly",
                            style = TextStyle(
                                fontSize = 12.sp,
                                fontFamily = FontFamily(Font(R.font.poppins_regular)),
                            )
                        )


                    }
                    Column(
                        Modifier
                            .fillMaxHeight()
                            .width(181.5.dp)
                            .offset(y = -17.dp)
                    ) {
                        description("JOB LOCATION")
                        Spacer(Modifier.height(10.dp))
                        Text(
                            "Work from anywhere",
                            style = TextStyle(
                                fontSize = 12.sp,
                                fontFamily = FontFamily(Font(R.font.poppins_regular)),
                            )
                        )
                    }
                }
            }
        }


        Spacer(Modifier.height(5.dp))
















        Box(
            Modifier
                .background(Color.White)
                .fillMaxWidth()
                .height(238.dp),
            contentAlignment = Alignment.Center
        ) {
            Column(
                Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
                    .padding(15.dp)
            ) {

                Text(
                    "JOB DESCRIPTION ",
                    style = TextStyle(
                        fontSize = 12.sp,
                        fontFamily = FontFamily(Font(R.font.poppins_semi_bold)),
                        lineHeight = 15.6.sp,
                        letterSpacing = 0.25.sp,
                        color = Color(0XFF434545)
                    )
                )
                Spacer(Modifier.height(16.dp))

                Text(
                    "Can you bring creative human-centered ideas to life and make great things happen beyond what meets the eye?\n" +
                            "We believe in teamwork, fun, complex projects, diverse perspectives, and simple solutions. How about you? We're looking for a like-minded",
                    style = TextStyle(
                        fontSize = 14.sp,
                        fontFamily = FontFamily(Font(R.font.poppins_regular)),
                        lineHeight = 20.3.sp
                    )
                )
                Spacer(Modifier.height(25.dp))
                Row(horizontalArrangement = Arrangement.Center) {
                    Text(
                        text = "See more ",
                        fontFamily = FontFamily(Font(R.font.poppins_semi_bold)),
                        color = Color(0xFF0FAC74),
                        style = TextStyle(
                            lineHeight = 15.6.sp,
                            letterSpacing = 0.25.sp
                        )
                    )

                    Icon(
                        painter = painterResource(R.drawable.dropdown),
                        contentDescription = null,
                        Modifier
                            .width(9.dp)
                            .height(6.dp)
                            .offset(y = 4.dp), tint = Color(0xFF0FAC74)
                    )

                }
            }

        }
        Spacer(Modifier.height(5.dp))

















        Box(
            Modifier
                .background(Color.White)
                .fillMaxWidth()
                .height(213.dp),
            contentAlignment = Alignment.Center
        ) {
            Column(
                Modifier
                    .width(363.dp)
                    .fillMaxHeight()
            ) {
                Spacer(Modifier.height(24.dp))

                Text("ROLES AND RESPONSIBILITIES",
                    style = TextStyle(
                        fontFamily = FontFamily(Font(R.font.poppins_semi_bold)),
                        color = Color(0xFF434545),
                        lineHeight = 13.2.sp,
                        fontSize = 12.sp
                    ))
                Spacer(Modifier.height(16.dp))
                val list: List<String> = listOf(
                    "Drive the design process with cross-functional partners and design leads.",
                    "Design new experiences and patterns in a complex ecosystem and across platforms.",
                    "Partner with UX Research and Content Strategists through the design process.",
                    "Work closely with Product and Engineering to ensure a high quality implementation."
                )
                for(text in list){
                    CreateWithDot(text)
                }


            }

        }

    }
}

@Composable
fun description(text: String) {
    Spacer(Modifier.height(24.dp))
    Text(
        text = text,
        style = TextStyle(
            fontSize = 12.sp,
            fontFamily = FontFamily(Font(R.font.poppins_semi_bold)),
            color = Color(0xFF434545)
        )
    )
}


@Composable
fun CreateWithDot(text : String) {

    Row {
        Text("•", fontSize = 22.sp)
        Spacer(Modifier.width(11.dp))
        Text(
            text = text,
            fontSize = 14.sp,
            lineHeight = 19.6.sp,
            fontFamily = FontFamily(Font(R.font.poppins_regular))
        )
    }
}
