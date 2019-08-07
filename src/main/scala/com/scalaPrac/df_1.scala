package com.scalaPrac
import org.apache.spark.sql.functions.lit

import org.apache.spark.sql.SparkSession

object df_1 {
  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder().appName("abcdef").master("local").getOrCreate()
    val df = spark.read.json("/home/rohit/Downloads/flight-data/json/2010-summary.json").toDF()
    df.select("ORIGIN_COUNTRY_NAME", "DEST_COUNTRY_NAME").distinct().count()

  }

}
