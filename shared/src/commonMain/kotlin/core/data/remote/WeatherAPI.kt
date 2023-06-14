package core.data.remote

import core.data.model.CurrentWeatherRemote

interface WeatherAPI {

    suspend fun getCurrentWeather(): CurrentWeatherRemote

}