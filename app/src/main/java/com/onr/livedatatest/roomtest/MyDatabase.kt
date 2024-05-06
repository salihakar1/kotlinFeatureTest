package com.onr.livedatatest.roomtest

import androidx.room.Database
import androidx.room.RoomDatabase

/**
 * Created by Salih AKAR 15:51 6.05.2024
 */
@Database(entities = [MyRoomData::class], version = 1)
abstract class MyDatabase : RoomDatabase() {
    abstract fun userDao(): MyDao

//  /
}