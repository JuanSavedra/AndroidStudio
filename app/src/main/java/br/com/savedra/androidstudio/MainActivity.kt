package br.com.savedra.androidstudio

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import br.com.savedra.androidstudio.screens.LoginScreen
import br.com.savedra.androidstudio.screens.MenuScreen
import br.com.savedra.androidstudio.screens.OrderScreen
import br.com.savedra.androidstudio.screens.ProfileScreen
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
                    val navController = rememberNavController()
                    NavHost(
                        navController = navController,
                        startDestination = "login",
                    ) {
                        composable(route = "login") {
                            LoginScreen(navController)
                        }
                        composable(route = "menu") {
                            MenuScreen(navController)
                        }
                        composable(route = "profile/{name}") {
                            val name = it.arguments?.getString("name")
                            ProfileScreen(navController, name!!) //Double bang
                        }
                        composable(
                            route = "orders?ordersQuantity={ordersQuantity}",
                            arguments = listOf(navArgument(name = "ordersQuantity") {
                                defaultValue = "2"
                            })
                        ) {
                            val ordersQuantity = it.arguments?.getString("ordersQuantity")
                            OrderScreen(
                                navController,
                                ordersQuantity!!
                            )
                        }
                    }
                }
            }
        }
    }
}