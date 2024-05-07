package com.onr.livedatatest.roomtest

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query


/**
 * Created by Salih AKAR 13:45 7.05.2024
 */
@Dao
interface UserDao {
    @Query("SELECT * FROM myuser")
    fun getAll(): List<MyUser>

    @Query("SELECT * FROm myuser WHERE uid IN (:userIds)")
    fun loadByIds(userIds: IntArray): List<MyUser>

    @Insert
    fun insertAll(vararg users: MyUser)

    @Delete
    fun delete(user: MyUser)
}