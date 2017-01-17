package com.mycompany.scala.tests

/**
 * HOF:High order function高阶函数
 * 把一个函数当作参数传递给另一个函数
 */
object HOFTest {
    def main(arg:Array[String]):Unit={
      def add(x:Int,y:Int)=x+y
      def mul(x:Int,y:Int)=x*y
      
      def cal(x:Int,y:Int,f:(Int,Int)=>Int)=f(x,y) //HOF,f有2个Int参数，返回Int
      println(cal(4,2,add))
      println(cal(4,2,mul))
      println(cal(4,2,(x:Int,y:Int)=>x-y)) //传入匿名函数
      val div=(x:Int,y:Int)=>x/y; //把函数赋值给变量
      println(cal(4,2,div))
      
      
    println(List("one","two","three","four").count(word=>word.size>3)) //2
    println(List("one","two","three","four").filter(word=>word.size>3)) //List(three, four)
    println(List("one","two","three","four").map(word=>word.size)) //List(3, 3, 5, 4)
    println(List("one","two","three","four").sortWith((s,t)=>(s.charAt(0)<t.charAt(0)))) //List(four, one, two, three)
    
    println(List(1,7,2,9).reduceLeft(_ - _))   //( ( 1 - 7 ) - 2 ) - 9 = 1- 7 - 2 - 9 = -17  
    println(List(1,7,2,9).reduceRight(_ - _))   //1 - ( 7 - ( 2 - 9  ) ) = 1-7 + 2 -9 = -13 
    
    }
}