package com.example.kotlin

/**
 * Created on 2022/4/13
 * @author zsp
 * @desc 学习 Kotlin 六
 */
fun main() {
    val numOne = 10
    val numTwo = 10L
    val numThree = 10.0
    checkNumber(numOne)
    checkNumber(numTwo)
    checkNumber(numThree)
}

fun checkNumber(num: Number) {
    when (num) {
        is Int -> println("number is Int")
        is Double -> println("number is Double")
        else -> println("number not support")
    }
}