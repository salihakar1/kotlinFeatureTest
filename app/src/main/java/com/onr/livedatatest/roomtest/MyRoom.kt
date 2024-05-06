package com.onr.livedatatest.roomtest

import android.content.Context
import android.util.Log
import androidx.room.Room

/**
 * Created by Salih AKAR 12:19 22.03.2024
 */
class MyRoom(context: Context) {

    private val tag = "MyRoom"
    val db = Room.databaseBuilder(
        context,
        MyDatabase::class.java, "myTestDataBase"
    ).build()

    private val userDao = db.userDao()
    val users: List<MyRoomData> = userDao.getAll()

    init {
        Log.e(tag,"myTEst-> $users")
    }

//  /
}


