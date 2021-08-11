package com.xzy.ui.kotlindemo.compare

/**
 * https://blog.csdn.net/c1392851600/article/details/80571969
 * 总体来说kotlin中==比较的是数值是否相等, 而===比较的是两个对象的地址是否相等
 * @author ：created by xzy.
 * @date ：2021/8/10
 */
internal object TestString {
    @JvmStatic
    fun main(args: Array<String>) {

        val a = 11
        val b = 11
        // true
        println(a == b)
        // true
        println(a === b)

        val s1 = "xzy"
        val s2 = "xzy"
        var s3: String = String(StringBuffer("xzy"))
        // true
        println(s1 === s2)
        // false
        println(s1 === s3)
        // true
        println(s1 == s3)
        // true
        println(s1 == s2)

        // 使用字符串缓存池
        s3 = s3.intern()
        // true
        println(s1 === s3)
    }
}