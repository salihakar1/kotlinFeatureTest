package com.onr.livedatatest.roomtest

import androidx.room.Dao
import androidx.room.Query

/**
 * Created by Salih AKAR 10:15 2.04.2024
 */
@Dao
interface MyDao {
    @Query("SELECT * FROM MyRoomData")
    fun getAll(): List<MyRoomData>

//    todo-> continue from here
//    https://developer.android.com/training/data-storage/room?hl=tr#kts


//  /
}