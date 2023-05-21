package com.example.assignment2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.assignment2.ui.theme.Assignment2Theme
import org.intellij.lang.annotations.JdkConstants

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Assignment2Theme {
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
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize().background(color = Color.LightGray)
    ) {
//        Spacer(Modifier.weight(4f).fillMaxHeight().background(Color.Green))
//        profile block
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Image(
                painter = painterResource(id = R.drawable.logo),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier.size(150.dp)
            )
            Text(
                text = "Usama Amjad",
                fontSize = 35.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(top = 8.dp)
            )
            Text(
                text = "Android App Developer",
                fontSize = 18.sp,
                fontWeight = FontWeight.ExtraBold,
                color = Color.DarkGray
            )
        }
        Spacer(Modifier.fillMaxHeight(0.30f))
        Column(
            verticalArrangement = Arrangement.Bottom,
//            modifier = Modifier.padding(bottom = 20.dp)
        ) {
            Row(
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier.padding(bottom = 6.dp)
            ) {
                Icon(
                    Icons.Rounded.Phone,
                    tint = Color.DarkGray,
                    contentDescription = null,
                    modifier = Modifier.padding(end = 8.dp).size(25.dp)
                )
                Text("+92 331 661 8558")
            }
            Row(
                modifier = Modifier.padding(bottom = 6.dp)
            ) {
                Icon(
                    Icons.Rounded.Share,
                    tint = Color.DarkGray,
                    contentDescription = null,
                    modifier = Modifier.padding(end = 8.dp).size(25.dp)
                )
                Text("Usama-Amjad")
            }
            Row {
                Icon(
                    Icons.Rounded.Email,
                    tint = Color.DarkGray,
                    contentDescription = null,
                    modifier = Modifier.padding(end = 8.dp).size(25.dp)
                )
                Text("usamamjad430@gmail.com",)
            }
        }
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Assignment2Theme {
        Greeting("Android")
    }
}