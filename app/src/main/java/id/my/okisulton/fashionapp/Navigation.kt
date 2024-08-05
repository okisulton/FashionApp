package id.my.okisulton.fashionapp

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import id.my.okisulton.fashionapp.screens.DashboardScreen
import id.my.okisulton.fashionapp.screens.LandingScreen
import id.my.okisulton.fashionapp.screens.ProductScreen

/**
 *Created by osalimi on 30-07-2024.
 **/
@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.Landing.route) {
        composable(route = Screen.Landing.route) {
            LandingScreen(navController = navController)
        }
        composable(route = Screen.Dashboard.route) {
            DashboardScreen(navController = navController)
        }
        composable(route = Screen.Product.route) {
            ProductScreen(navController = navController)
        }
    }
}