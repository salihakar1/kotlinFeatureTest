package com.onr.livedatatest.livedatatest

import android.os.Handler
import android.os.HandlerThread
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

/**
 * Created by Salih AKAR 10:53 22.03.2024
 */
class MyTestDataServer {
    private val myData = MutableLiveData<String>()
    val responseData: LiveData<String> = myData

    fun fetchMyData() {

        Thread.sleep(2000)

        myData.value = "my tested response "

    }

//  /
}