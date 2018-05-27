package main.scala.ClassesAndProperties

object PersonTest extends App {

  val person1 = new Person("Subash", "Sharma")
  val person2 = new Person("Shane", "Watson")
  println(person1.firstname)
  person1.firstname = "Suj"
  println(person1.lastName)
  println(person1.toString)


}
