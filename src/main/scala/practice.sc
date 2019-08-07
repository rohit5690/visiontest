
    var i = 0
    /*
    while(i <= 10){
      println(i)
      i += 1
    }
    */

    /*
    do {
    println(i)
      i += 1
    } while (i <= 20)

     */


    /*
    for (i <- 1 to 10) {
      println(i)
    }

     */


/*
val randLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
for (i <- 0 until randLetters.length){

  // Get the letter in the index of the String
  println(randLetters(i))
}
// Used to iterate through a list
val aList = List(1,2,3,4,5)
for(i <- aList){
  println("List Item " + i)
}
// Store even numbers in a list
var evenList = for { i <- 1 to 20
                     // You can put as many conditons here separated with semicolons
                     // as you need
                     if (i % 2) == 0
} yield i

println("Even List")
for(i <- evenList)
  println(i)
// This loop assigns a value to the 1st variable and it retains
// that value until the 2nd finishes its cycle and then it iterates
for (i <- 1 to 5; j <- 6 to 10){
  println("i: " + i)
  println("j: " + j)
}
// There is no break or continue in Scala
def printPrimes() {

  val primeList = List(1,2,3,5,7,11)
  for (i <- primeList){

    // Works like break if you return from a function
    if(i == 11){
      return
    }

    // Works like continue
    if (i != 1){
      println(i)
    }

  }

}
printPrimes


 */