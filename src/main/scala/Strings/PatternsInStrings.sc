import scala.util.matching.Regex
//problem; you need to determine whether a String contains a regular expression pattern

//Solution: Create a regex object by invoking the .r method on a String, and then use that pattern
//findFirstIn  - one match
//findAllIn - all matches

val numPattern = "[0-9]+".r
val address = "123 Main Street Suite 101"

val match1 = numPattern.findFirstIn(address) // returns Option String
val matches = numPattern.findAllIn(address) //returns non -empty iterator
// if find all cant find a match , returns an empty iterator
matches.foreach(println)

//create an array
numPattern.findAllIn(address).toArray

//Discussion
/*
Adding a .r to a method is the easiest way to create a regex but the other way is to import
scala.util.matching.Regex class
 */

val numPattern1 = new Regex("[0-9]+")
numPattern1.findAllIn(address).toArray

//Handling the Option returned by findFirstIn

numPattern.findFirstIn(address)

//returns Some (123), Option[String], option is a container that holds either zero or one values, if found returns Some(value) else returns None

val address1 = "no address given"
numPattern.findFirstIn(address1)
//returns none

// Normal way to use with an Option is to use one of the following approaches

//1. Call getOrElse on the value
//2. Use the Option in a match expression
//3. Use the option in a foreach loop

//option in match expression

match1 match {
  case Some(s) => println(s"Found $s")
  case None =>

}
//option in foreach loop
match1.foreach { e => println(s"Found a match $e") }

//option in getorElse, if it finds a match get the match else default

match1.getOrElse("match not found")
