package com.github.agetakoyaki29.scala

package object mydouble {
  implicit def d2mrd(d: Double) = new MyRichDouble(d)
}
