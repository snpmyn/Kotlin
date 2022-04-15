package com.example.kotlin

/**
 * Created on 2022/4/15
 * @author zsp
 * @desc 学习 Kotlin 十二
 */
fun main() {
    val studentTwo = StudentTwo("xxxxxx", 10)
    studentTwo.name = "ZhangSan"
    doStudyTwo(studentTwo)
}

fun doStudyTwo(studyTwo: StudyTwo) {
    studyTwo.readBooks()
    studyTwo.doHomework()
}