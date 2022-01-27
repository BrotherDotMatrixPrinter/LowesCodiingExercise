package com.funnycop.lowescodingexercise.repo

import com.funnycop.lowescodingexercise.model.WeatherResponse
import com.funnycop.lowescodingexercise.util.API_KEY
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherService {

    @GET("data/2.5/forecast?units=imperial&appid=$API_KEY")
    suspend fun getForecast(@Query(value = "q") code: String): WeatherResponse?

}