package com.mycompany.scala

class User(n:String){ //n相当于构造函数的参数
  val name:String=n //访问权限默认为public,任何代码都可以访问类的字段和方法
  def greet:String =s"Hello $name"
  override def toString=s"user($name)" //相当于java的@Override
}

abstract class Car{ //定义抽象类 
  var year:Int
  var automatic:Boolean=true
  def color:String //抽象方法
}

class RedMini(var year:Int) extends Car{ //继承
  override def color="Red"
}

object ClassTest {
    def main(args: Array[String]): Unit = {
      var user=new User("scala")
      println(user)
      println(user.name)
      println(user.greet)
    }
}