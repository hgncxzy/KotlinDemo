package com.xzy.ui.kotlindemo.sp

class User {
    var age: Int = 0
    var name: String? = null

    override fun toString(): String {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\''.toString() +
                '}'.toString()

    }
}

fun `showTest`(text:String){

}

fun showTest2(){

}

//fun ` `(){
//
//}

fun main() {
    showTest("11")
    showTest2()
}
