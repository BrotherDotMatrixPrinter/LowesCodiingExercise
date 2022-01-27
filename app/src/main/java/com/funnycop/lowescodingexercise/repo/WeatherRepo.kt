package com.funnycop.lowescodingexercise.repo

import com.funnycop.lowescodingexercise.model.SimpleWeatherData
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class WeatherRepo @Inject constructor(

    private val weatherService: WeatherService

) {

    suspend fun getForecast(code: String): SimpleWeatherData? {

        val response = weatherService.getForecast(code)
        val body = response?.list?.get(0) ?: return null

        return SimpleWeatherData(

            body.main.temp,
            body.main.feelsLike,
            body.weather[0].main,
            body.weather[0].description

        )

    }

}