package com.xzy.ui.kotlindemo

import android.app.Application
import android.content.Context

class RootApp : Application() {
    override fun onCreate() {
        super.onCreate()
        rootApp = this
    }

    companion object {
        var rootApp: Application? = null
        fun getContext(): Context {
            return rootApp?.applicationContext!!
        }
    }

}