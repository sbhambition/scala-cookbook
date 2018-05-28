package ClassesAndProperties

// depending on needs, creating a private class constructor may not be necessary at all. for instance in Java, we can create a utility class by defining static
//methods in a Java Class, but in scala you do the same thing by putting all the methods in a Scala object.
object FileUtils {
 def readFile(fileName: String): String ={
   //code here..
 }
  def writeToFile(fileName: String, contents: String) {}
  //code here
}

