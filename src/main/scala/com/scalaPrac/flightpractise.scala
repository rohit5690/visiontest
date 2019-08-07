import org.apache.spark.sql.SparkSession

object flightpractise {
  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder().appName("flight").master("local").getOrCreate()
    val flight = spark.read.option("inferscema","true").option("header","true").csv("/home/rohit/Downloads/flight-data/csv") toDF()
    flight.createOrReplaceTempView("flight_data_2015")


  }
}

