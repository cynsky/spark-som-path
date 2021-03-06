package com.esri

import org.apache.commons.math3.util.FastMath

class ExpDecay(initialValue: Double, numStep: Double) extends Decay {
  /**
    * The value of the decay for a given step in the range.
    *
    * @param step the step in the range.
    * @return the decay value at the step.
    */
  override def apply(step: Double): Double = {
    initialValue * FastMath.exp(-step / numStep)
  }
}

object ExpDecay extends Serializable {
  def apply(initialValue: Double, numStep: Double): ExpDecay = new ExpDecay(initialValue, numStep)
}