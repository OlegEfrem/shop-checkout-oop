package com.oleg.efrem.shop.model

sealed abstract class Items(quantity: Int) {
  val price: Double
  def totalPrice: Double = quantity * price
}

case class Apples(quantity: Int) extends Items(quantity) {
  override val price: Double = 0.6
}

case class Oranges(quantity: Int) extends Items(quantity) {
  override val price: Double = 0.25
}

