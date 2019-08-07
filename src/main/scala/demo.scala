import org.apache.spark.sql.SparkSession

object demo {
  def main(args: Array[String]): Unit = {


    val spark = SparkSession.builder().appName("demo").master("local").getOrCreate

    val df = spark.read.option("inferSchema","true").option("header","true").csv("/home/rohit/Downloads/csv/2010-summary.csv") toDF()


    df.printSchema()

    df.filter("count > 20").show()
    df.groupBy("count").count().show()

  }
}