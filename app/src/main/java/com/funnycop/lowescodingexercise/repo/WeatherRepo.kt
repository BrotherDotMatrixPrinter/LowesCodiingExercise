package com.funnycop.lowescodingexercise.repo

import com.funnycop.lowescodingexercise.model.SimpleWeatherData
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class WeatherRepo @Inject constructor(

    private val weatherService: WeatherService

) {

    suspend fun getForecast(code: String): List<SimpleWeatherData>? {

        val response = weatherService.getForecast(code)
        val body = response?.list ?: return null

        return body.map {
            SimpleWeatherData(

                it.main.temp,
                it.main.feelsLike,
                it.weather[0].main,
                it.weather[0].description

            )
        }

    }

}