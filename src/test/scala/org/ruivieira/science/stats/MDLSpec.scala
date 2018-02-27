package org.ruivieira.science.stats

import org.scalatest.FlatSpec
import org.scalatest._
import Matchers._

class MDLSpec extends FlatSpec {

  "The levels" should "provide the correct results" in {
    val x = Seq(1, 3, 3, 2, 5, 5, 6, 4)
    val levels = MDL.levels(x)
    levels should be (Seq(1, 2, 3, 4, 5, 6))
  }

}
