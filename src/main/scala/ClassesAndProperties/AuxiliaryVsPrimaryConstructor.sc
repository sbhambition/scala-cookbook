

//primary constructor
class Pizza(var crustSize: Int, var crustType: String) {
  //auxiliary constructor
  def this(crustSize: Int) {
    this(crustSize, Pizza.DEFAULT_CRUST_TYPE)
  }

  //auxiliary constructor
  //  def this(crustType: String) {
  //    this(Pizza.DEFAULT_CRUST_SIZE, crustType)
  //  }

  //auxiliary constructor that call earlier constructor and not the primary constructor
  def this(crustType: String) {
    this(Pizza.DEFAULT_CRUST_SIZE)
    this.crustType = Pizza.DEFAULT_CRUST_TYPE
  }

  //zero-arg auxiliary constructor
  def this() {
    this(Pizza.DEFAULT_CRUST_SIZE, Pizza.DEFAULT_CRUST_TYPE)
  }

  override def toString = s" A $crustSize pizza with a $crustType crust"

}

object Pizza {
  val DEFAULT_CRUST_SIZE = 12
  val DEFAULT_CRUST_TYPE = "THIN"
}

val p1 = new Pizza(Pizza.DEFAULT_CRUST_SIZE, Pizza.DEFAULT_CRUST_TYPE)
val p2 = new Pizza(Pizza.DEFAULT_CRUST_TYPE)
val p3 = new Pizza(Pizza.DEFAULT_CRUST_SIZE)
val p4 = new Pizza

p1.toString
p2.toString
p3.toString
p4.toString

//auxiliary constructors are created with def using this
//each auxiliary constructor must begin with the call to a previously defined constuctor
//each constructor must have a different signature
//one constructor calls another constructor with the name this
//above all the auxiliary constructor call the primary constructor but it doesnot have to be like that

//if you want the accessors and mutator to be generated for you put them in the primary constructor


//generating auxiliary constructor for case classes
case class Person(var name: String, var age: Int)

val p = Person1("John Smith", 30) //when we write this , scala complier converts it to this
//val p = Person.apply("John smith", 30)
//this is the call to the apply method of the companion object of the Person Class

/*
object Person {
  def apply() = new Person1("<no -name>", 0)

  def apply(name: String) = new Person1(name, 0)
}

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
}*/
