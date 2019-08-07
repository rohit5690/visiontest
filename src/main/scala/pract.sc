import scala.io.StdIn.{readLine,readInt}
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source
object scalaTut {
  def main(args: Array[String]): Unit = {
    var numberGuess = 0
    do {
      print("Guess a number : ")
      numberGuess = readLine.toInt
    } while (numberGuess != 15)
    printf("you guessed the secret number %d\n", 15)

  }
}
