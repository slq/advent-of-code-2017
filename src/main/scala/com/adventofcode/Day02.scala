package com.adventofcode

class Day02 {
  def corruptionChecksum(list: List[List[Int]]): Int = list.foldLeft(0) { (acc, elem) => acc + elem.max - elem.min }
}
