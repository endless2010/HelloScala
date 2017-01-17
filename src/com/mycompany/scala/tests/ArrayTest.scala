package com.mycompany.scala.tests

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
    
    println(Array(1,7,3,9).mkString) //1739
    println(Array(1,7,3,9).mkString(" and ")) //1 and 7 and 3 and 9
    println(Array(1,7,3,9).mkString("<",",",">")) //<1,7,3,9>
    println(Array(1, 7, 3, 9).sum) //20
    println(Array(1, 7, 3, 9).max) //9
    println(Array(1,7,3,9).min) //1
    printArray(Array(1, 7, 3, 9).sorted) //1 3 7 9 
    printArray(Array(1, 7, 3, 9).sortWith(_ > _)) //9 7 3 1 
    
    println(Array(1,2,4,3,5).reduce(_+_)) //15
    Array(1,2,3,4,5).reduceLeft((x,y)=>{print(s"($x,$y)");x+y}) //(1,2)(3,3)(6,4)(10,5)
    println
    Array(1,2,3,4,5).reduceRight((x,y)=>{print(s"($x,$y)");x+y}) //(4,5)(3,9)(2,12)(1,14)
  }
  

  def printArray[T](array: Array[T]) = {
    for (v: T <- array)
      print(v + " ")
    println
  }
}