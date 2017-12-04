package com.adventofcode

class Day03 {

  // brute force solution
  def circularMemory(input: Int): Int = {
    var level = 1
    var lastValue = 1.0

    while (lastValue <= input) {
      lastValue = math.pow(2 * level + 1, 2)
      level = level + 1
    }

    level = level - 1

    val side = 2 * level + 1

    val firstValueBottom = lastValue - side + 1

    val diffFromFirstValueBottom = input - firstValueBottom
    val diffFromCentral = 2 * level - diffFromFirstValueBottom

    diffFromCentral.toInt
  }
}
