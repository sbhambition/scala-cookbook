val v = Vector(1, 2, 3, 4)
for (i <- v if i > 1) println(i)

v.map(_ * 2)
v.filter(_ > 1)
v.sum

// AT the high level Scala Collection classes begin with Traversable and Iterable traits and
//extend to 3 main categories of Seq, Set, Map. Sequence further branch off to indexed and linear sequences

//most scala collection methods take either a function or a predicate, predicate is a boolean ,

//Filtering methods ; to filter a collection
//Transformer methods: to create a new output collection typically using an algorithm
//Grouping methods
//Informational and mathematical methods
//Others
//flatten converts a list of lists into one list
//Drop the null keyword from your vocabulary and use try/success/Failure and Option/Some/None instead
