package com.adventofcode

import scala.io.Source

object AdventOfCode extends App {

  println("================= DAY 1 =====================")
  val day01Input: List[Int] = Source.fromResource("day01-input.txt").getLines().next().toList.map(_.asDigit)
  val day01 = new Day01()
  println(day01.reverseCaptcha(day01Input))
  println(day01.partTwo(day01Input))

  println("================= DAY 2 =====================")
  val day02Input = Source.fromResource("day02-input.txt").getLines().filter(_.length > 0).map(line => line.split('\t').map(_.toInt).toList).toList
  val day02 = new Day02()
  println(day02.corruptionChecksum(day02Input))
  println(day02.evenlyDivisible(day02Input))

  println("================= DAY 3 =====================")
  val day03Input = 368078
  val day03 = new Day03()
  println(day03.circularMemory(day03Input))

  println("================= DAY 4 =====================")
  val day04Input: List[String] = Source.fromResource("day04-input.txt").getLines().toList
  val day04 = new Day04()
  println(day04.highEntropyPassphrases(day04Input))
  println(day04.passphrasesWithAnagrams(day04Input))
}
