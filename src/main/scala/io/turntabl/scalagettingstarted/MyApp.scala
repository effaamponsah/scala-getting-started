package io.turntabl.scalagettingstarted

object MyApp extends App {
        print("Yesss. Here i am \n")
//        1

        val name: String ="Dennis"
        val place: String ="Kumasi"

        print(s"$name was born in $place \n")

//        3
        def threeTimes(s : String) = for(a<-1 to 3) print(s)

        threeTimes("James")

//        4
        def even(number:Int) = if(number % 2 == 0) true else false

        even(2)

//        5
//        def odd (number:Int) =
}
