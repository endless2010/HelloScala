package com.mycompany.scala.tests

/**
 * 默认情况下，集合是不可改变的，每个集合操作都会建立一个新的集合而不是修改旧的集合
 */
object SetTest {
    def main(arg:Array[String]):Unit={
        var colors=Set("blue","red","black")
        println(colors) //Set(blue, red, black)
        println(colors+"white") //Set(blue, red, black, white)
        println(colors-"red") //;Set(blue, black)，没有white,说明white并没有加入到原始集合中
        println(colors++Set("white","green")) //Set(blue, green, black, white, red)
        println(colors--Set("blue","green")) //Set(red, black)
        println(colors&Set("blue","green")) //Set(blue),集合并集
        
        println(Set(1,2,3)==Set(3,2,1))//true,与列表不同
    }
}