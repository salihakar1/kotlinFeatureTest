package com.onr.livedatatest.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.onr.livedatatest.databinding.MainLayoutBinding
import com.onr.livedatatest.livedatatest.MyTestDataServer
import com.onr.livedatatest.livedatatest.MyViewModel

/**
 * Created by Salih AKAR 10:46 22.03.2024
 */
class MainActivity() : AppCompatActivity() {

    private lateinit var binder: MainLayoutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binder = MainLayoutBinding.inflate(layoutInflater)
        setContentView(binder.root)

        testLiveData()
    }

    //    live data Test
    private lateinit var myViewModel: MyViewModel

    private fun testLiveData() {
        val myTestDataServer = MyTestDataServer()
        myViewModel = MyViewModel(myTestDataServer)

        myViewModel.incomingData.observe(this, Observer { newData ->
            binder.myTextView.text = newData
        })


        binder.button1.setOnClickListener {
            myViewModel.fetchData()
        }
    }


//  /
}