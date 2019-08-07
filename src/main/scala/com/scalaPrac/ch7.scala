package com.scalaPrac

import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.functions.count
import org.apache.spark.sql.functions.countDistinct
import org.apache.spark.sql.functions.approx_count_distinct
import org.apache.spark.sql.functions.{first, last}
import org.apache.spark.sql.functions.{min, max}
import org.apache.spark.sql.functions.sumDistinct
import org.apache.spark.sql.functions.{sum, count, avg, expr}
import org.apache.spark.sql.functions.{var_pop, stddev_pop}
import org.apache.spark.sql.functions.{var_samp, stddev_samp}
import org.apache.spark.sql.functions.{collect_set, collect_list}
object ch7 {
  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder().master("local").appName("abc").getOrCreate()
    val df = spark.read.option("inferschema","true").option("header","true").csv("/home/rohit/Downloads/retail-data/all/*.csv").coalesce(5)
    df.cache()
    df.createOrReplaceTempView("dftable")
   // df.select(min("Quantity"), max("Quantity")).show()
    //df.select(sumDistinct("Quantity")).show()
   // df.select(
     // count("Quantity").alias("total_transactions"),
      //sum("Quantity").alias("total_purchases"),
      //avg("Quantity").alias("avg_purchases"),
      //expr("mean(Quantity)").alias("mean_purchases"))
      //.selectExpr(
       // "total_purchases/total_transactions",
        //"avg_purchases",
        //"mean_purchases").show()
    //df.select(var_pop("Quantity"), var_samp("Quantity"), stddev_pop("Quantity"), stddev_samp("Quantity")).show()
    //df.agg(collect_set("Country"), collect_list("Country")).show()

    df.groupBy("InvoiceNo", "CustomerId").count().show()
  }

}
