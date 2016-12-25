package com.mycompany.scala

object ArrayTest {
  def main(args: Array[String]): Unit = {
    var a1: Array[String] = new Array[String](3) //3个元素的数组
    var a2 = new Array[String](3) //可省略类型
    a2(0) = "hello"; a2(1) = "scala"; a2(2) = "spark"
    printArray(a2)
    var a3 = Array("hello", "scala", "spark")
    printArray(a3)

    import Array._ //不同于java,import 可以出现在可以出现语句的任何地方
    var a4 = concat(a2, a3)
    printArray(a4)
    
    // range() 方法来生成一个区间范围内的数组。range() 方法最后一个参数为步长，默认为 1
    var range1 = range(10, 20, 2)
    var range2 = range(10, 20)
    printArray(range1);
    printArray(range2);
  }

  def printArray[T](array: Array[T]) = {
    for (v: T <- array)
      print(v + " ")
    println
  }
}