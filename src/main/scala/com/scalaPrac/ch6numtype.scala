package com.scalaPrac

import org.apache.spark.sql.SparkSession

object ch6numtype {
  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder().appName("abc").master("local").getOrCreate()
    val df = spark.read.option("inferschema", "true").option("header", "true").csv("/home/rohit/Downloads/retail-data/by-day/2010-12-05.csv").toDF()
    df.createOrReplaceTempView("retail")
    import org.apache.spark.sql.functions.{expr, pow}
    import org.apache.spark.sql.functions.col
    //val fabricatedQuantity = pow(col("Quantity") * col("UnitPrice"), 2) + 5
    //df.select(expr("CustomerId"), fabricatedQuantity.alias("realQuantity")).show(2)
    //df.selectExpr("CustomerId", "(POWER((Quantity * UnitPrice), 2.0) + 5) as realQuantity").show(2)

    //import org.apache.spark.sql.functions.{round, bround}
    //df.select(round(col("UnitPrice"), 1).alias("rounded"), col("UnitPrice")).show(5)}
    import org.apache.spark.sql.functions.{corr}
    //df.stat.corr("Quantity", "UnitPrice")
    //df.select(corr("Quantity", "UnitPrice")).show()
    //df.describe().show()

    import org.apache.spark.sql.functions.{count, mean, stddev_pop, min, max}
    //val colName = "UnitPrice"
    //val quantileProbs = Array(0.5)
    //val relError = 0.05
    //df.stat.approxQuantile("UnitPrice", quantileProbs, relError)
   // df.stat.crosstab("StockCode", "Quantity").show()

    import org.apache.spark.sql.functions.monotonically_increasing_id
    df.select(monotonically_increasing_id()).show(2)  }
}