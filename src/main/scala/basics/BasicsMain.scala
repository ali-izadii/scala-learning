package com.scala.practice
package basics

@main def BasicsMain(): Unit =
  println("Basics")


def isTure(t: Matchable): Boolean = t match {
  case 0 | "0" | false => false
  case _ => true
}
