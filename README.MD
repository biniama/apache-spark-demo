### Articles to read
[Introduction to Apache Spark with Examples and Use Cases](https://www.toptal.com/spark/introduction-to-apache-spark)  
[Introduction to Apache Spark](http://www.baeldung.com/apache-spark)

### How to Run
```aidl
${spark-install-dir}/bin/spark-submit --class com.baeldung.WordCount --master local ${WordCount-MavenProject}/target/apache-spark-1.0-SNAPSHOT.jar ${WordCount-MavenProject}/src/main/resources/spark_example.txt
```

### In my case
```aidl
spark-submit --class tech.hasset.JavaWordCount --master local target/spark-demo-1.0-SNAPSHOT.jar src/main/resources/test-data.txt
```

### Log
```aidl
[sparkdemo]$ spark-submit --class tech.hasset.JavaWordCount --master local target/spark-demo-1.0-SNAPSHOT.jar src/main/resources/test-data.txt
Using Spark's default log4j profile: org/apache/spark/log4j-defaults.properties
17/11/02 16:37:46 INFO SparkContext: Running Spark version 2.2.0
17/11/02 16:37:46 WARN NativeCodeLoader: Unable to load native-hadoop library for your platform... using builtin-java classes where applicable
17/11/02 16:37:46 INFO SparkContext: Submitted application: JavaWordCount
17/11/02 16:37:46 INFO SecurityManager: Changing view acls to: biniamasnake
17/11/02 16:37:46 INFO SecurityManager: Changing modify acls to: biniamasnake
17/11/02 16:37:46 INFO SecurityManager: Changing view acls groups to: 
17/11/02 16:37:46 INFO SecurityManager: Changing modify acls groups to: 
17/11/02 16:37:46 INFO SecurityManager: SecurityManager: authentication disabled; ui acls disabled; users  with view permiss
ions: Set(biniamasnake); groups with view permissions: Set(); users  with modify permissions: Set(biniamasnake); groups with modify permissions: Set()
17/11/02 16:37:47 INFO Utils: Successfully started service 'sparkDriver' on port 61947.
17/11/02 16:37:47 INFO SparkEnv: Registering MapOutputTracker
17/11/02 16:37:47 INFO SparkEnv: Registering BlockManagerMaster
17/11/02 16:37:47 INFO BlockManagerMasterEndpoint: Using org.apache.spark.storage.DefaultTopologyMapper for getting topology information
17/11/02 16:37:47 INFO BlockManagerMasterEndpoint: BlockManagerMasterEndpoint up
17/11/02 16:37:47 INFO DiskBlockManager: Created local directory at /private/var/folders/pq/c13l8_tn4zv_jww3qjmx_kz40000gn/T/blockmgr-469654c6-1806-486c-95d0-8549b600c86c
17/11/02 16:37:47 INFO MemoryStore: MemoryStore started with capacity 366.3 MB
17/11/02 16:37:47 INFO SparkEnv: Registering OutputCommitCoordinator
17/11/02 16:37:47 INFO Utils: Successfully started service 'SparkUI' on port 4040.
17/11/02 16:37:47 INFO SparkUI: Bound SparkUI to 0.0.0.0, and started at http://192.168.1.58:4040
17/11/02 16:37:47 INFO SparkContext: Added JAR file:/Users/biniamasnake/learning/sparkdemo/target/spark-demo-1.0-SNAPSHOT.jar at spark://192.168.1.58:61947/jars/spark-demo-1.0-SNAPSHOT.jar with timestamp 1509637067862
17/11/02 16:37:47 INFO Executor: Starting executor ID driver on host localhost
17/11/02 16:37:48 INFO Utils: Successfully started service 'org.apache.spark.network.netty.NettyBlockTransferService' on port 61948.
17/11/02 16:37:48 INFO NettyBlockTransferService: Server created on 192.168.1.58:61948
17/11/02 16:37:48 INFO BlockManager: Using org.apache.spark.storage.RandomBlockReplicationPolicy for block replication policy
17/11/02 16:37:48 INFO BlockManagerMaster: Registering BlockManager BlockManagerId(driver, 192.168.1.58, 61948, None)
17/11/02 16:37:48 INFO BlockManagerMasterEndpoint: Registering block manager 192.168.1.58:61948 with 366.3 MB RAM, BlockManagerId(driver, 192.168.1.58, 61948, None)
17/11/02 16:37:48 INFO BlockManagerMaster: Registered BlockManager BlockManagerId(driver, 192.168.1.58, 61948, None)
17/11/02 16:37:48 INFO BlockManager: Initialized BlockManager: BlockManagerId(driver, 192.168.1.58, 61948, None)
17/11/02 16:37:49 INFO MemoryStore: Block broadcast_0 stored as values in memory (estimated size 236.5 KB, free 366.1 MB)
17/11/02 16:37:49 INFO MemoryStore: Block broadcast_0_piece0 stored as bytes in memory (estimated size 22.9 KB, free 366.0 MB)
17/11/02 16:37:49 INFO BlockManagerInfo: Added broadcast_0_piece0 in memory on 192.168.1.58:61948 (size: 22.9 KB, free: 366.3 MB)
17/11/02 16:37:49 INFO SparkContext: Created broadcast 0 from textFile at JavaWordCount.java:32
17/11/02 16:37:49 INFO FileInputFormat: Total input paths to process : 1
17/11/02 16:37:49 INFO SparkContext: Starting job: collect at JavaWordCount.java:42
17/11/02 16:37:49 INFO DAGScheduler: Registering RDD 3 (mapToPair at JavaWordCount.java:37)
17/11/02 16:37:49 INFO DAGScheduler: Got job 0 (collect at JavaWordCount.java:42) with 1 output partitions
17/11/02 16:37:49 INFO DAGScheduler: Final stage: ResultStage 1 (collect at JavaWordCount.java:42)
17/11/02 16:37:49 INFO DAGScheduler: Parents of final stage: List(ShuffleMapStage 0)
17/11/02 16:37:49 INFO DAGScheduler: Missing parents: List(ShuffleMapStage 0)
17/11/02 16:37:49 INFO DAGScheduler: Submitting ShuffleMapStage 0 (MapPartitionsRDD[3] at mapToPair at JavaWordCount.java:37), which has no missing parents
17/11/02 16:37:49 INFO MemoryStore: Block broadcast_1 stored as values in memory (estimated size 5.9 KB, free 366.0 MB)
17/11/02 16:37:49 INFO MemoryStore: Block broadcast_1_piece0 stored as bytes in memory (estimated size 3.3 KB, free 366.0 MB)
17/11/02 16:37:49 INFO BlockManagerInfo: Added broadcast_1_piece0 in memory on 192.168.1.58:61948 (size: 3.3 KB, free: 366.3 MB)
17/11/02 16:37:49 INFO SparkContext: Created broadcast 1 from broadcast at DAGScheduler.scala:1006
17/11/02 16:37:49 INFO DAGScheduler: Submitting 1 missing tasks from ShuffleMapStage 0 (MapPartitionsRDD[3] at mapToPair at JavaWordCount.java:37) (first 15 tasks are for partitions Vector(0))
17/11/02 16:37:49 INFO TaskSchedulerImpl: Adding task set 0.0 with 1 tasks
17/11/02 16:37:49 INFO TaskSetManager: Starting task 0.0 in stage 0.0 (TID 0, localhost, executor driver, partition 0, PROCESS_LOCAL, 4884 bytes)
17/11/02 16:37:49 INFO Executor: Running task 0.0 in stage 0.0 (TID 0)
17/11/02 16:37:49 INFO Executor: Fetching spark://192.168.1.58:61947/jars/spark-demo-1.0-SNAPSHOT.jar with timestamp 1509637067862
17/11/02 16:37:49 INFO TransportClientFactory: Successfully created connection to /192.168.1.58:61947 after 30 ms (0 ms spent in bootstraps)
17/11/02 16:37:49 INFO Utils: Fetching spark://192.168.1.58:61947/jars/spark-demo-1.0-SNAPSHOT.jar to /private/var/folders/pq/c13l8_tn4zv_jww3qjmx_kz40000gn/T/spark-385b2666-d095-4dde-a6d4-44bae59d4cd4/userFiles-671d2fcf-90a1-4828-8b64-608ecdca497b/fetchFileTemp7378744343365819119.tmp
17/11/02 16:37:49 INFO Executor: Adding file:/private/var/folders/pq/c13l8_tn4zv_jww3qjmx_kz40000gn/T/spark-385b2666-d095-4d
de-a6d4-44bae59d4cd4/userFiles-671d2fcf-90a1-4828-8b64-608ecdca497b/spark-demo-1.0-SNAPSHOT.jar to class loader
17/11/02 16:37:50 INFO HadoopRDD: Input split: file:/Users/biniamasnake/learning/sparkdemo/src/main/resources/test-data.txt:0+146
17/11/02 16:37:50 INFO Executor: Finished task 0.0 in stage 0.0 (TID 0). 1153 bytes result sent to driver
17/11/02 16:37:50 INFO TaskSetManager: Finished task 0.0 in stage 0.0 (TID 0) in 456 ms on localhost (executor driver) (1/1)
17/11/02 16:37:50 INFO TaskSchedulerImpl: Removed TaskSet 0.0, whose tasks have all completed, from pool 
17/11/02 16:37:50 INFO DAGScheduler: ShuffleMapStage 0 (mapToPair at JavaWordCount.java:37) finished in 0.486 s
17/11/02 16:37:50 INFO DAGScheduler: looking for newly runnable stages
17/11/02 16:37:50 INFO DAGScheduler: running: Set()
17/11/02 16:37:50 INFO DAGScheduler: waiting: Set(ResultStage 1)
17/11/02 16:37:50 INFO DAGScheduler: failed: Set()
17/11/02 16:37:50 INFO DAGScheduler: Submitting ResultStage 1 (ShuffledRDD[4] at reduceByKey at JavaWordCount.java:39), which has no missing parents
17/11/02 16:37:50 INFO MemoryStore: Block broadcast_2 stored as values in memory (estimated size 3.7 KB, free 366.0 MB)
17/11/02 16:37:50 INFO MemoryStore: Block broadcast_2_piece0 stored as bytes in memory (estimated size 2.1 KB, free 366.0 MB)
17/11/02 16:37:50 INFO BlockManagerInfo: Added broadcast_2_piece0 in memory on 192.168.1.58:61948 (size: 2.1 KB, free: 366.3 MB)
17/11/02 16:37:50 INFO SparkContext: Created broadcast 2 from broadcast at DAGScheduler.scala:1006
17/11/02 16:37:50 INFO DAGScheduler: Submitting 1 missing tasks from ResultStage 1 (ShuffledRDD[4] at reduceByKey at JavaWordCount.java:39) (first 15 tasks are for partitions Vector(0))
17/11/02 16:37:50 INFO TaskSchedulerImpl: Adding task set 1.0 with 1 tasks
17/11/02 16:37:50 INFO TaskSetManager: Starting task 0.0 in stage 1.0 (TID 1, localhost, executor driver, partition 0, ANY, 4621 bytes)
17/11/02 16:37:50 INFO Executor: Running task 0.0 in stage 1.0 (TID 1)
17/11/02 16:37:50 INFO ShuffleBlockFetcherIterator: Getting 1 non-empty blocks out of 1 blocks
17/11/02 16:37:50 INFO ShuffleBlockFetcherIterator: Started 0 remote fetches in 11 ms
17/11/02 16:37:50 INFO Executor: Finished task 0.0 in stage 1.0 (TID 1). 1697 bytes result sent to driver
17/11/02 16:37:50 INFO TaskSetManager: Finished task 0.0 in stage 1.0 (TID 1) in 75 ms on localhost (executor driver) (1/1)
17/11/02 16:37:50 INFO TaskSchedulerImpl: Removed TaskSet 1.0, whose tasks have all completed, from pool 
17/11/02 16:37:50 INFO DAGScheduler: ResultStage 1 (collect at JavaWordCount.java:42) finished in 0.077 s
17/11/02 16:37:50 INFO DAGScheduler: Job 0 finished: collect at JavaWordCount.java:42, took 0.776665 s
cool 1
near 1
it 1
is 2
Hello 1
hope 1
a 2
app 1
Apache 1
project. 1
I 1
to 1
demo 1
 3
in 1
first 1
This 1
using 1
of 1
by 1
framework 1
my 1
Spark! 4
and 1
use 1
Keep 1
17/11/02 16:37:50 INFO SparkUI: Stopped Spark web UI at http://192.168.1.58:4040
17/11/02 16:37:50 INFO MapOutputTrackerMasterEndpoint: MapOutputTrackerMasterEndpoint stopped!
17/11/02 16:37:50 INFO MemoryStore: MemoryStore cleared
17/11/02 16:37:50 INFO BlockManager: BlockManager stopped
17/11/02 16:37:50 INFO BlockManagerMaster: BlockManagerMaster stopped
17/11/02 16:37:50 INFO OutputCommitCoordinator$OutputCommitCoordinatorEndpoint: OutputCommitCoordinator stopped!
17/11/02 16:37:50 INFO SparkContext: Successfully stopped SparkContext
17/11/02 16:37:50 INFO ShutdownHookManager: Shutdown hook called
17/11/02 16:37:50 INFO ShutdownHookManager: Deleting directory /private/var/folders/pq/c13l8_tn4zv_jww3qjmx_kz40000gn/T/spark-385b2666-d095-4dde-a6d4-44bae59d4cd4
```


### SQL

[Nice Documenation with example](https://spark.apache.org/docs/latest/sql-programming-guide.html#datasets-and-dataframes)

### How to execute
```
spark-submit --jars lib/mysql-connector-java-5.1.44-bin.jar --driver-class-path lib/mysql-connector-java-5.1.44-bin.jar --conf spark.driver.extraClassPath=lib/mysql-connector-java-5.1.44-bin.jar --class tech.hasset.DataBaseOperation --master local target/spark-demo-1.0-SNAPSHOT.jar  
```

### The Log from DatabaseOperation class
```
[sparkdemo (master)]$ spark-submit --jars lib/mysql-connector-java-5.1.44-bin.jar --driver-class-path lib/mysql-connector-java-5.1.44-bin.jar --conf spark.driver.extraClassPath=lib/mysql-connector-java-5.1.44-bin.jar --class tech.hasset.DataBaseOperation --master local target/spark-demo-1.0-SNAPSHOT.jar
Using Spark's default log4j profile: org/apache/spark/log4j-defaults.properties
17/11/03 00:12:21 INFO SparkContext: Running Spark version 2.2.0
17/11/03 00:12:22 WARN NativeCodeLoader: Unable to load native-hadoop library for your platform... using builtin-java classes where applicable
17/11/03 00:12:23 INFO SparkContext: Submitted application: Java Spark SQL basic example
17/11/03 00:12:23 INFO SecurityManager: Changing view acls to: biniamasnake
17/11/03 00:12:23 INFO SecurityManager: Changing modify acls to: biniamasnake
17/11/03 00:12:23 INFO SecurityManager: Changing view acls groups to: 
17/11/03 00:12:23 INFO SecurityManager: Changing modify acls groups to: 
17/11/03 00:12:23 INFO SecurityManager: SecurityManager: authentication disabled; ui acls disabled; users  with view permissions: Set(biniamasnake); groups with view permissions: Set(); users  with modify permissions: Set(biniamasnake); groups with modify permissions: Set()
17/11/03 00:12:24 INFO Utils: Successfully started service 'sparkDriver' on port 56150.
17/11/03 00:12:24 INFO SparkEnv: Registering MapOutputTracker
17/11/03 00:12:24 INFO SparkEnv: Registering BlockManagerMaster
17/11/03 00:12:24 INFO BlockManagerMasterEndpoint: Using org.apache.spark.storage.DefaultTopologyMapper for getting topology information
17/11/03 00:12:24 INFO BlockManagerMasterEndpoint: BlockManagerMasterEndpoint up
17/11/03 00:12:24 INFO DiskBlockManager: Created local directory at /private/var/folders/pq/c13l8_tn4zv_jww3qjmx_kz40000gn/T/blockmgr-70b28a75-37b0-4bd1-beee-403b85bebd5d
17/11/03 00:12:24 INFO MemoryStore: MemoryStore started with capacity 366.3 MB
17/11/03 00:12:24 INFO SparkEnv: Registering OutputCommitCoordinator
17/11/03 00:12:25 INFO Utils: Successfully started service 'SparkUI' on port 4040.
17/11/03 00:12:26 INFO SparkUI: Bound SparkUI to 0.0.0.0, and started at http://192.168.1.58:4040
17/11/03 00:12:26 INFO SparkContext: Added JAR file:/Users/biniamasnake/learning/sparkdemo/lib/mysql-connector-java-5.1.44-bin.jar at spark://192.168.1.58:56150/jars/mysql-connector-java-5.1.44-bin.jar with timestamp 1509664346233
17/11/03 00:12:26 INFO SparkContext: Added JAR file:/Users/biniamasnake/learning/sparkdemo/target/spark-demo-1.0-SNAPSHOT.jar at spark://192.168.1.58:56150/jars/spark-demo-1.0-SNAPSHOT.jar with timestamp 1509664346236
17/11/03 00:12:26 INFO Executor: Starting executor ID driver on host localhost
17/11/03 00:12:26 INFO Utils: Successfully started service 'org.apache.spark.network.netty.NettyBlockTransferService' on port 56152.
17/11/03 00:12:26 INFO NettyBlockTransferService: Server created on 192.168.1.58:56152
17/11/03 00:12:26 INFO BlockManager: Using org.apache.spark.storage.RandomBlockReplicationPolicy for block replication policy
17/11/03 00:12:26 INFO BlockManagerMaster: Registering BlockManager BlockManagerId(driver, 192.168.1.58, 56152, None)
17/11/03 00:12:26 INFO BlockManagerMasterEndpoint: Registering block manager 192.168.1.58:56152 with 366.3 MB RAM, BlockManagerId(driver, 192.168.1.58, 56152, None)
17/11/03 00:12:26 INFO BlockManagerMaster: Registered BlockManager BlockManagerId(driver, 192.168.1.58, 56152, None)
17/11/03 00:12:26 INFO BlockManager: Initialized BlockManager: BlockManagerId(driver, 192.168.1.58, 56152, None)
17/11/03 00:12:27 INFO SharedState: Setting hive.metastore.warehouse.dir ('null') to the value of spark.sql.warehouse.dir ('file:/Users/biniamasnake/learning/sparkdemo/spark-warehouse/').
17/11/03 00:12:28 INFO SharedState: Warehouse path is 'file:/Users/biniamasnake/learning/sparkdemo/spark-warehouse/'.
17/11/03 00:12:32 INFO StateStoreCoordinatorRef: Registered StateStoreCoordinator endpoint
constructed jdbc_url: jdbc:mysql://localhost:3306/apache-spark-demo?useSSL=false
17/11/03 00:12:42 INFO CodeGenerator: Code generated in 1103.081815 ms
17/11/03 00:12:42 INFO SparkContext: Starting job: show at DataBaseOperation.java:62
17/11/03 00:12:42 INFO DAGScheduler: Got job 0 (show at DataBaseOperation.java:62) with 1 output partitions
17/11/03 00:12:42 INFO DAGScheduler: Final stage: ResultStage 0 (show at DataBaseOperation.java:62)
17/11/03 00:12:42 INFO DAGScheduler: Parents of final stage: List()
17/11/03 00:12:42 INFO DAGScheduler: Missing parents: List()
17/11/03 00:12:42 INFO DAGScheduler: Submitting ResultStage 0 (MapPartitionsRDD[2] at show at DataBaseOperation.java:62), which has no missing parents
17/11/03 00:12:43 INFO MemoryStore: Block broadcast_0 stored as values in memory (estimated size 7.2 KB, free 366.3 MB)
17/11/03 00:12:43 INFO MemoryStore: Block broadcast_0_piece0 stored as bytes in memory (estimated size 4.0 KB, free 366.3 MB)
17/11/03 00:12:43 INFO BlockManagerInfo: Added broadcast_0_piece0 in memory on 192.168.1.58:56152 (size: 4.0 KB, free: 366.3 MB)
17/11/03 00:12:43 INFO SparkContext: Created broadcast 0 from broadcast at DAGScheduler.scala:1006
17/11/03 00:12:43 INFO DAGScheduler: Submitting 1 missing tasks from ResultStage 0 (MapPartitionsRDD[2] at show at DataBaseOperation.java:62) (first 15 tasks are for partitions Vector(0))
17/11/03 00:12:43 INFO TaskSchedulerImpl: Adding task set 0.0 with 1 tasks
17/11/03 00:12:43 INFO TaskSetManager: Starting task 0.0 in stage 0.0 (TID 0, localhost, executor driver, partition 0, PROCESS_LOCAL, 4649 bytes)
17/11/03 00:12:43 INFO Executor: Running task 0.0 in stage 0.0 (TID 0)
17/11/03 00:12:43 INFO Executor: Fetching spark://192.168.1.58:56150/jars/spark-demo-1.0-SNAPSHOT.jar with timestamp 1509664346236
17/11/03 00:12:43 INFO TransportClientFactory: Successfully created connection to /192.168.1.58:56150 after 107 ms (0 ms spent in bootstraps)
17/11/03 00:12:43 INFO Utils: Fetching spark://192.168.1.58:56150/jars/spark-demo-1.0-SNAPSHOT.jar to /private/var/folders/pq/c13l8_tn4zv_jww3qjmx_kz40000gn/T/spark-d1348015-47ee-4524-91b9-8ce47969adfb/userFiles-cb4f6eeb-088e-413c-a81d-d3bd7ff5a565/fetchFileTemp6334916715239653640.tmp
17/11/03 00:12:44 INFO Executor: Adding file:/private/var/folders/pq/c13l8_tn4zv_jww3qjmx_kz40000gn/T/spark-d1348015-47ee-4524-91b9-8ce47969adfb/userFiles-cb4f6eeb-088e-413c-a81d-d3bd7ff5a565/spark-demo-1.0-SNAPSHOT.jar to class loader
17/11/03 00:12:44 INFO Executor: Fetching spark://192.168.1.58:56150/jars/mysql-connector-java-5.1.44-bin.jar with timestamp 1509664346233
17/11/03 00:12:44 INFO Utils: Fetching spark://192.168.1.58:56150/jars/mysql-connector-java-5.1.44-bin.jar to /private/var/folders/pq/c13l8_tn4zv_jww3qjmx_kz40000gn/T/spark-d1348015-47ee-4524-91b9-8ce47969adfb/userFiles-cb4f6eeb-088e-413c-a81d-d3bd7ff5a565/fetchFileTemp400402317206581204.tmp
17/11/03 00:12:44 INFO Executor: Adding file:/private/var/folders/pq/c13l8_tn4zv_jww3qjmx_kz40000gn/T/spark-d1348015-47ee-4524-91b9-8ce47969adfb/userFiles-cb4f6eeb-088e-413c-a81d-d3bd7ff5a565/mysql-connector-java-5.1.44-bin.jar to class loader
17/11/03 00:12:44 INFO JDBCRDD: closed connection
17/11/03 00:12:44 INFO Executor: Finished task 0.0 in stage 0.0 (TID 0). 1210 bytes result sent to driver
17/11/03 00:12:44 INFO TaskSetManager: Finished task 0.0 in stage 0.0 (TID 0) in 1026 ms on localhost (executor driver) (1/1)
17/11/03 00:12:44 INFO TaskSchedulerImpl: Removed TaskSet 0.0, whose tasks have all completed, from pool 
17/11/03 00:12:44 INFO DAGScheduler: ResultStage 0 (show at DataBaseOperation.java:62) finished in 1.074 s
17/11/03 00:12:44 INFO DAGScheduler: Job 0 finished: show at DataBaseOperation.java:62, took 1.784106 s
17/11/03 00:12:44 INFO CodeGenerator: Code generated in 48.894574 ms
+------+---+
|  name|age|
+------+---+
|Biniam| 29|
| Kidan| 26|
|Hasset|  1|
+------+---+

17/11/03 00:12:44 INFO SparkUI: Stopped Spark web UI at http://192.168.1.58:4040
17/11/03 00:12:45 INFO MapOutputTrackerMasterEndpoint: MapOutputTrackerMasterEndpoint stopped!
17/11/03 00:12:45 INFO MemoryStore: MemoryStore cleared
17/11/03 00:12:45 INFO BlockManager: BlockManager stopped
17/11/03 00:12:45 INFO BlockManagerMaster: BlockManagerMaster stopped
17/11/03 00:12:45 INFO OutputCommitCoordinator$OutputCommitCoordinatorEndpoint: OutputCommitCoordinator stopped!
17/11/03 00:12:45 INFO SparkContext: Successfully stopped SparkContext
17/11/03 00:12:45 INFO ShutdownHookManager: Shutdown hook called
17/11/03 00:12:45 INFO ShutdownHookManager: Deleting directory /private/var/folders/pq/c13l8_tn4zv_jww3qjmx_kz40000gn/T/spark-d1348015-47ee-4524-91b9-8ce47969adfb
[sparkdemo (master)]$ 
```