import org.apache.spark.sql.SparkSession

object caseclass {
  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder().appName("caseclass").master("local").getOrCreate()
    val df = spark.read.option("interschema","true").option("header","true").parquet("/home/rohit/Downloads/parquet") toDF

    df.show()
  }
}
