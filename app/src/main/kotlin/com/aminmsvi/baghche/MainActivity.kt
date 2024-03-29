package com.aminmsvi.baghche

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.aminmsvi.baghche.ui.theme.BaghcheTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BaghcheTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background,
                ) {
                    Greeting("اندروید")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "سلام $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BaghcheTheme {
        Greeting("Android")
    }
}
