package com.funnycop.lowescodingexercise.ui.composable

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.navigation.NavController
import com.funnycop.lowescodingexercise.util.DEBUG_TAG
import com.funnycop.lowescodingexercise.viewmodel.WeatherViewModel

@Composable
fun WeatherList(

    navController: NavController,
    weatherViewModel: WeatherViewModel

) {

//    val weather by weatherViewModel.weather.observeAsState()
//
//    weather?.let { Log.d(DEBUG_TAG, it.toString()) }

}