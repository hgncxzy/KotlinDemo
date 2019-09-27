package com.xzy.ui.kotlindemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.xzy.ui.kotlindemo.array.ArrayDemo
import com.xzy.ui.kotlindemo.string.StringDemo

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        StringDemo.test1()
        ArrayDemo.test1()
        print("1. print ")
        print("2. print")
        println("1. println ")
        println("2. println ")

    }
}
