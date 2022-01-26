package com.funnycop.lowescodingexercise.ui.composable

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.funnycop.lowescodingexercise.ui.theme.LowesCodingExerciseTheme

@Composable
fun NavigationController() {

    val navController = rememberNavController()

    NavHost(navController, "CityLookup") {

        composable("CityLookup") { CityLookup(navController) }

        composable("WeatherInformation") { WeatherInformation(navController) }

    }

}

@Preview(showBackground = true)
@Composable
private fun Preview() {
    LowesCodingExerciseTheme {
        NavigationController()
    }
}