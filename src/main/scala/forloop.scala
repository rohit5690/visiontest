object forloop {
  def main(args: Array[String]): Unit = {
    for (i <- 1 to 5)
         {
           println("i using to " +i)
         }
    for (i <- 1 to 6 ; j <- 1 to 8) {
      println("i using to " + i + " " + j)
    }
    val lst = List(1,2,3,4,5,6,7,8,99,0,7,6,5)
  for( i <- lst) {
    println("i using lst" + i)
  }
    for (i <-  lst ; if i < 6){
      println("i using filter " + i)
    }

  }
}