package com.mycompany.scala
/**
 * Scala Trait(特征) 相当于 Java 的接口，实际上它比接口还功能强大。
 * 与接口不同的是，它还可以定义属性和方法的实现。
 * 一般情况下Scala的类只能够继承单一父类，但是如果是 Trait(特征) 的话就可以继承多个，从结果来看就是实现了多重继承。
 */
object TraitTest {
    def main(args: Array[String]): Unit = {
      val p1 = new Point(2, 3)
      val p2 = new Point(2, 4)
      val p3 = new Point(3, 3)

      println(p1.isEqual(p2))
      println(p1.isNotEqual(p3))
      println(p1.isNotEqual(2))
    }
}

trait Equal {
  def isEqual(x: Any): Boolean
}

trait NotEqual {
  def isNotEqual(x: Any): Boolean
}

class Point(xc: Int, yc: Int) extends Equal with NotEqual { //with继承多个时使用
  var x: Int = xc
  var y: Int = yc
  def isEqual(obj: Any) =
    obj.isInstanceOf[Point] &&
    obj.asInstanceOf[Point].x == x &&
    obj.asInstanceOf[Point].y == y
    
    def isNotEqual(obj: Any) = !isEqual(obj)
}

