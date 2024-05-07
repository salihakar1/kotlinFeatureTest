package com.onr.livedatatest.roomtest

import androidx.room.Database
import androidx.room.RoomDatabase

/**
 * Created by Salih AKAR 13:49 7.05.2024
 */
//@Database(entities = [MyUser::class], version = 1, exportSchema = false)

@Database(version = 1, entities = [MyUser::class])
abstract class MyAbsUserDatabase : RoomDatabase() {
    abstract fun userDao(): UserDao

//  /
}