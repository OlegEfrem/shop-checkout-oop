package com.oleg.efrem.shop.model

sealed abstract class Items(quantity: Int) {
  val price: Double
  val totalPrice: Double = 0.0
}

case class Apples(quantity: Int) extends Items(quantity) {
  override val price: Double = 0.6
}

case class Oranges(quantity: Int) extends Items(quantity) {
  override val price: Double = 0.25
}


