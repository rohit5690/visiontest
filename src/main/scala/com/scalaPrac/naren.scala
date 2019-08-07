package com.scalaPrac

import org.apache.spark.{SparkConf, SparkContext}

object naren {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setAppName("problem10").setMaster("local")
    val sc = new SparkContext(conf)

    val sentence = sc.textFile("/home/rohit/Downloads/CCA Dumps/CCA175/PDF Version/abc.txt").glom()
    
  }

}
