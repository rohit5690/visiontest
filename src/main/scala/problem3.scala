import org.apache.spark.{SparkConf, SparkContext}
//import org.apache.spark.sql.SparkSession

object problem3 {
  def main(args: Array[String]): Unit = {
    val conf=new SparkConf().setAppName("rdd").setMaster("local")
    val sc=new SparkContext(conf)

    val name = sc.textFile("/home/rohit/Desktop/EmployeeName_csv")

    val namePairRdd=name.map(x => (x.split(",")(0),x.split(",")(1)))

    val swapped=namePairRdd.map(item => item.swap)


    val sortedOutput=swapped.sortByKey()

    val swappedBack=sortedOutput.map(item => item.swap)


     swappedBack.repartition(1).saveAsTextFile("home/rohit/Desktop/result_of_Employee")
  }
}