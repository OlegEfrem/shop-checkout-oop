package com.oleg.efrem.shop

import com.oleg.efrem.shop.model.{ Apples, Oranges }
import org.scalatest.{ Matchers, WordSpec }

class ShopCheckoutTest extends WordSpec with Matchers {
  val service: ShopCheckout = ShopCheckout()

  "checkout" should {

    "return 2.05 for 3 Apples and 1 Orange" in {
      service.checkout(Seq(Apples(3), Oranges(1))) shouldBe 2.05
    }

  }

  "checkoutWithOffer" should {

    "allow buy one, get one for free on Apples" in {
      service.checkoutWithOffer(Seq(Apples(2))) shouldBe 0.6
    }

    "allow buy 3 oranges for the price of 2" in {
      service.checkoutWithOffer(Seq(Oranges(3))) shouldBe 0.5
    }

  }

}
