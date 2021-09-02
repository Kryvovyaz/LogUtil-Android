package com.vlad_kryvovyaz.logutil

import android.util.Log

class LogDebug {
    companion object{
        const val TAG = "My Tag"
        fun d(message:String){
            Log.d(TAG,message)
        }
    }
}