
object Prompt {

  def main(args: Array[String]) = {

    var in = ""
    var pass = false
    println("What is the answer?")
    do {
      in = readLine()
      if(in == "42") {
        println(s"correct!")
        true
      } else if(in == "43") {
        println("very close, a little lower")
        false
      } else if(in == "41") {
        println("almost! a little higher")
        false
      } else {
        println(s"$in is not the answer")
        false
      }
    } while(!pass)
    Runtime.getRuntime().halt(0)
  }
}
