package com.mycompany.scala.tests
//七周七语言，Bruce A.Tate
object MapTest {
  def main(args: Array[String]): Unit = {
    val map1 = Map(0 -> "zero", 1 -> "one", 2 -> 2)
    println(map1) //Map(0 -> zero, 1 -> one, 2 -> 2)
    println(map1.keys) //Set(0, 1, 2)
    println(map1.values) //MapLike(zero, one, 2)
    println(map1.get(3)) //None
    println(map1.getOrElse(3,"three")) //如果包含key:3就返回对应的值，否则返回默认值:three
    for((k,v) <- map1)
      print(k+"->"+v+" ") //0->zero 1->one 2->2 
    println

    import scala.collection.mutable.HashMap
    val map2 = new HashMap[Int, String]
    map2 += 1 -> "one"
    map2 += 2 -> "two"
    println(map2) //Map(2 -> two, 1 -> one)
  }
}