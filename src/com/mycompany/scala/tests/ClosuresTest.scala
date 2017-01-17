package com.mycompany.scala.tests
/**
 * 闭包是一个函数，返回值依赖于声明在函数外部的一个或多个变量
 */
object ClosuresTest {
  def main(args: Array[String]): Unit = {

    //multiplier 成为一个"闭包"，因为它引用到函数外面定义的变量，定义这个函数的过程是将这个自由变量捕获而构成一个封闭的函数。
    var factor = 3
    val multiplier = (i: Int) => i * factor 
    println("muliplier(1) = " + multiplier(1))
    println("muliplier(2) = " + multiplier(2))

  }
}