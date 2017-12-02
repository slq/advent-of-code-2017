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
}
