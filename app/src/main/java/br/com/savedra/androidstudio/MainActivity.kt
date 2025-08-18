package br.com.savedra.androidstudio

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import br.com.savedra.androidstudio.ui.theme.AndroidStudioTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidStudioTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Layout()
                }
            }
        }
    }
}

@Composable
fun Layout() {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier.fillMaxWidth()
        ) {
            Button(
                onClick = {},
                modifier = Modifier.fillMaxWidth()
            ) {}
            Button(
                onClick = {},
                modifier = Modifier.fillMaxWidth()
            ) {}
            Button(
                onClick = {},
                modifier = Modifier.fillMaxWidth()
            ) {}
        }
        Spacer(Modifier.height(8.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Button(
                onClick = {},
                modifier = Modifier.size(108.dp, 48.dp),
                colors = ButtonDefaults.buttonColors(Color(0xFFF44336))
            ) {}
            Button(
                onClick = {},
                modifier = Modifier.size(108.dp, 48.dp),
                colors = ButtonDefaults.buttonColors(Color(0xFFF44336))
            ) {}
            Button(
                onClick = {},
                modifier = Modifier.size(108.dp, 48.dp),
                colors = ButtonDefaults.buttonColors(Color(0xFFF44336))
            ) {}
        }
        Spacer(Modifier.height(8.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column {
                Button(
                    onClick = {},
                    modifier = Modifier.size(178.dp, 64.dp),
                    colors = ButtonDefaults.buttonColors(Color(0xFF03A9F4))
                ) {}
                Spacer(Modifier.height(8.dp))
                Button(
                    onClick = {},
                    modifier = Modifier.size(178.dp, 64.dp),
                    colors = ButtonDefaults.buttonColors(Color(0xFF03A9F4))
                ) {}
                Spacer(Modifier.height(8.dp))
                Button(
                    onClick = {},
                    modifier = Modifier.size(178.dp, 64.dp),
                    colors = ButtonDefaults.buttonColors(Color(0xFF03A9F4))
                ) {}
            }
            Spacer(Modifier.width(12.dp))
            Column {
                Button(
                    onClick = {},
                    modifier = Modifier.size(178.dp, 64.dp),
                    colors = ButtonDefaults.buttonColors(Color(0xFFFF9800))
                ) {}
                Spacer(Modifier.height(8.dp))
                Button(
                    onClick = {},
                    modifier = Modifier.size(178.dp, 64.dp),
                    colors = ButtonDefaults.buttonColors(Color(0xFFFF9800))
                ) {}
                Spacer(Modifier.height(8.dp))
                Button(
                    onClick = {},
                    modifier = Modifier.size(178.dp, 64.dp),
                    colors = ButtonDefaults.buttonColors(Color(0xFFFF9800))
                ) {}
            }
        }
    }
}