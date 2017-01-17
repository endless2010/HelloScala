package com.mycompany.scala.tests
/**
 * Case Class是不可实例化的类，包含多个自动生成的方法，还包括一个自动生成伴生对象
 * 自动生成的对象方法有：apply,unapply
 * 自动生成的类方法有:copy, equals,hashCode,toString
 */
object CaseClassTest {
  def main(arg: Array[String]): Unit = {
    case class Character(name: String, isThief: Boolean)

    println(new Character("Sam", true)) // Character(Sam,true)

    val sam = Character("Sam", true)
    println(sam) //apply Character(Sam,true) 
    println(sam.name + "," + sam.isThief) //字段默认是public
    println(sam.copy()) //copy,默认复制所有字段 Character(Sam,true)
    println(sam.copy("Dean")) //apply Character(Dean,true)
    println(sam.copy("Dean", false)) //apply Character(Dean,false)

    //equals方法比较字段
    println(sam.equals(new Character("Sam", true))) //true
    println(sam == (new Character("Sam", true))) //true
    println(sam.equals(sam.copy())) //true
    println(sam == (sam.copy())) //true

    //unapply
    sam match {
      case Character(x, true)  => println(s"$x is a thief")
      case Character(x, false) => println(s"$x is not a thief")
    }
  }
}