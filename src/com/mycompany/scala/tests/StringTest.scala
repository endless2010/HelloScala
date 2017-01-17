

package com.mycompany.scala.tests
/**
 * scale中定义的String类型实际就是java.lang.String，可以调用java String的所有方法
 */
object StringTest {
   def main(args: Array[String]): Unit = {
     var s1="Hello World"  //分号可以省略
     var s2="Hello World"
     var s3="Hello "+"World"
     println(s1==s2) //==比较的真正的想等下，类似与java的equals
     println(s1==s3) 
     println(s1.indexOf("o")) //4
     println(s1.toUpperCase()) //HELLO WORLDf
     // """ """之间的所有内容都是 字符串的一部分，包括\和换行
     var s4="""Hello World 
               Hava Fun\\
            """
     println(s4);
     println(s"have fun,$s1");//在 "之前加上一个s,实现变量内插
     
     println("scala "*3)
     println("scala"+2)
     
     //调用java的StringBuilder
      val buf = new StringBuilder;
      buf += 'a'
      buf ++= "bcdef"
      println( "buf is : " + buf.toString );
      
      println("Hello,%s,%s".format("scala","have fun"));//format格式化
   }
}