package ClassesAndProperties

//a simple way to enforce Singleton pattern in Scala is to make the primary constructor private and to define a getInstance method in the companion object
// A companion object is simply an object that's defined in the same file as the class , where the object and class have the same name . if you declare a class named Foo in
// in a file Foo.scala and then declare an object Foo in the same file, the Foo object is the companion object for the Foo class.

//A companion object has several purposes and one purpose is that any method declared in a companion object will appear to be a static
//method on the object

class Brain private {
  override def toString = "This is the brain."
}

//this is the companion object of the Brain class, and only it can have one instance of the Brain class
object Brain {
  val brain = new Brain

  def getInstance = brain
}

object SingletonTest extends App {

  //val brain1 = new Brain //this wont compile

  // this works
  val brain = Brain.getInstance
  println(brain)
}

