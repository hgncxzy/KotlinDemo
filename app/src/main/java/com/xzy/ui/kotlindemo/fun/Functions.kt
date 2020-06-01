package com.xzy.ui.kotlindemo.`fun`

/**
 * Author: xzy
 * Date: 2019-10-29
 * Description: 函数的用法
 */
object Functions {
    fun testLet() {
        var s = "xzy"
        s.let {
            print(it)
        }
        var ss = ""
        ss?.let {
            print(ss)
        }
    }
}