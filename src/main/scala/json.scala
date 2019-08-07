/*
import org.apache.spark.sql.SparkSession


val spark = SparkSession
  .builder()
  .appName("Spark SQL basic example")
  .master("local")
  .getOrCreate()


case class person (name:String,age:Int)

import spark.implicits._o

val caseClassDS = Seq(person("Andy",32)).toDS()
    caseClassDS.show()
*/