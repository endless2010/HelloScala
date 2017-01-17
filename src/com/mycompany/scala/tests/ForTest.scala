package com.mycompany.scala.tests
/**
 * for(<identifier> <- <iterator>) [yield] [<expression>]
 * yield关键字是可选的，如果表达式中指定了这个关键字，调用的所有表达式的返回值将作为一个集合返回
 */
object ForTest {
  def main(args: Array[String]): Unit = {
    for ( x <- 1 to 10) print(x+" ") //1 2 3 4 5 6 7 8 9 10 
    println
    for ( x <- 1 until 10) print(x+" ") //1 2 3 4 5 6 7 8 9,不包括10
    println
    
    var values = for(x <- 1 to 10) yield x
    println(values) //Vector(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    
    var threes = for(x <- 1 to 20 if x%3==0) yield x //if为过滤器，iterator guard
    println(threes) //Vector(3, 6, 9, 12, 15, 18)
    
    for{x <-1 to 2;y <- 1 to 3} print (s"($x,$y)") //多重循环
    println
    
    var quote="Faith,Hope,,Charity"
    for(
      t <- quote.split(",")
      if t!=null
      if t.size>0
    )
    println(t)
    
    for(i <- 1 to 3 ;j<- 1 to 3) print(s"$i$j ")
  }
}