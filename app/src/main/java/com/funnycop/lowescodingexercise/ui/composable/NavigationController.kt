package com.funnycop.lowescodingexercise.ui.composable

import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.funnycop.lowescodingexercise.ui.theme.DarkCornflowerBlue
import com.funnycop.lowescodingexercise.util.CITY_LOOKUP_DESTINATION
import com.funnycop.lowescodingexercise.util.WEATHER_DETAIL_DESTINATION
import com.funnycop.lowescodingexercise.util.WEATHER_LIST_DESTINATION
import com.funnycop.lowescodingexercise.viewmodel.WeatherViewModel
import com.google.accompanist.systemuicontroller.rememberSystemUiController

@Composable
fun NavigationController() {

    val systemUiController = rememberSystemUiController()
    val navController = rememberNavController()
    val weatherViewModel = hiltViewModel<WeatherViewModel>()

    SideEffect {

        systemUiController.setStatusBarColor(

            color = DarkCornflowerBlue,
            darkIcons = false

        )

    }

    NavHost(navController, CITY_LOOKUP_DESTINATION) {

        composable(CITY_LOOKUP_DESTINATION) { CityLookup(navController, weatherViewModel) }
        composable(WEATHER_LIST_DESTINATION) { WeatherList(navController, weatherViewModel) }
        composable(WEATHER_DETAIL_DESTINATION) { WeatherDetail(navController, weatherViewModel) }

    }

}

//@Preview(showBackground = true)
//@Composable
//private fun Preview() {
//    LowesCodingExerciseTheme {
//        NavigationController()
//    }
//}