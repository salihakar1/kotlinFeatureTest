package com.onr.livedatatest.roomtest

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

/**
 * Created by Salih AKAR 10:15 2.04.2024
 */
@Dao
interface MyDao {
    @Query("SELECT * FROM MyRoomData")
    fun getAll(): List<MyRoomData>

    @Query("SELECT * FROM MyRoomData WHERE uid IN(:userIds)")
    fun loadAllByIds(userIds: IntArray): List<MyRoomData>

    @Query("SELECT * FROM MyRoomData WHERE firstName LIKE :first AND lastName LIKE :last LIMIT 1")
    fun findByName(first: String, last: String): MyRoomData

    @Insert
    fun insertAll(vararg users: MyRoomData)

    @Delete
    fun delete(user: MyRoomData)


//    todo-> continue from here
//    https://developer.android.com/training/data-storage/room?hl=tr#kts


//  /
}