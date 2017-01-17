package com.mycompany.scala.tests
/**
 * scala鼓励你在变量和函数返回值可能不会引用任何值的时候使用Option类型。
 * 在没有值的时候，使用None，这是Option的一个子类。
 * 如果有值可以引用，就使用Some来包含这个值。Some也是Option的子类。
 * http://www.jianshu.com/p/95896d06a94d
 */
object OptionsTest {
  def main(arg: Array[String]): Unit = {
    val map1 = Map("key1" -> "value1")
    println(map1.get("key1")) //Some(value1)
    println(map1.get("key2")) //Noe
    println(map1.get("key1").get) //value1
    //    println(map1.get("key2").get) //抛出异常 java.util.NoSuchElementException: None.get

    /*
     * 如果我们把Option当成一般的List来用，并且用一个for循环来走访这个Option的时候，
     * 如果Option是None，那这个for循环里的程序代码自然不会执行，于是我们就达到了「不用检查Option是否为None这件事
     */
    def printContentLength(x: Option[String]) {
      for (c <- x) {
        println(c.length)
      }
    }

    printContentLength(map1.get("key1")) //6
    printContentLength(map1.get("key2")) //不会执行,也不会报错

    /*
     * 用在match中
     */
    def showCapital(x: Option[String]) = x match {
      case Some(s) => s
      case None    => "?"
    }
    println(showCapital(map1.get("key1")))
    println(showCapital(map1.get("key2")))
  }
}