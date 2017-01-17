package com.mycompany.scala.tests

object VariableTest {
    def main(arg:Array[String]):Unit={
    val v1=2;
    //v1=3;//error,val表示不可变变量
    var v2=2 //var声明可变的变量
    v2=3;//ok
    
    val a,b:Int=3; //a和b的值都是3 
    println(a+" "+b)
  }
}