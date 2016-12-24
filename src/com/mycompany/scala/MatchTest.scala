
package com.mycompany.scala
/**
 *  Match类似java的switch，
 *  不同的是，只会有0个或者1个模式可以匹配，而不会从一个模式贯穿到下一个模式，即
 *  不需要break语句
 */
object MatchTest {
  def main(args: Array[String]): Unit = {
    var x = 10; var y = 20
    var max = x > y match { //<expression> match {
      case true  => x //case <pattern> => <expression>
      case false => y
    }
    println(max)
    
    var day="MON"
    var kind= day match{
      case "MON"|"TUE"|"WED"|"THU"|"FRI" =>"weekday"
      case "SAT"|"SUN" =>"weekend"
      case _ => "unknown"
    }
    println(kind)
  }
}