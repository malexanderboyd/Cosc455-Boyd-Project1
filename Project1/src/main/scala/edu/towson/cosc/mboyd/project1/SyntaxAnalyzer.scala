package edu.towson.cosc.mboyd.project1

class SyntaxAnalyzer extends SyntaxAnalyzerTraits {

  val DocB : List[String] = List("\\BEGIN")
  val DocE : List[String] = List("\\END")
  val TITLE : List[String] = List("\\TITLE")
  val HEADING : List[String] = List("#")
  val PARAGRAPH : List[String] = List("\\PARAB", "\\PARAE")
  val BOLD : List[String] = List("**")
  val ITALIC : List[String] = List("*")
  val UList : List[String] = List("+")
  val NEWLINE : List[String] = List("\\\\")
  val OSB : List[String] = List("[")
  val CSB : List[String] = List("]")
  val OPB : List[String] = List("(")
  val CPB : List[String] = List(")")
  val VAR_DEF : List[String] = List("\\DEF")
  val VAR_USE : List[String] = List("\\USE")

  var errorFound : Boolean = false
  def setError() = errorFound = true
  def resetError() = errorFound = false
  def getError: Boolean = errorFound

  def gittex() = {
    resetError()
    if (!errorFound) GittexBegin()
    if (!errorFound) Title()
    // if (!errorFound) Body()
    if (!errorFound) GittexEnd()
  }

  def GittexBegin(): Unit = {
    // Check if current token is the document begin token
    if(DocB contains src.Compiler.currentToken) {
      src.Compiler.Scanner.getNextToken()
    } else {
      println("Line: " + src.Compiler.lineCount + ": SYNTAX ERROR: Expected \\BEGIN at start of input when " + src.Compiler.currentToken + " was found.")
      setError()
    }
  }

  def GittexEnd(): Unit = {
    if(DocE contains src.Compiler.currentToken) {
      src.Compiler.Scanner.getNextToken()
    } else {
      println("Line: " + src.Compiler.lineCount + ": SYNTAX ERROR: Expected \\END was expected at end of input " + src.Compiler.currentToken + " was found.")
      setError()
    }

  }

  def Title() = {
    if(TITLE contains src.Compiler.currentToken) {
      src.Compiler.Scanner.getNextToken()
    } else {
      println("Line: " + src.Compiler.lineCount + ": SYNTAX ERROR: Expected \\TITLE after \\BEGIN when " + src.Compiler.currentToken + " was found.")
      setError()
    }
  }



}