package com.mycompany.scala.tests

object ObjectTest {
  def main(arg: Array[String]): Unit = {
    object UserObject { //对象没有任何参数
      print("hello  ") //在第一次访问这个对象时调用
      def sayHi = println("Hi")
    }
    UserObject.sayHi //hello  Hi
    UserObject.sayHi //Hi

    class UserClass {
      print("hello  ") //算是构造函数的一部分,每次创建对象都会调用
      def sayHi = println("Hi")
    }
    new UserClass().sayHi //hello  Hi
    new UserClass().sayHi //hello  Hi
    
       
  object UserClassObject extends UserClass //对象可以继承一个类
    UserClassObject.sayHi
  }

}