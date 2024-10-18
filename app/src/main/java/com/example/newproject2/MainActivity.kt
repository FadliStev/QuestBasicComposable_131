package com.example.newproject2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.newproject2.ui.theme.Newproject2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Newproject2Theme {
                // A surface container using the 'background' color from the theme
                Scaffold(
                    modifier = Modifier.fillMaxSize()) {innerPadding ->
                    BasicCompossable(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BasicCompossable(
    modifier: Modifier = Modifier
){
    Column (horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
    ){
        Text(
            text = "Login",
            style = TextStyle(
                fontSize = 70.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black
            ),
        )
        Text(
            text = "Ini adalah halaman login",
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp,
            )

        val imageModifier = Modifier
            .size(400.dp)
            .padding(20.dp)
        Image(
            painter = painterResource(id = R.drawable.umy),
            contentDescription = null,
            modifier = imageModifier
            )

        Text(
            text = "Nama",
            fontSize = 20.sp
            )
        
        Text(
            text = "Wiranto Akbar Fadlillah",
            fontSize = 20.sp,


        )

    }

}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Newproject2Theme {
        Greeting("Steven")
    }
}