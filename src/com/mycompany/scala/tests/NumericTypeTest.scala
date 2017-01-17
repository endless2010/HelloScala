package com.mycompany.scala.tests
 /**
  *  scala的数值类型有：Byte,Int,Long,Short,Float,Double 除了Int,其他都和java基础类型的包装类名称一样
  */
object NumericTypeTest {
  def main(args: Array[String]): Unit = {
    var b: Byte = 10; println(b); //有符号整型 1字节
    var s: Short = 20; println(s); //有符号整型 8字节
    var i: Int = 30; println(i); //有符号整型 2字节
    var l: Long = 40; println(l); //有符号整型 4字节
    var f: Float = 50; println(f); //有符号浮点数
    var d: Double = 60; println(d); //有符号浮点数

    //var v: Byte = 300; println(v);//溢出会报错

    //toXX 进行类型转化
    println(d.toDouble);
    println(d.toFloat);
    println(d.toLong);
    println(d.toInt);
    println(d.toShort);
    println(d.toByte);

  }
}