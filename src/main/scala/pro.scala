
//import org.apache.spark.sql.{SaveMode, SparkSession}


//case class Product(productid: Integer, code: String, name: String, quantity:Integer, price:Float)

//object pro {
  //def main(args: Array[String]): Unit = {

    //val spark = SparkSession.builder().appName("pro").master("local").getOrCreate()

    //import spark.implicits._
    //val products = spark.sparkContext.textFile("/home/rohit/Desktop/product")
    //val prd = products.map(_.split(","))
    //val prd1 = prd.map(p => Product(p(0)toInt,p(1)toString,p(2)toString,p(3)toInt,p(4)toFloat))
//val prd2 = prd1.toDF
     import org.apache.spark.sql.SaveMode
  //  prd2.write.mode(SaveMode.Overwrite).format("orc").saveAsTable("product_orc_table")
//val result =

  //}
  //}
//