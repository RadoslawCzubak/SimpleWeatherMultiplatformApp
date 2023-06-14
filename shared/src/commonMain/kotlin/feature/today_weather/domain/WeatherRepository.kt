package feature.today_weather.domain

import feature.today_weather.domain.model.CurrentWeather

interface WeatherRepository {
    fun getCurrentWeather(): CurrentWeather
}