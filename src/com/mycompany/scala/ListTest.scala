package com.mycompany.scala

/**
 * scala中的列表是不可变的
 */
object ListTest {
  def main(args: Array[String]): Unit = {
    var numbers=List(10,20,30,40,50)   
    println(numbers)
    
    var mixed=List("Hello",true,2,3.0,'H')
    println(mixed)
    
    var colors=List("red","green","blue","white")
    println(colors.head)//第一个元素:red
    println(colors.tail)//除了第一个，剩下的元素：green,blue,white
    println(colors(1))//green
    
    var nums=List(10,20,30,40,50) 
    nums.foreach(c=>print(c+" "))
    println(nums.map(c=>2*c))
    println(nums.reduce((a,b)=>a+b))
    
    println(List(1,2)++Set(3,4)) //++,为列表追加一个集合 List(1, 2, 3, 4)
    println(List(1,2)==List(1,2))//true,如果集合类型和列表类型都相同
    println(List(1,2)==Set(1,2))//false
    println(List(1,2,2,3).distinct)//返回不包含重复元素的列表 List(1, 2, 3)
    println(List(1,2,3,4).drop(2))//从列表中去除前2个元素 List(3, 4)
    println(List(1,2,3,4).take(2))//取出列表的前2个元素 List(1, 2)
    println(List(1,2,3,4).filter(_>2))//List(3, 4)
    println(List(List(1,2),List(3,4)).flatten)//将列表的列表转为元素列表 List(1, 2, 3, 4)
    println(List(1,2,3,4,5).partition(_<3))//将一个列表分为2个列表组成的一个元祖 (List(1, 2),List(3, 4, 5))
    println(List(1,2,3,4).reverse)//逆置列表 List(4, 3, 2, 1)
    println(List(1,2,3,4,5,6).slice(1,3))//返回列表的一部分 List(2, 3)
    println(List("hello","hi","Nice").sortBy(_.size))//List(hi, Nice, hello)
    println(List("hello","hi","Nice").sorted)//按自然值排序
    println(List(1,2,3,4,5).splitAt(2))//由索引值，将列表分为2个列表组成的一个元祖 (List(1, 2),List(3, 4, 5))
    
    //math reduce operations
    println("-"*30)
    println(List(10,20,30).max) //30
    println(List(10,20,30).min) //10
    println(List(10,20,30).product) //6000
    println(List(10,20,30).sum) //60
    
    //boolean reduce operations
    println("-"*30)
    println(List(10,20,30).contains(20)) //true
    println(List(10,20,30).startsWith(List(10))) //true
    println(List(10,20,30).endsWith(List(20,30))) //true
    println(List(10,20,30).exists(_<20)) //true
    println(List(10,20,30).forall(_<20)) //false

    //convert operations
    println("-"*30)
    println(List(10,20,30).mkString(",")) //10,20,30
    println(List(10,20,30).toBuffer) //转换为可变集合，ArrayBuffer(10, 20, 30)
    println(List(10,20,20,30).toSet) //Set(10, 20, 30)
    }
}