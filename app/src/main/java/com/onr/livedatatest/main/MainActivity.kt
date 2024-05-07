package com.onr.livedatatest.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.room.Room
import com.onr.livedatatest.databinding.MainLayoutBinding
import com.onr.livedatatest.livedatatest.MyTestDataServer
import com.onr.livedatatest.livedatatest.MyViewModel
import com.onr.livedatatest.roomtest.MyAbsUserDatabase

/**
 * Created by Salih AKAR 10:46 22.03.2024
 */

//todo-> roadmap
//https://coderspace.io/roadmap/android-developer-yol-haritasi/
class MainActivity() : AppCompatActivity() {
    private val tag = "MainActivity"

    private lateinit var binder: MainLayoutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binder = MainLayoutBinding.inflate(layoutInflater)
        setContentView(binder.root)

//        testRoomDatabase()
//        testLiveData()
    }

    override fun onResume() {
        super.onResume()
        testRoomDatabase()
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


    private val databaseName: String = "MYUser_DATABASE"
    private fun testRoomDatabase() {

        try {
            val db = Room.databaseBuilder(
                applicationContext, MyAbsUserDatabase::class.java, databaseName
            )
                .allowMainThreadQueries()
                .build()

            db.userDao()
        } catch (e: Exception) {
            "database failed-> ${e.message}".debug(tag)
            e.printStackTrace()
        }


    }

//  /
}