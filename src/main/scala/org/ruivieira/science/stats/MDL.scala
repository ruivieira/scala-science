package org.ruivieira.science.stats

object MDL {

  def levels(data: Seq[Int]): Seq[Int] = data.distinct.sorted

  def barrier(data: Seq[Int], value: Int): Int = data.filter(_ > value).head

}
