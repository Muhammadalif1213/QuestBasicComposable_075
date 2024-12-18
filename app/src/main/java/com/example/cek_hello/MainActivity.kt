package com.example.cek_hello

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cek_hello.ui.theme.Cek_HelloTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Cek_HelloTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    BasicCompose(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}
@Preview(showBackground = true)
@Composable
fun BasicCompose(
    modifier: Modifier = Modifier
){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        Text(
            text = "Indonesia",
            style = TextStyle(
                fontSize = 50.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Red

            )
        )
        Text(
            text = "0",
            fontWeight = FontWeight.Bold,
            fontSize = 25.sp
        )
        Image(painter = painterResource(id = R.drawable.logo),
            contentDescription = null,
             modifier = Modifier.size(300.dp)
        )
        Text(
            text = "Nama",
            style = TextStyle(
                fontWeight = FontWeight.Bold,
                color = Color(0xFF04569F),
                fontSize = 30.sp,
                fontFamily = FontFamily.Cursive,
                letterSpacing = 2.sp,
                shadow = Shadow(
                    color = Color.Gray,
                    offset = Offset(2f, 2f),
                    blurRadius = 10f
                )
            )
        )
        Text(
            text = "Muhammad Alifian Aqilah",
            style = TextStyle(
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF04569F)
            )
        )
        Text(
            text = "20220140075",
            style = TextStyle(
                fontWeight = FontWeight.Bold,
                color = Color.Gray,
                fontSize = 20.sp
            )
        )
        Image(painter = painterResource(id = R.drawable.img),
            contentDescription = null,
            modifier = Modifier
                .padding(top = 16.dp)
                .size(250.dp)
                .clip(RoundedCornerShape(100.dp))
        )
    }

}
