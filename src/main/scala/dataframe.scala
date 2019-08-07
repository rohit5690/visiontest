import org.apache.spark.{SparkConf, SparkContext}

object dataframe {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setAppName("dataframe").setMaster("local")

    val sc = new SparkContext(conf)
    val b = sc.textFile("/home/rohit/Downloads/csv/2011-summary.csv")
    b.collect().foreach(println)
  }
}
