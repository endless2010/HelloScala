package com.mycompany.scala.tests

object ClassExtendTest1 {
  def main(arg: Array[String]): Unit = {

    class User(var name: String, var age: Int = 20) { //提供默认值
      def greet: String = s"Hello,$name,$age"
      override def toString = s"User($name,$age)"
    }
    var u1 = new User("sam", 30) //提供name,age
    println(u1 + " " + u1.name + " " + u1.greet)
    
    class VipUser(var vipLevel:Int=1,name: String, age: Int = 20) extends User(name,age){
      override def greet:String=greet("hello") //覆盖必须加上override
      def greet(msg:String)=s"$msg,$name,$age,$vipLevel" //方法重载
      override def toString = s"User($name,$age，$vipLevel)"
    }
    
    var u2 = new VipUser(name="sam", age=30,vipLevel=4) //提供name,age
    println(u2 + " " + u2.name + " " + u2.greet+" "+u2.greet("HELLO"))

    //使用isInstanceOf方法来检测某个对象是否为某个特定的类；如果检测通过，则可以使用asInstanceOf方法来将对象转换为子类。
    println(u2.isInstanceOf[User]) //true
    println(u2.isInstanceOf[VipUser]) //true
    println(u2.asInstanceOf[VipUser].vipLevel)
    println(classOf[User]) //class com.mycompany.scala.ClassExtendTest1$User$2
    println(classOf[VipUser]) //class com.mycompany.scala.ClassExtendTest1$VipUser$2
  }
}