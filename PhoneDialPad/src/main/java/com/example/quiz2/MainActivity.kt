package com.example.quiz2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.quiz2.ui.theme.Quiz2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Quiz2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(color = Color(red = 0x4E, green = 0xA6, blue = 0x2E, alpha = 0XFF))
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp, 15.dp, 15.dp, 10.dp)
            ) {
                Text(text = "Phone", fontWeight = FontWeight.Bold, fontSize = 20.sp, color = Color.White)
                Spacer(modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth())
                Text(text = "More", fontWeight = FontWeight.Bold, fontSize = 20.sp, color = Color.White)
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp, 15.dp, 15.dp, 10.dp)
            ) {
                Text(text = "Recent", fontWeight = FontWeight.Bold, fontSize = 20.sp, color = Color.White)
                Spacer(modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth())
                Text(text = "Favourite", fontWeight = FontWeight.Bold, fontSize = 20.sp, color = Color.White)
                Spacer(modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth())
                Text(text = "Contacts", fontWeight = FontWeight.Bold, fontSize = 20.sp, color = Color.White)
            }

        }
        Spacer(modifier = Modifier
            .weight(1f)
            .fillMaxWidth())
        Column(
            modifier=Modifier.fillMaxWidth()
        ) {
            Row(
                modifier=Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center) {
                Text("1", modifier = Modifier
                    .padding(12.dp)
                    .fillMaxWidth(0.3f), fontSize = 36.sp, textAlign = TextAlign.Center)
                Text("2", modifier = Modifier
                    .padding(12.dp)
                    .fillMaxWidth(0.5f), fontSize = 36.sp, textAlign = TextAlign.Center)
                Text("3", modifier = Modifier
                    .padding(12.dp)
                    .fillMaxWidth(1f), fontSize = 36.sp, textAlign = TextAlign.Center)

            }
            Row(
                modifier=Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center) {
                Text("4", modifier = Modifier
                    .padding(12.dp)
                    .fillMaxWidth(0.3f), fontSize = 36.sp, textAlign = TextAlign.Center)
                Text("5", modifier = Modifier
                    .padding(12.dp)
                    .fillMaxWidth(0.5f), fontSize = 36.sp, textAlign = TextAlign.Center)
                Text("6", modifier = Modifier
                    .padding(12.dp)
                    .fillMaxWidth(1f), fontSize = 36.sp, textAlign = TextAlign.Center)

            }
            Row(
                modifier=Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center) {
                Text("7", modifier = Modifier
                    .padding(12.dp)
                    .fillMaxWidth(0.3f), fontSize = 36.sp, textAlign = TextAlign.Center)
                Text("8", modifier = Modifier
                    .padding(12.dp)
                    .fillMaxWidth(0.5f), fontSize = 36.sp, textAlign = TextAlign.Center)
                Text("9", modifier = Modifier
                    .padding(12.dp)
                    .fillMaxWidth(1f), fontSize = 36.sp, textAlign = TextAlign.Center)

            }
            Row(
                modifier=Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center) {
                Text("  0", modifier = Modifier
                    .padding(12.dp)
                    .fillMaxWidth(0.3f), fontSize = 36.sp, textAlign = TextAlign.Center)
            }
            Row(
                modifier=Modifier.fillMaxWidth().padding(15.dp),
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically) {
                Icon(
                    tint = Color.Black,
                    imageVector = Icons.Rounded.Email,
                    contentDescription =null,
                    modifier = Modifier
                        .padding(end = 8.dp, bottom = 10.dp)
                        .size(40.dp))

                Row(
                    horizontalArrangement = Arrangement.SpaceEvenly,
                    modifier=Modifier.clip(RoundedCornerShape(30.dp)).width(100.dp).background(
                    color = Color(red = 0x4E, green = 0xA6, blue = 0x2E, alpha = 0XFF)
                    ).padding(top = 10.dp)
                ) {
                    Icon(
                        tint = Color.White,
                        imageVector = Icons.Rounded.Phone,
                        contentDescription = null,
                        modifier = Modifier
                            .padding(end = 8.dp, bottom = 10.dp)
                            .size(40.dp)

                    )
                }
                Icon(
                    tint = Color.Black,
                    imageVector = Icons.Rounded.Email,
                    contentDescription =null,
                    modifier = Modifier
                        .padding(end = 8.dp, bottom = 10.dp)
                        .size(40.dp))

            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Quiz2Theme {
        Greeting("Android")
    }
}