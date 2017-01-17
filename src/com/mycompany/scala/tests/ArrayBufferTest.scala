package com.mycompany.scala.tests
import scala.collection.mutable.ArrayBuffer

object ArrayBufferTest {
  def main(args: Array[String]): Unit = {
    val b = ArrayBuffer[Int]()
    b += 1; println(b) //1
    b += (2, 3, 4); println(b) //1, 2, 3, 4
    b ++= Array(5, 6, 7); println(b) //1, 2, 3, 4, 5, 6, 7
    b.trimEnd(2); println(b) //1, 2, 3, 4, 5 删除最后2个元素
    b.insert(2, 6); println(b) //1, 2, 6, 3, 4, 5 在下标2之前插入
    b.insert(2, 7, 8, 9); println(b) //1, 2, 7, 8, 9, 6, 3, 4, 5 插入多个元素
    b.remove(2); println(b) //1, 2, 8, 9, 6, 3, 4, 5 删除下标为2的元素
    b.remove(2, 3); println(b) //1, 2, 3, 4, 5 删除下标为2开始的3个元素
  }
}