package com.mycompany.scala.tests

object CompanionObjectTest {
    def main(arg: Array[String]): Unit = {
      //工厂方法
     class Multiplier(val x:Int){def product(y:Int)=x*y}
     object Multiplier{def apply(x:Int)=new Multiplier(x)}
     
     println(Multiplier(3).product(4))
    }
}