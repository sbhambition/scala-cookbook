class Person(var name: String)

val person1 = new Person("subash")
person1.name
person1.name = "Sujata"
person1.name

// showing var vs val difference

class Student(name: String)

val student = new Student("Subash")

//student.name //cannot access name and cannot reassign or mutate
//val student = new Student("Subash")

class Instructor(private val name: String) {
  val fullName = name + "[Professor]"

}

val instructor = new Instructor("Stefan Andrei")
instructor.fullName

class Instructor1(private var name: String) {
  def getName {
    println(name)
  }
}

val instructor1 = new Instructor1("Rafael Nadal")
instructor1.getName
//instructor.name //can't access name
//instructor.name = //can't set new value "Bran Cooper"

// the fields can now be access only from within the members if the class