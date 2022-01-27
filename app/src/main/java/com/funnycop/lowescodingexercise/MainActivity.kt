package com.funnycop.lowescodingexercise

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.funnycop.lowescodingexercise.ui.composable.NavigationController
import com.funnycop.lowescodingexercise.ui.theme.LowesCodingExerciseTheme
import com.funnycop.lowescodingexercise.viewmodel.WeatherViewModel
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.internal.GeneratedComponent

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val weatherViewModel by viewModels<WeatherViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        weatherViewModel.weather.observe(this) { Log.d("DEBUG_INFO", it.toString()) }
        weatherViewModel.getForecast("Cleveland,US-OH")

        setContent {

            LowesCodingExerciseTheme {

                Surface(color = MaterialTheme.colors.background) {

                    NavigationController()

                }

            }

        }

    }

}