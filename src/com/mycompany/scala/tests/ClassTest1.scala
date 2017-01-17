package com.mycompany.scala.tests

object ClassTest1 {
  def main(arg: Array[String]): Unit = {
    class User {
      val name: String = "scala"
      def greet: String = s"Hello,$name"
      override def toString = s"User($name)"
    }
    val u = new User
    println(u + " " + u.name + " " + u.greet) //name默认是public,类外面可以访问

    class User2(n: String) { //n是构造函数参数
      val name = n
      def greet: String = s"Hello,$name"
      override def toString = s"User($name)"
    }
    val u2 = new User2("sam")
    println(u2 + " " + u2.name + " " + u2.greet)

    class User3(val n: String) { //在类参数名称前面加上val或var,类参数就成为类中的一个字段
      val name = n
      def greet: String = s"Hello,$name"
      override def toString = s"User($name)"
    }
    val u3 = new User3("sam")
    println(u3 + " " + u3.n + " " + u3.name + " " + u3.greet) //n也是一个字段，可以直接调用

    class User4(var name: String, var age: Int = 20) { //提供默认值
      def greet: String = s"Hello,$name,$age"
      override def toString = s"User($name,$age)"
    }
    var u4 = new User4("sam") //使用默认age
    println(u4 + " " + u4.name + " " + u4.greet)
    u4 = new User4("sam", 30) //提供name,age
    println(u4 + " " + u4.name + " " + u4.greet)
    u4 = new User4(age = 40, name = "sam") //不一定按照声明的顺序
    println(u4 + " " + u4.name + " " + u4.greet)

    class User5(private val name: String) { //private修饰类参数
      def greet: String = s"Hello,$name"
      private def help = "this is private" //private 修饰方法
      override def toString = s"User($name)"
    }
    val u5 = new User5("sam")
    println(u5 + " " + u5.greet) //不能访问u5.name和u5.help

    class User6(private val name: String) {
      println(s"hello,$name") //算是构造函数的一部分,每次创建对象都会调用
    }
    new User6("sam")
    new User6("dean")
  }
}