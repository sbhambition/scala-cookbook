import scala.util.{Failure, Success, Try}
//Try/success/failure

//Try as an approach that's similar to Option, but returns failure information rather than none

//the result of a computation wrapped in a Try will be one of its subclasses. Success or Failure
//if the computation succeeds, a Success Instance is returned, and the Failure will hold information about that failed.
//if we don't care about the error message , we can simply use get or else


def divideXbyY(x: Int, y: Int): Try[Int] = {
  Try(x / y)
}
divideXbyY(4, 0).getOrElse(0)


//to obtain the success value , we can use match case or foreach
//to return the failure message

divideXbyY(4, 0) match {
  case Success(i) => println(s"Sucess, The value is $i")
  case Failure(i) => println(s"Failure, The value is $i")
}

//use for each loop

divideXbyY(4, 4).foreach(println)
//for failure doesnot return any value

// so we can use match expression for that

//or for the value returned if it is failure we can check the failure and convert it to toString

val x = divideXbyY(4, 0)
if (x.isSuccess) x.toString //returns Success(2)
if (x.isFailure) x.toString //return the failure message

//Using Either left and right

//Either is analogous to Try , right is similar to Success and left to Failure

def divideAbyB(a: Int, b: Int): Either[String, Int] = {
  if (b == 0) Left("Dude, can't divide by 0")
  else Right(a / b)
}

divideAbyB(4, 0).foreach(println).toString
divideAbyB(4, 2).getOrElse(0)


divideAbyB(4, 0) match {
  case Right(i) => println(s"Sucess, The value is $i")
  case Left(i) => println(s"Failure,  $i")
}
val y = (divideAbyB(4, 2))
y.isLeft
y.left
y.right

// you can use Try instead of Either class now

