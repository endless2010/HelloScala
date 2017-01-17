package com.mycompany.scala.tests

import scala.collection.mutable.Queue

object QueueTest {
  def main(args: Array[String]): Unit = {
    val queue = Queue(1)
    queue.enqueue(2); println(queue) //Queue(1, 2)
    queue += 3; println(queue) //Queue(1, 2, 3)
    queue ++= List(4, 5, 6); println(queue) //Queue(1, 2, 3, 4, 5, 6)
    println(queue.front) //1
    println(queue.tail) //Queue(2, 3, 4, 5, 6)
    queue.dequeue(); println(queue) //Queue(2, 3, 4, 5, 6)
    queue.dequeue(); println(queue) //Queue(3, 4, 5, 6)

  }
}