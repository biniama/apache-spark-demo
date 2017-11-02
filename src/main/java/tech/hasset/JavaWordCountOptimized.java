package tech.hasset;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import scala.Tuple2;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

/**
 * @author biniamasnake on 02.11.17.
 */
public class JavaWordCountOptimized {

    private static final Pattern SPACE = Pattern.compile(" ");

    public static void main(String[] args) throws Exception {

        if (args.length < 1) {
            System.err.println("Usage: JavaWordCount <file>");
            System.exit(1);
        }

        SparkConf sparkConf = new SparkConf().setAppName("JavaWordCount");

        JavaSparkContext sparkContext = new JavaSparkContext(sparkConf);

        JavaRDD<String> lines = sparkContext.textFile(args[0], 1);

        // Transformations and Action
        List<Tuple2<String, Integer>> output = lines
                .flatMap(s -> Arrays.asList(SPACE.split(s)).iterator())
                .mapToPair(word -> new Tuple2<>(word, 1))
                .reduceByKey((Integer i1, Integer i2) -> i1 + i2)
                .collect();

        // Print
        output.forEach(o -> System.out.println(o._1 + " " + o._2));

        // Stop context
        sparkContext.stop();
    }
}