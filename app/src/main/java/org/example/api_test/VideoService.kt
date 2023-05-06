package org.example.api_test

import retrofit2.Call
import retrofit2.http.GET



class VideoViewApi {
    companion object {

        const val DOMAIN = "http://192.168.0.62:5000"

    }
}

interface VideoService {
    @GET("/normalvideo/select")
    fun requestData() : Call<List<VideoDataEntity>>
}
