

import scala.annotation.switch

//returning values from a loop
val a = "Myfriend"
val newArray = for (e <- a) yield e.toUpper
for (i <- 0 to a.length - 1) println(s"$i is ${a(i)}")

newArray.toCharArray
val e = Array("suj", "apple", "mango")
val newArray1 = for (e1 <- e) yield e1.toUpperCase


//using a counter inside a loop
//Approach1
for (e1 <- 0 until e.length) println(s"Element is ${e(e1)}")


//Approach2
for ((e2, count) <- e.zipWithIndex) println(s"$count is $e2")

//for loop counters

for (i <- 1 to 10) println(i)
for (i <- 1 to 10 by 2) println(i)
for (i <- 10 to 1 by -2) println(i)
for (i <- Range(1, 10) by 3) println(i)
for (i <- Range(1, 10) by 3) println(i)
//using guards

for (i <- 1 to 10 if (i < 4)) println(i)

//Looping over a map

val names = Map("fname" -> "Subash", "lname" -> "Sharma")
names.values //returns an array of values of Map
for (i <- names) println(i) //outputs key value pair

//best approach

for ((k, v) <- names) println(s"key: $k, value: $v")


//when we use a for yield with a collection , we are building  a new collection
//for/yield combination is referred as comprehension

//when you have an algorithm you want ot run on each element , you the anonymous function syntax

val alist = List(1, 2, 3, 4, 5)
val alist1 = List(1, 2, 3, 4, 5)
alist.foreach(println)
alist.foreach(e => println(e * 2))
alist1.foreach(e => println(e.toFloat))

for {i <- 1 to 10} yield i
//scala does it this way

1.to(10).map(((i) => i))

for {
  i <- 1 to 10
  if (i % 2 == 0)
} yield i

//converts to

1.to(10).withFilter(((i) => i.$percent(2).$eq$eq(0))).map(((i) => i))

//using a match expression like switch statement
val i = 0
i match {
  case 1 => println("January")
  case 2 => println("February")
  case 3 => println("March")
  case 4 => println("April")
  case 5 => println("May")
  case whoa => println("Unexpected case: " + whoa.toString)
}

val month =
  i match {
    case 1 => ("January")
    case 2 => ("February")
    case 3 => ("March")
    case 4 => ("April")
    case 5 => ("May")
    case whoa => println("Unexpected case: " + whoa.toString)
  }

//the switch annotation

class SwitchDemo {
  val i = 1
  val x = (i: @switch) match {
    case 1 => "One"
    case 2 => "Two"
    case _ => "Other"
  }
}

// of course you don't really need a switch statement if you have data strcutute that maps months numbers to month names, just use a map
val monthNumberToName = Map(
  1 -> "January",
  2 -> "February",
  3 -> "March",
  4 -> "April",
  5 -> "May",
  6 -> "June"
)
val monthName = monthNumberToName(4)


//using pattern matching in match expressions

def echoWhatYouGaveMe(x: Any): String = x match {
  //constant patterns

  case 0 => "Zero"
  case true => "True"
  case "hello" => "you said hello"
  case Nil => "Empty List"

  //sequence patterns
  case List(0, _, _) => " a three element list with 0 as the first element"
  case List(1, _*) => " a list beginning with 1 and any number of elements"
  case Vector(1, _*) => " a vector starting with 1 and having any number of elements "

  //tuples

  case (a, b) => s"got $a and $b"
  case (a, b, c) => s"got $a and $b and $c"

  //constructor patterns

  //case Person(first, "Sharma") => s"Found a Sharma, firstName = $first"

  case a: Array[Int] => s"an array of int :${a.mkString(",")}"
  case list: List[_] => s"a list of $list"
  case _ => "Unknown"


}

echoWhatYouGaveMe(List(1, 2, 3))
echoWhatYouGaveMe(List(1, 2))
echoWhatYouGaveMe(List(0, 2, 4))
echoWhatYouGaveMe(0, 2)
echoWhatYouGaveMe(Array(0, 2))
echoWhatYouGaveMe(List(0, 2))

//converting array to String

val anArray = Array(1, 2, 3, 4, 5)
anArray.mkString(",")


//println(echoWhatYouGaveMe(Person("Subash", "Sharma")))
