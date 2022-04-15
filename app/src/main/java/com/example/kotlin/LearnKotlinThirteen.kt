package com.example.kotlin

/**
 * Created on 2022/4/15
 * @author zsp
 * @desc 学习 Kotlin 十三
 */
fun main() {
    val cellPhoneOne = CellPhone("Samsung", 1299.99)
    val cellPhoneTwo = CellPhone("Samsung", 1299.99)
    println(cellPhoneOne)
    println("cellPhoneOne equals cellPhoneTwo " + (cellPhoneOne == cellPhoneTwo))
}