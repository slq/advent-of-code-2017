package com.adventofcode

class Day04 {

  def uniquePhrases(str: String): Boolean = {
    val phrases = str.split(" ")
    phrases.size == phrases.distinct.length
  }

  def highEntropyPassphrases(list: List[String]): Int = list.count(uniquePhrases)

  def hasNoAnagrams(words: Array[String]): Boolean = {
    val map = words.map(word => word.groupBy(identity).mapValues(_.length))
    map.length == map.distinct.length
  }

  def passphrasesWithAnagrams(list: List[String]): Int = list.map(_.split(" ")).count(words => hasNoAnagrams(words))
}
