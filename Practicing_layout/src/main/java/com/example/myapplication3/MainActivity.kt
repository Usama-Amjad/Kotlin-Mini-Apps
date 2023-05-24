package com.example.myapplication3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.focusGroup
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication3.ui.theme.MyApplication3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplication3Theme {
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
    Row() {
        Column(
            modifier = Modifier.weight(1f).fillMaxHeight(0.5f).background(Color(0xFFEADDFF)).padding(16.dp,16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                "Text Composable",
                fontWeight = FontWeight.Bold,
                fontSize =14.sp,
                modifier = Modifier.padding(0.dp,0.dp,0.dp,16.dp)
            )
            Text("Displays text and follows the recommended Material Design guidelines.",textAlign = TextAlign.Justify)
        }
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.weight(1f).fillMaxHeight(0.5f).background(Color(0xFFD0BCFF)).padding(16.dp,16.dp),
        ) {
            Text(
                "Image composable",
                fontWeight = FontWeight.Bold,
                fontSize =14.sp,
                modifier = Modifier.padding(0.dp,0.dp,0.dp,16.dp),
            )
            Text("Creates a composable that lays out and draws a given Painter class object.",textAlign = TextAlign.Justify)
        }
    }
    Row(
       verticalAlignment = Alignment.Bottom
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.weight(1f).fillMaxHeight(0.5f).background(Color(0xFFB69DF8)).padding(16.dp,16.dp),
        ) {
            Text(
                "Row composable",
                fontWeight = FontWeight.Bold,
                fontSize =14.sp,
                modifier = Modifier.padding(0.dp,0.dp,0.dp,16.dp)
            )
            Text("A layout composable that places its children in a horizontal sequence.",textAlign = TextAlign.Justify)
        }
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.weight(1f).fillMaxHeight(0.5f).background(Color(0xFFF6EDFF)).padding(16.dp,16.dp)
        ) {
            Text(
                "Column composable",
                fontWeight = FontWeight.Bold,
                fontSize =14.sp,
                modifier = Modifier.padding(0.dp,0.dp,0.dp,16.dp),
            )
            Text("A layout composable that places its children in a vertical sequence.",textAlign = TextAlign.Justify)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyApplication3Theme {
        Greeting("Android")
    }
}