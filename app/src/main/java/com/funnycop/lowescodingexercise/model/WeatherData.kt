package com.funnycop.lowescodingexercise.model

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class WeatherResponse(

    val list: List<WeatherInformation>

)

@JsonClass(generateAdapter = true)
data class WeatherInformation(

    val main: TemperatureData,
    val weather: List<WeatherData>

)

@JsonClass(generateAdapter = true)
data class TemperatureData(

    val temp: Double,
    @Json(name = "feels_like") val feelsLike: Double

)

@JsonClass(generateAdapter = true)
data class WeatherData(

    val main: String,
    val description: String

)

data class SimpleWeatherData(

    val temperature: Double,
    val feelsLike: Double,
    val weather: String,
    val weatherDescription: String

)
