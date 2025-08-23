package com.scala.practice
package collections

object VectorBasic extends App {
  val v1 = Vector.apply(1, 2, 3)
  val v2 = (1 to 10).toVector
  val v3 = ('a' to 'g').by(2).toVector  //Vector(a, c, e, g)
  val v4 = ('a' until 'g' by 2).toVector  //Vector(a, c, e)
  val v5 = Vector.range(1, 10, 2)
  val v6 = Vector.fill(3)("make") //Vector(make, make, make)
  val v7 = Vector.tabulate(3)(i => i * 5) //Vector(0, 5, 10)
  println(v7)
}
