package core.data.model.network

sealed class NetworkException(message: String, throwable: Throwable?) {
    class Unknown(throwable: Throwable?) : NetworkException("Unknown error occurred", throwable)
}