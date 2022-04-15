package com.example.kotlin

/**
 * Created on 2022/4/13
 * @author zsp
 * @desc 学习 Kotlin 七
 */
fun main() {
    forOne()
    forTwo()
    forThree()
    forFour()
}

fun forOne() {
    for (i in 0..10) {
        println("ForOne$i")
    }
}

fun forTwo() {
    for (i in 0 until 10) {
        println("ForTwo$i")
    }
}

fun forThree() {
    for (i in 0 until 10 step 2) {
        println("ForThree$i")
    }
}

fun forFour() {
    for (i in 10 downTo 1) {
        println("ForFour$i")
    }
}