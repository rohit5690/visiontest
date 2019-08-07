object matchexpression {
  def main(args: Array[String]): Unit = {
    val age = 18
    age match {
      case 20 => println(age)
      case 40 => println(age)
      case 18 => println(age)
      case 30 => println(age)
    }
  val result = age match{
    case 20 => age
    case 43 => age
    case 22 => age
    case 18 => age

  }
    println("result= " +result)

  }


}
