package br.com.savedra.androidstudio

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.savedra.androidstudio.ui.theme.AndroidStudioTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AndroidStudioTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    MyComponent(innerPadding)
                }
            }
        }
    }
}

@Composable
fun MyComponent(innerPadding: PaddingValues) {
    Column(modifier = Modifier.padding(32.dp).fillMaxWidth()) {
        Text(text = "Pressione os botões para informar sua idade.")
        Row {
            Button(onClick = {}) { Text(text = "-") }
            Button(onClick = {}) { Text(text = "+") }
        }
    }
}

@Composable
fun ComponentForPreview() {
    Text(text = "Pressione os botões para informar sua idade.")
    Row {
        Button(onClick = {}) { Text(text = "-") }
        Button(onClick = {}) { Text(text = "+") }
    }
}

@Preview (showBackground = true, showSystemUi = true)
@Composable
fun MyComponentPreview() {
    ComponentForPreview()
}