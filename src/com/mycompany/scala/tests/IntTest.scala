package com.mycompany.scala.tests

object IntTest {
      def main(arg:Array[String]):Unit={
        println(0x30) //16进制
        println(1.to(10)) //Range(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        println(1.to(10,2)) //Range(1, 3, 5, 7, 9)
        println(1.to(10,2).reverse) //Range(9, 7, 5, 3, 1)
        println(1.until(10)) //Range(1, 2, 3, 4, 5, 6, 7, 8, 9)
      }
}