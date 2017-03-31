object PromptCase {

  def main(args: Array[String]) = {

    var pass = false
    println("What is the answer?")
    do {
      pass = readLine() match {
        case "42" =>
          println("correct!")
          true
        case "41" =>
          println("almost! a little higher")
          false
        case "43" =>
          println("very close, a little lower")
          false
        case _ =>
          println(s" is not the answer")
          false
      }
    } while(!pass)

    Runtime.getRuntime().halt(0)
  }
}
