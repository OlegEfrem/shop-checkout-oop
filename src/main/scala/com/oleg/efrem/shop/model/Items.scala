package com.oleg.efrem.shop.model

sealed abstract class Items(quantity: Int) {
  val price: Double
  val offer: Option[Offer]

  def totalPriceWithOffer: Double =
    offer match {
      case Some(off) => quantity / off.buy * off.pay * price + quantity % off.buy * price
      case None => totalPrice
    }

  def totalPrice: Double = quantity * price
}

case class Apples(quantity: Int) extends Items(quantity) {
  override val price: Double = 0.6
  override val offer: Option[Offer] = Some(Offer(2, 1))
}

case class Oranges(quantity: Int) extends Items(quantity) {
  override val price: Double = 0.25
  override val offer: Option[Offer] = Some(Offer(3, 2))
}

