//processing string one character at a time

val upper = "hello, world".map(c => c.toUpper)
//reduce the code above using Scala's _ character
upper.map(_.toUpper)

//with sequence of characters we can chain collection methods together to achieve above result as follows
//use a filter to filter out 'l' and then map that string to convert to UpperCase
val upper1 = "hello world".filter(_ != 'l').map(_.toUpper)


for (c <- "helloworld") println(c)

"hello world".foreach(println)

//to write a for loop to work like a map methid, add a yeild statement to the end of the
// loop.

val upper2 = for (c <- "hello world") yield c.toUpper
val upper3NoL = for {
  c <- "hello world"
  if c != 'l'
} yield c.toUpper

//you can use a for loop with braces in scala

//Scala treats a string as a sequence of characters.

"HELLO".map(c => (c.toByte + 32).toChar)

val a = 's'
a.toByte
's'.toByte //converts a char to its unicode value (number)

//second example passing an algorithm to a map method

"HELLO".map {
  c => (c.toByte + 32).toChar
}

//so map method has an implicit loop and in that loop, it passes once character at a time

//Creating a custom method and passing it to  a map

def toLower(c: Char): Char = {
  (c.toByte + 32).toChar
}

"SUBASH".map(toLower)



