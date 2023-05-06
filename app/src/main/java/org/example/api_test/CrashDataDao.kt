package org.example.api_test

import androidx.room.*

@Dao
interface CrashDataDao {
    @Query("SELECT * FROM CrashDataEntity")
    fun getAll(): List<VideoDataEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(crashDataList: List<CrashDataEntity>)

    @Query("DELETE FROM CrashDataEntity")
    fun deleteAll()

    @Query("SELECT * FROM CrashDataEntity WHERE videodate LIKE :searchText OR ID")
    fun searchLogData(searchText: String): List<CrashDataEntity>
}