import org.apache.hadoop.hive.conf.HiveConf.ConfVars
import org.apache.spark.sql.SparkSession

case class Patient(patientid: Integer, name: String, dateOfBirth:String , lastVisitDate:String)

object problem8 {
  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder().appName("rdd").master("local").getOrCreate()
    //val abc = spark.read.csv("/home/rohit/Desktop/patient.csv")
    val patient = spark.read.format("csv").option("inferschema","true").option("header","true").load("/home/rohit/Desktop/patient.csv")

    patient.createOrReplaceTempView("def")
    spark.sql("select * from def  where dateOfBirth = 2011-10-29").show()
  }

}
