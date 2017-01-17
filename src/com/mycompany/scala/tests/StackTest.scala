package com.mycompany.scala.tests

import scala.collection.mutable.Stack

object StackTest {
  def main(args: Array[String]): Unit = {
    var s = new Stack[Int]
    var stack = Stack(1, 2, 3)
    println(stack) //Stack(1, 2, 3)
    println(stack.top) //1
    stack.push(4); println(stack) //Stack(4, 1, 2, 3)
    stack.push(5, 6, 7, 8); println(stack) //Stack(8, 7, 6, 5, 4, 1, 2, 3)
    stack.pop(); println(stack) //Stack(7, 6, 5, 4, 1, 2, 3)
    stack.pop(); println(stack) //Stack(6, 5, 4, 1, 2, 3)
  }
}