package com.adventofcode

class Day02 {
  def corruptionChecksum(list: List[List[Int]]): Int = list.foldLeft(0) { (acc, elem) => acc + elem.max - elem.min }

  def evenlyDivisible(list: List[List[Int]]): Int = list.foldLeft(0) { (acc, elem) => acc + evenlyDivisibleNumber(elem) }

  def evenlyDivisibleNumber(list: List[Int]): Int = {
    def loop(xs: List[Int]): Seq[Int] = {
      for (
        i <- xs.indices;
        j <- xs.indices
        if i!= j && xs(i) > xs(j) &&  xs(i) % xs(j) == 0
      ) yield xs(i) / xs(j)
    }

    loop(list).head
  }
}
