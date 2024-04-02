package com.onr.livedatatest.roomtest

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Created by Salih AKAR 12:19 22.03.2024
 */

@Entity
data class MyRoomData(
    @PrimaryKey val uid: Int,
    @ColumnInfo(name = "firstName") val firstName: String?,
    @ColumnInfo(name = "lastName") val lastName: String?,
) {
//  /
}