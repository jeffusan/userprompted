object PromptRecurse {

  def main(args: Array[String]) = {
    println("What is the answer?")
    getChoice
    Runtime.getRuntime().halt(0)
  }

  def getChoice: String = readLine() match {
    case "42" =>
      println("correct!")
      "42"
    case "41" =>
      println("almost! a little higher")
      getChoice
    case "43" =>
      println("very close, a little lower")
      getChoice
    case _ =>
      println(s" is not the answer")
      getChoice

  }
}
