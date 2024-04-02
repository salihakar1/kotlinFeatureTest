package com.onr.livedatatest.livedatatest

import androidx.lifecycle.LiveData

/**
 * Created by Salih AKAR 10:57 22.03.2024
 */
class MyViewModel(private val myTestDataServer: MyTestDataServer) {
    val incomingData: LiveData<String> = myTestDataServer.responseData

    fun fetchData() {
        myTestDataServer.fetchMyData()
    }

//  /
}