package com.adventofcode

import scala.io.Source

object AdventOfCode extends App {

  val day01Input: List[Int] = Source.fromResource("day01-input.txt").getLines().next().toList.map(_.asDigit)
  val day01 = new Day01()
  println(day01.reverseCaptcha(day01Input))
  println(day01.partTwo(day01Input))

  val day02Input = Source.fromResource("day02-input.txt").getLines().filter(_.length > 0).map(line => line.split('\t').map(_.toInt).toList).toList
  val day02 = new Day02()
  println(day02.corruptionChecksum(day02Input))
  println(day02.evenlyDivisible(day02Input))
}
