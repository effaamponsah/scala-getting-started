package io.turntabl.pricing

object PriceService {
  val prices =Map(
    "Pizza" -> 10.0,
    "Milk" -> 3,
    "Coffee" -> 5
  )

  def getPricing(product:String)={
    Thread.sleep(2000)
    prices(product)
  }
}