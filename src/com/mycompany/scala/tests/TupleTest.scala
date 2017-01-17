package com.mycompany.scala.tests

/**
 * 元祖是不同类型的元素的聚集
 */
object TupleTest {
    def main(args: Array[String]): Unit = {
      val t=(1,3.14,"Fred")
      println(t._1+" "+t._2+" "+t._3) //使用_1,_2,_3访问元祖元素
      val (first,second,_) = t //不需要的元素使用占位符_
    }
}