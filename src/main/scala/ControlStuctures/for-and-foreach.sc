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

1.to(10).withFilter(((i)=>i.$percent(2).$eq$eq(0))).map(((i)=>i))









