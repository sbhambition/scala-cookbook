// usecases of Option
// when a var field in a class doesnot have an initial default value, initialize it with Option instead of null
//when a method doesnot produce the intended result , you may be tempted to return null, use an Option or Try instead
//if you are working with a Java Library that returns null , convert it to an Option or something else

//initialize var with Options and not null
case class Address(city: String, state: String, zip: String)

class User(email: String, password: String) {
  var firstName: String = _
  var lastName: String = _
  var address: String = _

}

//this is bad , coz the firstname, lastname and address are initialized to null, and can cause problems with the application if they are not assigned before they are accessed
//A better approach
case class Address1(city: String, state: String, zip: String)

class User1(email: String, password: String) {

  var firstName = None: Option[String]
  var lastName = None: Option[String]
  var address = None: Option[Address1]

}

val u = new User1("subash@example.com", "secret")
u.firstName = Some("su")
u.lastName = Some("Sharma")
//u.address = Some("Dallas", "TX", "75038")

//returning an option from a method

def toInt(a: String): Option[Int] = {
  try {
    Some(Integer.parseInt(a.trim))
  }
  catch {
    case e: Exception => None
  }
}

val num = toInt("josh") // none
val num1 = toInt("56") //returns Some(56)

//Getting the value from an option

//use getOrElse, use match , use foreach

val x = toInt("1").getOrElse(0)
//since an option is a collection of zero or one elements, for each can be used
toInt("1").foreach(i => println(s"Got an int $i"))

toInt("1") match {
  case Some(i) => println(i)
  case None => println("That didn't work")
}

//Using Option with Scala Collections

val bag = List(1, 3, "hello", "bob", 5, 6)
//we want a list of all integers from this List
