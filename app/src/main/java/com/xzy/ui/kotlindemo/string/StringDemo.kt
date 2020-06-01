package com.xzy.ui.kotlindemo.string

object StringDemo {

    fun test1() {
        // 字符串原样输出
        val s = """
            xzy--for(a in "abc") 
            print(a)
            """
        print(s)
    }

    fun testNull() {
        var a = ""
        if (a.isEmpty()) {
            print("a,我是空的")
        }
        a?.let {
            print("a,我进来了")
        }
        var b = null
        b?.let {
            print("b,我进来啦")
        }
    }
}