package org.ruivieira.science.stats

object MDL {

  def levels(data: Seq[Int]): Seq[Int] = data.distinct.sorted

}
