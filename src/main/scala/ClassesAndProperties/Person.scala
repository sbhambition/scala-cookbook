package main.scala.ClassesAndProperties

class Person(var firstname: String, var lastName: String) {
  println("the constructor begins")

  //some class fields
  private val HOME = System.getProperty("user.home")
  var age = 0
  // some methods

  override def toString = s"$firstname $lastName is $age years old"

  def printHome: Unit = {
    println(s" HOME = $HOME")

  }

  def printfullName: Unit = {
    println(this)
  }

  printHome
  printfullName
  println("Still in the constructor")

}

// the variables firstname and lastname are mutable, so they can be changed once they are initilaly set.
// Since they are mutable, Scala generates both the accessor and muttor methods for them.
//so given the instance p of type person we can change the values like this
//p.firstName= "Scott"
//p.lastName = "Styris"

//The home variable is declared as private val, just equivalent to final private in Java
// and cannot be accessed directly and value can't be changed

/*
Anything declaread within the body of the class other than the method declaration is a part of the primary constructor
because auxiliary constructor should always call a previously defined constructor in the same class, auxiliary constructors will also execute the same code

1. if a field is declared var , scala generates both getter and setter
2. if a field is declared val , scala generates only getter
3. if a field is declared val or var and declared private , which prevents getter and setter from being generated
4. if a field doesnot have var or val, scala becomes conservative and doesnot generate getters and setters for you
 */

