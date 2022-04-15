package com.example.kotlin

/**
 * Created on 2022/4/14
 * @author zsp
 * @desc 学生
 */
class Student : Person(), Study {
    var sno = ""
    var grade = 0
    override fun readBooks() {
        println("$name is reading")
    }

    override fun doHomework() {
        println("$name is doing homework")
    }
}