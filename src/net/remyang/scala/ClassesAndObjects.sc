package net.remyang.scala
import scala.collection.mutable.Map

object ClassesAndObjects {

  val csa = new CheckSumAccumulator               //> csa  : net.remyang.scala.CheckSumAccumulator = net.remyang.scala.CheckSumAcc
                                                  //| umulator@3581c5f3
  csa.add(1)
  csa.add(0)
  println(csa.checkSum())                         //> -1
  
  println(CheckSumAccumulator.calculate("abc"))   //> -38
}

class CheckSumAccumulator {
  private var sum = 0
  def add(b: Byte) { sum += b }
  def checkSum(): Int = ~(sum & 0xFF) + 1
}

object CheckSumAccumulator{
  private val cache = Map[String,Int]()
  
  def calculate(s:String):Int={
    if (!cache.contains(s)){
      val csa = new CheckSumAccumulator
      for(c<-s) csa.add(c.toByte)
      cache += (s -> csa.checkSum())
    }
    cache(s)
  }
}