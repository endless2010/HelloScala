package com.mycompany.scala.tests

object FunctionTest {
  def main(args: Array[String]): Unit = {

    def hello = "hello scala" //def定义最简单的函数，没有输入
    println(hello)

    def hi: String = "hi scala" //明确定义返回值为String类型
    println(hi)

    def multiplier(x: Int, y: Int): Int = { x * y } //两个Int输入，返回Int
    println(multiplier(2, 3))

    //递归调用
    def power(x: Int, y: Int): Int = {
      if (y > 1) x * power(x, y - 1)
      else x
    }
    println(power(2, 4))

    //scala中，可以按名称调用参数，这样就允许不按顺序指定参数

    def greet(name: String, message: String) = s"hello,$name,$message"
    println(greet("scala", "have fun"))
    println(greet(message = "have fun", name = "scala"))

    //不支持函数重载，但可以为函数指定默认值
    //def greet(message:String)=s"hello,$message"
    def greet1(name: String = "scala", message: String) = s"hello,$name,$message"
    println(greet1("scala", "have fun"))

    //varargs,*标识一个或多个参数
    def sum(items: Int*): Int = {
      var total = 0
      for (i <- items)
        total += i
      total
    }
    println(sum(10, 20))
    println(sum(10, 20, 30))

    //泛型参数，类似java的<T>
    def identity[A](a: A): A = a
    var s1:String=identity[String]("hello")  //调用String类型参数
    var s2:String=identity("hello")  //自动推导，可以省略[String]
    var s3=identity("hello")
    var i1:Int=identity[Int](20)
    var i2:Int=identity(20)
    var i3=identity(20)
    println(s"$s1,$s2,$s3,$i1,$i2,$i3")
  }
}