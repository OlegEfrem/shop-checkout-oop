package com.oef.shop.checkout.impl

import com.oef.shop.checkout.ShopCheckout
import com.oef.shop.checkout.model.Items

private[checkout] class DefaultShopCheckout extends ShopCheckout {
  override def checkout(items: Seq[Items]): Double = items.map(_.totalPrice).sum

  override def checkoutWithOffer(items: Seq[Items]): Double = items.map(_.totalPriceWithOffer).sum
}
