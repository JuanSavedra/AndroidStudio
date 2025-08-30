package br.com.savedra.androidstudio

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.AnimatedContentScope
import androidx.compose.animation.AnimatedContentTransitionScope
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.NavType
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
                        exitTransition = {
                            slideOutOfContainer(
                                towards = AnimatedContentTransitionScope.SlideDirection.End,
                                tween(1000)
                            ) + fadeOut(
                                animationSpec = tween(1000)
                            )
                        },
                        enterTransition = {
                            slideIntoContainer(
                                towards = AnimatedContentTransitionScope.SlideDirection.Down,
                                animationSpec = tween(500)
                            ) + fadeIn(
                                animationSpec = tween(500)
                            )
                        }
                    ) {
                        composable(route = "login") {
                            LoginScreen(navController)
                        }
                        composable(route = "menu") {
                            MenuScreen(navController)
                        }
                        composable(
                            route = "profile/{name}/{age}",
                            arguments = listOf(
                                navArgument(name = "name") {
                                    type = NavType.StringType
                                },
                                navArgument(name = "age") {
                                    type = NavType.IntType
                                }
                            )
                        ) {
                            val name = it.arguments?.getString("name")
                            val age = it.arguments?.getInt("age")
                            ProfileScreen(
                                navController,
                                name!!,
                                age!!
                            ) //Double bang
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