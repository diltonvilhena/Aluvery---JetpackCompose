package com.example.aluvery.components

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.aluvery.ui.theme.AluveryTheme


class TestComponents : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AluveryTheme {
                MyFirstComposable()
            }
        }
    }
}


//utilizado para linhas na horizontal
@Preview(showBackground = true)
@Composable
fun RowPreview() {
    Column(
        Modifier
            .background(color = Color.Red)
            .padding(all = 10.dp)
    ) {
        Text(text = "Texto 1")
        Text(text = "Texto 2")

        Row(
            Modifier.background(color = Color.Green)
        ) {
            Text(text = "Texto 3")
            Text(text = "Texto 4")
        }
    }

}

@Preview(showBackground = true)
@Composable
fun MyFirstComposable() {

    Row(
        Modifier
            .fillMaxWidth()
            .height(150.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxHeight()
                .background(Color.Blue)
                .width(50.dp)
        )

        Column(
            Modifier
                .fillMaxWidth()
                .background(Color(0xFFededed))
        ) {
            Text(text = "Test 1",Modifier.padding(16.dp))
            Text(text = "Test 2",Modifier.padding(16.dp))
        }
    }



    @Composable
    fun MyFirstComposablePreview() = AluveryTheme {
        Surface {
            MyFirstComposable()
        }
    }
}





