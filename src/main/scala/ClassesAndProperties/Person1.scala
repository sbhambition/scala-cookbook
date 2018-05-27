

// the case class
case class Person1(var name: String, var age: Int)

// the companion object

object Person1 {
  def apply() = new Person1("<no name>", 0)
  def apply(name: String) = new Person1(name, 0)
}
//The following test code demonstrates that this works as desired:
object CaseClassTest extends App {
  val a = Person1() // corresponds to apply()
  val b = Person1("Pam") // corresponds to apply(name: String)
  val c = Person1("William Shatner", 82)
  println(a)
  println(b)
  println(c)
  // verify the setter methods work
  a.name = "Leonard Nimoy"
  a.age = 82
  println(a)
}