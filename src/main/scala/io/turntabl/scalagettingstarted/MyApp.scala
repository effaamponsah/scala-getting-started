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
        def odd (number:Int) = !even(number)

//        6
        def wordsToLower(words: String*) = words map(_.toLowerCase)

//        7
        def even2(number:Int) = number match {
                case i if(i % 2 == 0) => true
                case _ => false
        }

//        8
        def isWeekenDay(day:String) = day match{
                case "Friday" | "Saturday" | "Sunday" => true
                case _ => false
        }

//        9
        def areWeekendDays(days: String*) = days map( isWeekenDay(_))

//        10
         areWeekendDays("Tuesday") foreach(print)

//        11
        def printNtimes(word:String,n:Int) = for(a<-1 to n) print(word)

        printNtimes("Dennis", 100)
}

