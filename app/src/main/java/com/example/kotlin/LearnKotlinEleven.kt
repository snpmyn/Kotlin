package com.example.kotlin

/**
 * Created on 2022/4/15
 * @author zsp
 * @desc 学习 Kotlin 十一
 */
fun main() {
    val student = Student()
    student.sno = "xxxxxx"
    student.grade = 16
    student.name = "Lily"
    doStudy(student)
}

fun doStudy(study: Study) {
    study.readBooks()
    study.doHomework()
}