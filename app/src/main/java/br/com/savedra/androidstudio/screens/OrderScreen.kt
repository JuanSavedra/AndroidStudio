package br.com.savedra.androidstudio.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun OrderScreen(navController: NavController, ordersQuantity: String) {
    Box(
        modifier = Modifier.fillMaxSize()
            .background(Color(0xFFAFA9A9))
            .padding(32.dp)
    ) {
        Text(
            text = "PEDIDOS - $ordersQuantity",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = Color.White
        )
        Card (
            modifier = Modifier.fillMaxWidth()
                .padding(top = 32.dp)
        ) {
            Button(
                onClick = {},
                modifier = Modifier.fillMaxWidth()
                    .padding(12.dp),
                colors = ButtonDefaults.buttonColors(Color.White)
            ) {
                Text(
                    text = "Tênis",
                    fontSize = 20.sp,
                    color = Color.Black
                )
            }
            Button(
                onClick = {},
                modifier = Modifier.fillMaxWidth()
                    .padding(12.dp),
                colors = ButtonDefaults.buttonColors(Color.White)
            ) {
                Text(
                    text = "Roupas",
                    fontSize = 20.sp,
                    color = Color.Black
                )
            }
        }
        Button(
            onClick = { navController.navigate("menu") },
            colors = ButtonDefaults.buttonColors(Color.White),
            modifier = Modifier.align(Alignment.Center)
        ) {
            Text(
                text = "Voltar",
                fontSize = 20.sp,
                color = Color.Blue
            )
        }
    }
}