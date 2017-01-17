package com.mycompany.scala.tests
import scala.math._

object MathTest {
        def main(arg:Array[String]):Unit={
          println(math.abs(-2)) //2
          println(math.ceil(2.7)) //3
          println(math.exp(2)) //7.38905609893065
          println(math.floor(2.2)); //2
          println(math.log10(1000)) //3
          println(math.max(3, 4)) //4
          println(math.min(3,4)) //3
          println(math.pow(2, 4)) //16
          println(round(2.4)+" "+round(2.6)) // 2 4
          println(signum(1)+" "+signum(-2)) //1 -1
          println(math.sqrt(16)) //4
        }
}