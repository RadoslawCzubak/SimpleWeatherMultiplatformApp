package feature.today_weather.domain.model

data class CurrentWeather(
    val weatherInfo: WeatherInfo,
    val location: Location
)