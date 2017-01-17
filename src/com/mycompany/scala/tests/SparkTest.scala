package com.mycompany.scala.tests

object SparkTest {
  def main(arg: Array[String]): Unit = {
  
    var lines="""line1 one two three four four five six map filter sort map flatmap
line2 sort count hello scala have fun seven eight night ten ten ten"""
    var words=lines.split(" ")    
    println(words.mkString(",")) //split
    
    var map=words.map(word=>(word,1)) //map
    map.foreach(print)
    
    
  }
}