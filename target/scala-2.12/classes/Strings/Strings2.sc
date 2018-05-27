// Splitting Strings
//splitting a string creates an Array with the words in string
"hello world".split(" ")

"hello world".split(" ") foreach (println)

val s = "eggs, milk, butter, COCO"
s.split(" ,").map(_.trim)

// _ is wildcard , for a map using _ means take all the values within that mapped string


//Substituting variables into string

val name = "Suj"
val age = 22
println(s"$name is $age yrs old")

// when we precede our string with a letter s,
// we're creating a processed String literal.

//adding to git
//Using expressions in STring literals

println(s"Age next year is: ${age + 1}")
println(s"Age is : ${age == 22}")


// s is a method