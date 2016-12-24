

package com.mycompany.scala

object IfElseTest {
  def main(args: Array[String]): Unit = {
    if (1 > 0) println("ok")
    //if(1) println("ok") 和java一样，条件是布尔型

    var x = 10; var y = 20
    var max = if (x > y) x else y //scala没有三元表达式：x>y?x:y
    println(max)

    var score = 85
    if (score >= 90) println("excellent")
    else if (score >= 80) println("good")
    else if (score >= 60) println("pass");
    else println("fail")
  }
}