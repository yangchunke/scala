package net.remyang.scala

object PrintArgs {

  def max(x: Int, y: Int): Int = if (x > y) x else y
                                                  //> max: (x: Int, y: Int)Int

  def sideEffects(s: String): Unit = { println(s) }
                                                  //> sideEffects: (s: String)Unit

  def printArgs(args: Array[String]): Unit = {
    args.foreach { x => println(x) }
  }                                               //> printArgs: (args: Array[String])Unit

  def printArgs2(args: Array[String]): Unit = {
    // partially applied function
    args.foreach { println }
  }                                               //> printArgs2: (args: Array[String])Unit

  def printArgs3(args: Array[String]): Unit = {
    for (arg <- args)
      println(arg)
  }                                               //> printArgs3: (args: Array[String])Unit

  def printArgs4(args: Array[String]): Unit = {
    var localArgs = new Array[String](args.length)
    val i = 0
    while (i < args.length)
      localArgs(i) = args(i)
    localArgs.foreach { println }
  }                                               //> printArgs4: (args: Array[String])Unit
}