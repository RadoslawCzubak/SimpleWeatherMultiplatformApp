package feature.today_weather.domain.model

data class WeatherInfo(
    val cloud: Int,
    val condition: Condition,
    val feelsLikeC: Double,
    val feelsLikeF: Double,
    val gustKph: Double,
    val gustMph: Double,
    val humidity: Int,
    val isDay: Int,
    val lastUpdated: String,
    val lastUpdatedEpoch: Int,
    val precipIn: Double,
    val precipMm: Double,
    val pressureIn: Double,
    val pressureMb: Double,
    val tempC: Double,
    val tempF: Double,
    val uv: Double,
    val visKm: Double,
    val visMiles: Double,
    val windDegree: Int,
    val windDir: String,
    val windKph: Double,
    val windMph: Double
)
