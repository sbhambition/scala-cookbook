val regex = "[0-9]".r

val address = "101 Main St Euless 76040"
// created regular expression and then call replaceAllIn on that expression
regex.replaceAllIn(address, "x")

//use the string method in Scala

address.replaceAll("[0-9]", "x")


//replace first
address.replaceFirst("[0-9]", "x")
