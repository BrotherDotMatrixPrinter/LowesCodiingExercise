package com.funnycop.lowescodingexercise.ui.composable

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.navigation.NavController
import com.funnycop.lowescodingexercise.viewmodel.WeatherViewModel

@Composable
fun WeatherDetail(

    navController: NavController,
    weatherViewModel: WeatherViewModel

) {

    val selectedWeather = weatherViewModel.selectedWeather.observeAsState()
    val cityName by weatherViewModel.cityName.observeAsState()

    Scaffold(

        topBar = { TopNavigationBar(

            title = "$cityName",
            navigateBack = { navController.navigateUp() }

        )  }

    ) {}

}