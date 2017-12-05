package com.adventofcode

import scala.annotation.tailrec


class Day05 {

  // too slow!
  def mazeOfTwistyTrampolines(list: List[Int]): Int = {
    @tailrec
    def go(list: List[Int], index: Int, acc: Int): Int = {
      if (index >= list.length) return acc

      val elem = list(index)
      go(list.updated(index, list(index) + 1), index + elem, acc + 1)
    }

    go(list, 0, 0)
  }

  // too slow!
  def mazeOfTwistyTrampolinesEvenStranger(list: List[Int]): Int = {
    @tailrec
    def go(list: List[Int], index: Int, acc: Int): Int = {
      if (index >= list.length) return acc

      val elem = list(index)
      val nextElem = if (elem > 2) list(index) - 1 else list(index) + 1
      go(list.updated(index, nextElem), index + elem, acc + 1)
    }

    go(list, 0, 0)
  }


}
