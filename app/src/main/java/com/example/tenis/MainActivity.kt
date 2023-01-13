package com.example.tenis

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tenis.ui.theme.TenisTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TenisTheme {
                MainScreen()
            }
        }
    }
}


@Composable
fun MainScreen() {
    Design()
}

@Composable
fun Design() {
    Surface(
        color = Color.White,
        modifier = Modifier
            .fillMaxSize()
    ) {
        Column() {
            NavigationBar("Tenis app")
            MiddleScreen("2023", "January")
            BottomNavigation()
        }
    }
}

@Composable
fun NavigationBar(info: String) {
    Surface(
        color = Color.LightGray,
        modifier = Modifier
            .height(50.dp)
            .fillMaxWidth()
    )
    {
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.Top
        ) {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(imageVector = Icons.Filled.ArrowBack, contentDescription = "Back")
            }
            Text(
                text = info,
                style = MaterialTheme.typography.h4,
//                textAlign = TextAlign.Center,
            )
            IconButton(onClick = { /*TODO*/ }) {
                Icon(imageVector = Icons.Filled.Settings, contentDescription = "Back")
            }
        }
    }
}

@Composable
fun MiddleScreen(year: String, month: String) {
    Surface(
        modifier = Modifier
            .height(650.dp)
            .fillMaxWidth()
    )
    {
        Column(
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.padding(8.dp)
        ) {
            Text(
                text = year,
                style = MaterialTheme.typography.h1,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(top = 32.dp)
            )
            Text(
                text = "-$month-",
                style = MaterialTheme.typography.h3,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(32.dp)
            )
            Text(
                text = "Wins: 22",
                style = MaterialTheme.typography.h5,
                textAlign = TextAlign.Center,
                        modifier = Modifier.padding(16.dp)
            )
            Text(
                text = "Losses: 4",
                style = MaterialTheme.typography.h5,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(16.dp)
            )
            Text(
                text = "Total: 26",
                style = MaterialTheme.typography.h5,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(16.dp)
            )
        }
    }
}

@Composable
fun BottomNavigation() {
    Surface(
        color = Color.LightGray,
        modifier = Modifier
            .height(100.dp)
            .fillMaxWidth()
    )
    {
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.border(border = BorderStroke(1.dp, SolidColor(Color.Black)))
        ) {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(imageVector = Icons.Filled.Add, contentDescription = "Add")
            }
            Text(
                text = "Matches",
                style = MaterialTheme.typography.h6,
                textAlign = TextAlign.Center
            )
            Text(
                text = "Calender",
                style = MaterialTheme.typography.h6,
                textAlign = TextAlign.Center
            )
            IconButton(onClick = { /*TODO*/ }) {
                Icon(imageVector = Icons.Filled.Info, contentDescription = "Info")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    TenisTheme {
        MainScreen()
    }
}