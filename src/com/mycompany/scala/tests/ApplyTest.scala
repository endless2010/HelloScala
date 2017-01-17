package com.mycompany.scala.tests

object ClassTest2 {
  def main(arg: Array[String]): Unit = {
    /*
     * apply方法测试
     * apply方法可以直接调用而不需要方法名，实际上是一个快捷方法，可以使用小括号触发功能
     */
    class Multiplier(factor: Int) {
      def apply(input: Int) = input * factor
    }
    val triple = new Multiplier(3)
    println(triple.apply(10))
    println(triple(10)) //同上

    object Double{
      def apply(input: Int) = input * 2
    }

    println(Double.apply(10))
    println(Double(10)) //同上
  }
}