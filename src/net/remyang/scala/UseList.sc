package net.remyang.scala

object UseList {
    // initialization
    val mammals = List("dog", "cat", "cow")       //> mammals  : List[String] = List(dog, cat, cow)
    val fish = "shark" :: "tuna" :: "ray" :: Nil  //> fish  : List[String] = List(shark, tuna, ray)
    
    // concatenation
    val animals = mammals ::: fish                //> animals  : List[String] = List(dog, cat, cow, shark, tuna, ray)
}