package com.oleg.efrem.shop

import com.oleg.efrem.shop.model.Items

trait ShopCheckout {
  def checkout(items: Seq[Items]): Double
}

object ShopCheckout {
  def apply(): ShopCheckout = new DefaultShoptCheckout
}
