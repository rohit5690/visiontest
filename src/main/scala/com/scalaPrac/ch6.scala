package com.scalaPrac

import org.apache.spark.sql.SparkSession

object ch6 {
  def main(args: Array[String]): Unit = {
  val spark = SparkSession.builder().master("local").appName("abd").getOrCreate()
    val df = spark.read.option("inferschema","true").option("header","true").csv("/home/rohit/Downloads/retail-data/by-day/2010-12-01.csv").toDF()
    df.printSchema()
    df.createOrReplaceTempView("retailData")
    import org.apache.spark.sql.functions.col
    //df.where("InvoiceNo <> 536365")
      //.select("InvoiceNo", "Description")
      //.show(5, false)

    val priceFilter = df.col("UnitPrice") > 600
    val descripFilter = col("Description").contains("POSTAGE")
    df.where(col("StockCode").isin("DOT")).where(priceFilter.or(descripFilter))
      .show()

  }

}
