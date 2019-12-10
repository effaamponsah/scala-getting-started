package io.turntabl.pricing
import scala.concurrent._
import ExecutionContext.Implicits.global
import scala.util.{Success, Failure}
object Driver extends App {
  val reference = PriceService.getPricing("Milk")
//  print(reference)

//  Implementing future
  val rff = Future {
    PriceService.getPricing("Milk")
  }
//  print(rff)    //prints not completed
  rff onComplete {
    case  Success(price) =>print(price)
    case Failure(e) => print("Failed to get price")
  }

  def pricingStrategy(reference:Int) = reference match {
    case expensive if reference > 9 => "Too expensive"
    case _ => "Normal"
  }

  val action = Future {
    PriceService.getPricing("Pizza")
  } map pricingStrategy

}