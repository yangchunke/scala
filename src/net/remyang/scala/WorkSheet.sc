package net.remyang.scala

object WorkSheet {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  val x = 1                                       //> x  : Int = 1
  def increase(i: Int) = i + 1                    //> increase: (i: Int)Int
  increase(x)                                     //> res0: Int = 2

  def gcd(a: Int, b: Int): Int = {
    if (b == 0) a else gcd(b, a % b)
  }                                               //> gcd: (a: Int, b: Int)Int
  gcd(14, 7)                                      //> res1: Int = 7

  def factorial(n: Int): Int = {
    def factorialInternal(acc: Int, n: Int): Int = {
      if (n == 0) acc else factorialInternal(acc * n, n - 1)
    }
    factorialInternal(1, n)
  }                                               //> factorial: (n: Int)Int
  factorial(4)                                    //> res2: Int = 24
}