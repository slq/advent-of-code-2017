package com.adventofcode

class Day01 {

  def reverseCaptcha(list: List[Int]): Int = {
    def loop(elem: Int, list: List[Int]): Int = list match {
      case x :: Nil => if (x == elem) x else 0
      case x :: xs =>
        if (x == xs.head) x + loop(elem, xs)
        else loop(elem, xs)
    }

    if (list.length < 2) 0
    else loop(list.head, list)
  }

  def partTwo(list: List[Int]): Int = {
    val left = list.take(list.length / 2)
    val right = list.drop(list.length / 2)

    left.zip(right).filter { case (l, r) => l == r }.foldLeft(0) { (acc, elem) => acc + elem._1 + elem._2 }
  }
}
