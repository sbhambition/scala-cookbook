package ClassesAndProperties

object TestFileUtils extends App {
  val contents: String = FileUtils.readFile("input.txt")
  FileUtils.writeToFile("output.txt", "contents")

  //  val fileUtils = new FileUtils//wont compile

}
