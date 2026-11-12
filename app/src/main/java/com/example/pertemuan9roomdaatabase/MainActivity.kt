package com.example.pertemuan9roomdaatabase

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.Modifier
import androidx.compose.runtime.Composable
import com.example.pertemuan9roomdaatabase.ui.theme.Pertemuan9RoomDaataBaseTheme
import com.example.pertemuan9roomdaatabase.uicontroller.SiswaApp

@Composable
fun RoomSiswaTheme(content: @Composable () -> Unit) {
    Pertemuan9RoomDaataBaseTheme(content = content)
}

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RoomSiswaTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    SiswaApp()
                }
            }
        }
    }
}
