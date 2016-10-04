package src

import Cosc455.Boyd.Project1.SyntaxAnalyzer

import scala.io.Source
object Compiler {
  var currentToken : String = ""
  var lineCount = 0
  val Scanner = new LexicalAnalyzer
  val Parser = new SyntaxAnalyzer

  def main(args: Array[String]) = {
    // get input file name from command line argument
    val filename = args(0)

    // for each line read from file, scan and parse
    for(line <- Source.fromFile(filename).getLines()) {
      // get the first Token
      println("Current Line being Analyzed: " + line)
      Scanner.start(line)
      // keep lineCount
      lineCount += 1
      println("Current Token going to Parser: " + currentToken)
      Parser.Document()

      if(Parser.getError)
          println("Error In Parser.")

    }

  }
}