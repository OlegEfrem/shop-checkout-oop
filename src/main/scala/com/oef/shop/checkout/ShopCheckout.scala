package com.oef.shop.checkout

import com.oef.shop.checkout.impl.DefaultShopCheckout
import com.oef.shop.checkout.model.Items

trait ShopCheckout {
  def checkout(items: Seq[Items]): Double
  def checkoutWithOffer(items: Seq[Items]): Double
}

object ShopCheckout {
  def apply(): ShopCheckout = new DefaultShopCheckout
}
