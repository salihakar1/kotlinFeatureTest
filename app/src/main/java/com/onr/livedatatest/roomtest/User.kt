package com.onr.livedatatest.roomtest

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Created by Salih AKAR 13:44 7.05.2024
 */
@Entity(tableName = "MyUser")
data class MyUser(
    @PrimaryKey(autoGenerate = true) val uid: Int,
    @ColumnInfo(name = "name") val firstName: String?,
    @ColumnInfo(name = "lastName") val lastName: String?,
)
