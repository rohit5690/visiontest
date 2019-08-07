object whileloop {
  def main(args: Array[String]): Unit = {
    var x = 0
    while (x <= 20) {
      println("x = " + x)
      x += 2
    }
    var y = 0
    do{
      println("y = "+ y)
      y += 1
    } while (y < 10)
  }

}
