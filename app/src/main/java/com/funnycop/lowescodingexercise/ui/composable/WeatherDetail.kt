package com.funnycop.lowescodingexercise.ui.composable

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.navigation.NavController
import com.funnycop.lowescodingexercise.viewmodel.WeatherViewModel

@Composable
fun WeatherDetail(

    navController: NavController,
    weatherViewModel: WeatherViewModel

) {

    val selectedWeather by weatherViewModel.selectedWeather.observeAsState()
    val cityName by weatherViewModel.cityName.observeAsState()

    Scaffold(

        topBar = {
            TopNavigationBar(

                title = "$cityName",
                navigateBack = { navController.navigateUp() }

            )
        }

    ) {

        ConstraintLayout(

            modifier = Modifier.fillMaxSize()

        ) {

            val (temp, feelsLike, weather, weatherDescription) = createRefs()

            Text(

                text = "${selectedWeather?.temperature}",
                fontSize = 30.sp,
                textAlign = TextAlign.Center,

                modifier = Modifier
                    .padding(16.dp)
                    .constrainAs(temp) {

                        top.linkTo(parent.top)
                        start.linkTo(parent.start)
                        end.linkTo(parent.end)

                    }

            )

            Text(

                text = "Feels Like: ${selectedWeather?.feelsLike}",
                fontSize = 20.sp,

                modifier = Modifier
                    .padding(bottom = 16.dp, end = 16.dp)
                    .constrainAs(feelsLike) {

                        top.linkTo(temp.bottom)
                        end.linkTo(parent.end)

                    }

            )

            Text(

                text = "${selectedWeather?.weather}",
                fontSize = 25.sp,

                modifier = Modifier
                    .padding(start = 16.dp, bottom = 16.dp)
                    .constrainAs(weather) {

                        top.linkTo(feelsLike.bottom)
                        start.linkTo(parent.start)

                    }

            )

            Text(

                text = "${selectedWeather?.weatherDescription}",
                fontSize = 20.sp,

                modifier = Modifier
                    .padding(start = 16.dp)
                    .constrainAs(weatherDescription) {

                        top.linkTo(weather.bottom)
                        start.linkTo(parent.start)

                    }

            )

        }

    }

}