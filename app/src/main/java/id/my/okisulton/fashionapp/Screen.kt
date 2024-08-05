package id.my.okisulton.fashionapp

/**
 *Created by osalimi on 30-07-2024.
 **/
sealed class Screen(val route: String) {
    data object Landing: Screen("landing_screen")
    data object Dashboard: Screen("dashboard_screen")
    data object Product: Screen("product_screen")
}