package com.oleg.efrem.shop
import com.oleg.efrem.shop.model.Items

class DefaultShoptCheckout extends ShopCheckout {
  override def checkout(items: Seq[Items]): Double = items.map(_.totalPrice).sum

  override def checkoutWithOffer(items: Seq[Items]): Double = 0.0
}
