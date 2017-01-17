package com.mycompany.scala.tests

/**
 * scala将XML作为语言的一等编程结构，可以像字符串那样来表示XML
 * 需要把scala-xml.jar加入构建路径
 * Scala-XML has been factored out into a separate library as of Scala 2.11, so it is not included in Scala projects by default.
 */
object XMLTest {
   def main(arg:Array[String]):Unit={
     val movies= //直接写xml就行，nice!
       <movies>
						<movie genre="action">Pirates of the Caribbean</movie>
    		 		<movie genre="fairytale">Edward Scissorhands</movie>
			 </movies>
			 
     println(movies.text)
     var movieNodes=movies \ "movie"// \搜索所哟<movie>元素的值
     println(movieNodes)
     println(movieNodes(0)) //第一个<movie>元素
     println(movieNodes(0) \ "@genre")//使用@查找结点的属性，查找genre的值:action
     
     val html = <html><head><title>hello scala</title></head><body>hello world</body></html>
     println(html)
   }
}