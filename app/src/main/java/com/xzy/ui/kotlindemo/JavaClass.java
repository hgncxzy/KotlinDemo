package com.xzy.ui.kotlindemo;

import com.xzy.ui.kotlindemo.sp.UserKt;

/**
 * 测试 java 类调用 kt 方法
 *
 * @author ：created by xzy.
 * @date ：2021/7/5
 */
class JavaClass {
    public static void main(String[] args) {
        UserKt.showTest("");
        UserKt.showTest2();
    }
}
