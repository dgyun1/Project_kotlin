package org.example.Project

import retrofit2.Call
import retrofit2.http.GET

class CrashViewApi {
    companion object {

        const val DOMAIN = "http://192.168.0.62:5000"

    }
}
interface CrashService {
    @GET("/crashvideo/select")
    fun requsetData(): Call<List<CrashDataEntity>>

}