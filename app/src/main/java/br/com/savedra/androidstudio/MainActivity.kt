package br.com.savedra.androidstudio

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.savedra.androidstudio.ui.theme.AndroidStudioTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AndroidStudioTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    AgeCounter()
                }
            }
        }
    }
}

@Composable
fun AgeCounter() {
    var age = 0

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFFAD1F4E),
            text = "Diga sua idade."
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            text = "Sua idade é de: ${age} anos!"
        )
        Spacer(modifier = Modifier.height(16.dp))
        Row {
            Button(
                onClick = { age-- },
                modifier = Modifier.size(72.dp),
                shape = RoundedCornerShape(8.dp),
                colors = ButtonDefaults.buttonColors(Color(0xFF3F51B5))
            ) {
                Text(text = "-", fontSize = 40.sp)
            }
            Spacer(modifier = Modifier.width(32.dp))
            Button(
                onClick = { age++ },
                modifier = Modifier.size(72.dp),
                shape = RoundedCornerShape(8.dp),
                colors = ButtonDefaults.buttonColors(Color(0xFF3F51B5))
            ) {
                Text(text = "+", fontSize = 40.sp)
            }
        }
    }
}