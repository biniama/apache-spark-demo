package tech.hasset;

import org.apache.spark.sql.SparkSession;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import java.util.Properties;

/**
 * @author biniamasnake on 02.11.17.
 */
public class DataBaseOperation {

    /**
     * Creates a DataFrame based on a table named "people"
     * stored in a MySQL database.
     *
     * @param args
     */
    public static void main(String[] args) {

        SparkSession spark = SparkSession
                .builder()
                .appName("Java Spark SQL basic example")
                //.config("spark.some.config.option", "some-value")
                .getOrCreate();

        // Note: JDBC loading and saving can be achieved via either the load/save or jdbc methods
        // Loading data from a JDBC source
        Dataset<Row> jdbcDF = spark.read()
                .format("jdbc")
                .option("driver","com.mysql.jdbc.Driver")
                .option("url", "jdbc:mysql:localhost")
                .option("dbtable", "apache-spark-demo.people")
                .option("user", "root")
                .option("password", "password")
                .load();

        // Displays the content of the DataFrame to stdout
        jdbcDF.show();


/*
// Option 1: Build the parameters into a JDBC url to pass into the DataFrame APIs
        String jdbcUsername = "USER_NAME";
        String jdbcPassword = "PASSWORD";
        String jdbcHostname = "HOSTNAME";
        Integer jdbcPort = 3306;
        String jdbcDatabase ="DATABASE";
        String jdbcUrl = "jdbc:mysql://${jdbcHostname}:${jdbcPort}/${jdbcDatabase}?user=${jdbcUsername}&password=${jdbcPassword}";

// Option 2: Create a Properties() object to hold the parameters. You can create the JDBC URL without passing in the user/password parameters directly.
        Properties connectionProperties = new Properties();
        connectionProperties.put("user", "USER_NAME");
        connectionProperties.put("password", "PASSWORD");

        String jdbc_url = "jdbc:mysql://${jdbcHostname}:${jdbcPort}/${jdbcDatabase}";
        Dataset employees_table = spark.read().jdbc(jdbc_url, "employees", connectionProperties);*/
    }
}
