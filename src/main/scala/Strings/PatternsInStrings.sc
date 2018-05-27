
//string manipulation

val a = "subash"
val b = "sharma"

a + b //concats
a == b //returns false

val hello = "helloworld"
hello.concat("world") //concat

Array(1, 2, 3).foreach(println) //print array

"helloworld".getClass.getName //return the name of the class
"hello".foreach(println)

//prints the unicode of each letter
val c = "hello"
c.getBytes.foreach(println)


//filter out specific letter in a word

val result = "hello how are you".filter(_ != 'o')

//accessing a character in string

"hello".charAt(0) //in java

"hello" (0) //scala

//method chaining

"scala".drop(2).take(3).toUpperCase //return ALA
"scala".drop(2).take(3).capitalize //return Ala

val string1 = "hi"
val string2 = "hi"
string1 == string2
string1.equals(string2)

//pleasant benefit of == method , doesnot throw a null pointer exception on a basic
//test if a string is null

val s: String = null

//compare two strings in a case insensitive way by converting to either uppercase or lowercase

val a1 = "Aone"
val b1 = "aoNe"

a1.toUpperCase() == b1.toUpperCase()

//Calling a method on a null String throws exception

//s.charAt(0) //throws nullpointer exception


/*
In scala you test object equality with the == method.  The == method define in the AnyRef class first
  checks for null values and then calls the equals method on the first object (ie this) to see if the two objects are equal
*/



//Creating multiline Strings

val subash =
  """ hi there
    |this is subash
    |sharma
    |how r u doing
  """.stripMargin









