package com.funnycop.lowescodingexercise.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.funnycop.lowescodingexercise.model.SimpleWeatherData
import com.funnycop.lowescodingexercise.repo.WeatherRepo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class WeatherViewModel @Inject constructor(

    private val weatherRepo: WeatherRepo

) : ViewModel() {

    private val _weather = MutableLiveData<List<SimpleWeatherData>>(null)
    val weather: LiveData<List<SimpleWeatherData>> get() = _weather

    fun getForecast(code: String) = viewModelScope.launch(Dispatchers.IO) {

        weatherRepo.getForecast(code)?.let { _weather.postValue(it) }

    }

}