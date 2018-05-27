//Converting between numeric types

//convert a double to int
19.45.toInt

//use the to* methods to convert one number type to another,
//To avoid potential conversion errors you the isValid method

val a = 1000L
a.isValidByte
a.isValidChar
a.isValidInt
a.isValidShort

//Overiding the default numeric type

val a1 = 1

val a2 = 1d
val a3 = 3f
// numeric type is automatically inferred
//to override you can jsut use annotation

val a4: Int = 5
val a5: Double = 3.56




0.1 + 0.2 //doesnot return 0.3 exactly, use some precision function (define ur own)

//Generating Random numbers
val r = scala.util.Random
r.nextInt()
r.nextInt(100) //specifies int from 0 99

var range = 0 to r.nextInt(50)
println(range)
range.foreach(println)
//yeild returns a Vector

//Creating Range , lIst and Array of nums

val rn = 1 to 10
val rn1 = 1 to 10 by 3
rn1.foreach(println) //using foreach

for (i <- rn1) println(i) //using for loop

val x = 1 to 10 toArray
val y = 2 to 10 toList
//x and y being range we can just add to* methods at the end

val newrn = for (i <- rn) yield i * 2


for (i <- rn) yield i.toDouble


//Formatting numbers and currency
val pi = scala.math.Pi

println(f"$pi%1.5f")
println(f"$pi%06.2f")
//for scala version prior to 2.10 use the format method

"%06.2f".format(pi)


















