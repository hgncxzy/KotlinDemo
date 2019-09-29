package com.xzy.ui.kotlindemo.variables_and_methods

import kotlin.math.pow

object VariablesAndMethodsDemo {

    @JvmStatic
    fun main(args: Array<String>) {
        println(a)
        println(b)
        println(getLength("xzy"))
        println(helloWorld())
        println(join('h', 'e', 'l', 'l', 'o'))
        println(testDefault(2))
    }

    /**
     * 变量
     * */
    private const val a: Int = 1 //立即赋值
    private const val b = 2 // 自动推断出 `Int` 类型
    // val c: Int// error 如果没有初始值类型不能省略
    // d = 3 // error 明确赋值


    /**
     * 函数定义
     * */

    //计算字符串长度
    private fun getLength(str: String): Int {
        return str.length
    }

    //返回值为空
    private fun helloWorld() {
        println("Hello, World!")
    }

    /**
     * 可变长参数声明vararg关键字
     * */

    private fun join(vararg chars: Char): String {
        return chars.joinToString("")
    }

    /**
     *参数默认值
     **/

    //计算次幂
    private fun testDefault(base: Int, power: Int = 3): Double {
        return base.toDouble().pow(power.toDouble())
    }

}