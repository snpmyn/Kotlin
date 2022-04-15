package com.example.kotlin

/**
 * Created on 2022/4/14
 * @author zsp
 * @desc 学生二
 */
class StudentTwo(sno: String, grade: Int) : Person(), StudyTwo {
    init {
        println("sno is $sno")
        println("grade is $grade")
    }

    override fun readBooks() {
        println("$name is reading")
    }
}