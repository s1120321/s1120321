package tw.edu.pu.csim.s1120321

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.sp
import tw.edu.pu.csim.s1120321.ui.theme.S1120321Theme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            S1120321Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "2024期末上機考(資管二B洪藝文)",
                        modifier = Modifier.padding(innerPadding)

                    )

                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {

    Box(
        Modifier
            .fillMaxSize()
            .background(Color.Yellow)

    )
        Column {
            Text("\n")
            Text(
                text = "2024期末上機考(資管二B洪藝文)",
                fontSize = 18.sp,
                color = Color.Black,
                modifier = modifier
            )
            Image(
                painter = painterResource(id = R.drawable.class_b),
                contentDescription = "圖片",
                modifier = Modifier
                    .clip(RectangleShape)

            )
            Text(
                text = "遊戲持續時間 0 秒",
                fontSize = 18.sp,
                color = Color.Black,
                modifier = modifier
            )
            Text(
                text = "您的成績 0 分",
                fontSize = 18.sp,
                color = Color.Black,
                modifier = modifier
            )
            Button(
                onClick = { },
            ) {
                Text(
                    text = "結束App"
                )

            }
        }
    }



@Composable
fun GreetingPreview() {
    S1120321Theme {
        Greeting("")
    }

}

