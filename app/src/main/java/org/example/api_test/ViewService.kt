package org.example.api_test


import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query


class ViewApi {
    companion object {

        const val DOMAIN = "http://192.168.0.62:5000"
    }
}
interface ViewService {
    @GET("/sensor/select")
    fun requestData() : Call<List<LogDataEntity>>

}