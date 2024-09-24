package com.example.assignment01

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
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
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

class FourthPage {
}

@Preview(showBackground = true)
@Composable
fun Fourth() {
    Box(
        Modifier
            .padding(11.dp)
            .fillMaxSize(),
    ) {
        Column(Modifier.fillMaxSize()) {

            Row(
                Modifier
                    .height(44.dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    "9:41",
                    style = TextStyle(
                        fontFamily = FontFamily(Font(R.font.poppins_semi_bold)),
                        fontSize = 15.sp,
                        letterSpacing = -0.3.sp,
                    )
                )
                Row(Modifier.width(66.66.dp), horizontalArrangement = Arrangement.SpaceBetween) {
                    Icon(
                        painter = painterResource(R.drawable.net),
                        contentDescription = null
                    )
                    Icon(
                        painter = painterResource(R.drawable.wifi),
                        contentDescription = null
                    )
                    Icon(
                        painter = painterResource(R.drawable.battery),
                        contentDescription = null
                    )
                }
            }


            Spacer(Modifier.height(24.dp))
            Row(
                Modifier
                    .fillMaxWidth()
                    .height(37.dp),
                horizontalArrangement = Arrangement.End
            ) {
                Row(
                    Modifier
                        .width(214.dp)
                        .fillMaxHeight(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        text = "Profile",
                        style = TextStyle(
                            fontFamily = FontFamily(Font(R.font.poppins_regular)),
                            fontSize = 24.sp,
                            letterSpacing = 0.12.sp,
                            lineHeight = 24.sp
                        )
                    )

                    Icon(
                        painter = painterResource(R.drawable.settings),
                        contentDescription = null,
                        Modifier.size(24.dp).offset(x = -2.dp)
                    )
                }
            }



            Column(
                Modifier
                    .width(380.dp)
                    .height(254.dp)
            ) {
                Row(
                    Modifier
                        .height(100.dp)
                        .fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Image(
                        painter = painterResource(R.drawable.ava),
                        contentDescription = null,
                        Modifier
                            .fillMaxHeight()
                            .width(100.dp)
                            .clip(CircleShape)
                    )

                    textWithNum("Followers", "2156")
                    textWithNum("Following", "567")
                    textWithNum("News", "23")


                }

                CreateWith16("Wilson Franci")
                Text(
                    text = "Lorem Ipsum is simply dummy text of the printing and typesetting industry.",
                    style = TextStyle(
                        fontFamily = FontFamily(Font(R.font.poppins_regular)),
                        fontSize = 16.sp,
                        lineHeight = 24.sp,
                        letterSpacing = 0.12.sp
                    )
                )
                Spacer(Modifier.height(16.dp))
                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    CreateButton("Edit profile")
                    CreateButton("Website")
                }
                Spacer(Modifier.height(13.dp))


            }
            Column {
                CreatePost(
                    R.drawable.news1,
                    "NFTs",
                    "Minting Your First NFT: A Beginner’s Guide to Creating...",
                    "15m ago"
                )
                Spacer(Modifier.height(13.dp))
                CreatePost(
                    R.drawable.news2,
                    "Business",
                    "5 things to know before the stock market opens Monday",
                    "1h ago"
                )
                Spacer(Modifier.height(13.dp))

                CreatePost(
                    R.drawable.news3,
                    "Travel",
                    "Bali plans to reopen to international tourists in Septe...",
                    "1w ago"
                )
                Spacer(Modifier.height(13.dp))

                CreatePost(
                    R.drawable.news4,
                    "Health",
                    "Healthy Living: Diet and Exercise Tips & Tools for Success.",
                    "4h ago"
                )
            }
        }

    }
}

@Composable
fun CreatePost(
    id: Int, title: String, content: String,
    time: String
) {
    Box(Modifier
        .fillMaxWidth()
        .height(124.dp)) {
        Row(Modifier
            .fillMaxSize(), verticalAlignment = Alignment.CenterVertically) {
            Image(
                painter = painterResource(id), contentDescription = null,
                Modifier.size(128.dp).padding(8.dp).clip(RoundedCornerShape(10.dp))
            )
            Column (Modifier.width(264.dp).height(100.dp).offset(y = -6.dp),
                verticalArrangement = Arrangement.SpaceBetween){
                Text(title,
                    style = TextStyle(
                        fontFamily = FontFamily(Font(R.font.poppins_regular)),
                        fontSize = 13.sp,
                        lineHeight = 19.5.sp,
                        letterSpacing = 0.12.sp,
                        color = Color(0xFF4E4B66)
                    ))
                Box (Modifier.height(48.dp)){
                    Text(
                        content,
                        style = TextStyle(
                            fontFamily = FontFamily(Font(R.font.poppins_regular)),
                            fontSize = 16.sp,
                            lineHeight = 24.sp,
                            letterSpacing = 0.12.sp,
                        )
                    )
                }



                Row (horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier.fillMaxWidth().height(20.dp).offset(y = 7.dp)){
                    Row (Modifier.width(197.dp),
                        horizontalArrangement = Arrangement.SpaceBetween){
                        Image(painter = painterResource(R.drawable.ava),
                            contentDescription = null)
                        Text("Wilson Franci",
                            style = TextStyle(
                                fontSize = 13.sp,
                                fontFamily = FontFamily(Font(R.font.poppins_semi_bold)),
                                letterSpacing = 0.12.sp,
                                lineHeight = 19.5.sp,
                                color = Color(0xFF4E4B66)
                            ))
                        Icon(painter = painterResource(R.drawable.time),
                            contentDescription = null,Modifier.size(14.dp).offset(
                                y = 3.dp
                            ))

                        Text(text = time,
                            style = TextStyle(
                                fontFamily = FontFamily(Font(R.font.poppins_regular)),
                                fontSize = 13.sp,
                                letterSpacing = 0.12.sp,
                                lineHeight = 19.5.sp,
                                color = Color(0xFF4E4B66)
                            )
                        )

                    }
                    Icon(painter = painterResource(R.drawable.doticon),
                        contentDescription = null, tint = Color(0xFF4E4B66),
                        modifier = Modifier.offset(x = -5.dp, y = 3.8.dp))

                }




            }
        }
    }
}


@Composable
fun CreateButton(text: String) {
    Button(
        onClick = {}, Modifier
            .clip(RoundedCornerShape(6.dp))
            .width(182.dp)
            .height(50.dp)
            .background(Color(0xFF1877F2)),
        colors = ButtonDefaults.buttonColors(
            containerColor = Color(0xFF1877F2)
        )

    ) {
        Text(
            text = text,
            style = TextStyle(
                fontFamily = FontFamily(Font(R.font.poppins_semi_bold)),
                fontSize = 16.sp,
                lineHeight = 24.sp,
                letterSpacing = 0.12.sp,
                color = Color.White
            )
        )
    }
}


@Composable
fun textWithNum(text: String, number: String) {
    Column(
        Modifier.height(52.dp), verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        CreateWith16(number)
        Text(
            text = text,
            style = TextStyle(
                fontFamily = FontFamily(Font(R.font.poppins_regular)),
                fontSize = 16.sp,
                lineHeight = 24.sp,
                letterSpacing = 0.12.sp
            )
        )
    }
}


@Composable
fun CreateWith16(text: String) {
    Text(
        text = text,
        style = TextStyle(
            fontFamily = FontFamily(Font(R.font.poppins_semi_bold)),
            fontSize = 16.sp,
            lineHeight = 24.sp,
            letterSpacing = 0.12.sp
        )
    )
}

