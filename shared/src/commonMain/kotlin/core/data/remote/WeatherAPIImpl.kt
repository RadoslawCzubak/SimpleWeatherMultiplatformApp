package core.data.remote

import core.data.model.CurrentWeatherRemote
import core.data.model.network.NetworkException
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get

const val BASE_URL = "https://api.weatherapi.com/v1/"

// TODO: Move to BuildConfig
const val API_KEY = ""

class WeatherAPIImpl(
    private val client: HttpClient
) : WeatherAPI {
    override suspend fun getCurrentWeather(): CurrentWeatherRemote {
        val response = client.get(BASE_URL) {
            url {
                parameters.append("key", API_KEY)
            }
        }

        if (response.status.value in 200..299) {
            return response.body<CurrentWeatherRemote>()
        } else throw Exception()
    }
}