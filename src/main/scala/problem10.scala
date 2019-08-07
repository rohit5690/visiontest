import org.apache.spark.{SparkConf, SparkContext}


object problem10 {
  def main(args: Array[String]): Unit = {
    

    val conf = new SparkConf().setAppName("problem10").setMaster("local")
  val sc = new SparkContext(conf)
    val rdd = sc.parallelize(List( ("Deeapak" , "male", 4000), ("Deepak" , "male", 2000),
  ("Deepika" , "female", 2000),("Deepak" , "female", 2000), ("Deepak" , "male", 1000) ,
("Neeta" , "female", 2000)))
    val byKey = rdd.map({case (name,sex,cost) => (name,sex)->cost})
    val byKeyGrouped = byKey.groupByKey
    val result = byKeyGrouped.map{case ((id1,id2),values) => (id1,id2,values.sum)}
    result.foreach(println)

  }
}