package com.mycompany.scala.tests

object FileTest {
  def main(args: Array[String]) {

    //从屏幕读取数据
    print("请输入任何内容: ")
    val line = Console.readLine()

    println("你输入的是: " + line)

    //Scala 进行文件写操作，直接用的都是 java中 的 I/O 类 （java.io.File)
    import java.io._
    val writer = new PrintWriter(new File("test.txt"))
    writer.write(line)
    writer.close()

    //从文件读取内容非常简单。我们可以使用 Scala 的 Source 类及伴生对象来读取文件
    println("文件内容为:")
    import scala.io.Source
    Source.fromFile("test.txt").foreach {
      print _
    }
  }
}