//find the shortest and the highest range for nums
Short.MinValue
Int.MaxValue
Float.MaxValue
Double.MinPositiveValue

//parsing a number from a string
//courtesy of the StringLike trait
val a = "34"
a.toInt

//"hello".toInt
//numberformatexception

//Creating BigInt and BigDecimal instances direclty from strings

val b = BigInt("1")
val b1 = BigDecimal("23")

//Handling a base and radix
Integer.parseInt("10", 2)

//handling exceptions
def toInt(s: String): Option[Int] = {
  try {
    Some(s.toInt)
  } catch {
    case e: NumberFormatException => None
  }
}

//for handling exception cases, use the Scala Option, Some, None
toInt("Subash").getOrElse(0)
toInt("20").getOrElse(0)

//or use a match expression
val aString = "hello"
toInt(aString) match {
  case Some(n) => println(n)
  case None => println("That wasnot a number")
}

//Alternatives to Option/Some/None

//if tou like Option/Some/None , but need access to the exception informatuon, use
// try/success/failure
//Either, left, right









