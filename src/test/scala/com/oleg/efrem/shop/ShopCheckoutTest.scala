package com.oleg.efrem.shop

import com.oleg.efrem.shop.model.{Apples, Oranges}
import org.scalatest.{Matchers, WordSpec}

class ShopCheckoutTest extends WordSpec with Matchers {
  val service: ShopCheckout = ShopCheckout()

  "checkout" should {

    "return 2.05 for 3 Apples and 1 Orange" in {
      service.checkout(Seq(Apples(3), Oranges(1))) shouldBe 2.05
    }

  }
}
