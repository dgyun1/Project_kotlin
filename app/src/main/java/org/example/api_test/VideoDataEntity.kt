package org.example.api_test

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "VideoDataEntity")
data class VideoDataEntity (
    @PrimaryKey
    @SerializedName("ID")
    var ID: Int,
    @SerializedName("videodate")
    var videodate: String
)