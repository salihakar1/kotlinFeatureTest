package com.onr.livedatatest.main

import android.util.Log

/**
 * Created by Salih AKAR 14:25 7.05.2024
 */

fun String.debug(s: String) {
    Log.e(s, "cycle-> $this")
}