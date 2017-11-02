import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaSparkContext;

/**
 * Created by alexiaborchgrevink on 11/1/17.
 */
public class Test {

    public static void main (String[] args){
        SparkConf conf = new SparkConf().setAppName("CR-Stats");
        JavaSparkContext context = new JavaSparkContext(conf);


    }
}
