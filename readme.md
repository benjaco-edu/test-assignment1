![assignment](https://raw.githubusercontent.com/benjaco-edu/test-assignment1/master/assignment.png)

#### Exercise 2.2

Yes, the unit test helps defining if when the discount should start and end, the current definition defines it as expensive before 9:30 am and between 4pm and 7:30pm.

The definition lacks information about if the 9:30am 4pm, and 7:30pm is included or excluded in the given ranges. And it should define that rush hour starts at midnight.

### Run the test

jacoco report is located in "target/site/jacoco" after maven has been ran

```
> mvn clean test
WARNING: An illegal reflective access operation has occurred
WARNING: Illegal reflective access by com.google.inject.internal.cglib.core.$ReflectUtils$1 (file:/usr/share/maven/lib/guice.jar) to method java.lang.ClassLoader.defineClass(java.lang.String,byte[],int,int,java.security.ProtectionDomain)
WARNING: Please consider reporting this to the maintainers of com.google.inject.internal.cglib.core.$ReflectUtils$1
WARNING: Use --illegal-access=warn to enable warnings of further illegal reflective access operations
WARNING: All illegal access operations will be denied in a future release
[INFO] Scanning for projects...
[INFO]
[INFO] ----------------------< groupId:test-assignment1 >----------------------
[INFO] Building test-assignment1 1.0-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[INFO]
[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ test-assignment1 ---
[INFO] Deleting /home/benjamin/Desktop/test-assignment1/target
[INFO]
[INFO] --- jacoco-maven-plugin:0.8.2:prepare-agent (default) @ test-assignment1 ---
[INFO] argLine set to -javaagent:/home/benjamin/.m2/repository/org/jacoco/org.jacoco.agent/0.8.2/org.jacoco.agent-0.8.2-runtime.jar=destfile=/home/benjamin/Desktop/test-assignment1/target/jacoco.exec
[INFO]
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ test-assignment1 ---
[WARNING] Using platform encoding (UTF-8 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] skip non existing resourceDirectory /home/benjamin/Desktop/test-assignment1/src/main/resources
[INFO]
[INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ test-assignment1 ---
[INFO] Changes detected - recompiling the module!
[WARNING] File encoding has not been set, using platform encoding UTF-8, i.e. build is platform dependent!
[INFO] Compiling 4 source files to /home/benjamin/Desktop/test-assignment1/target/classes
[INFO]
[INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ test-assignment1 ---
[WARNING] Using platform encoding (UTF-8 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] skip non existing resourceDirectory /home/benjamin/Desktop/test-assignment1/src/test/resources
[INFO]
[INFO] --- maven-compiler-plugin:3.1:testCompile (default-testCompile) @ test-assignment1 ---
[INFO] Changes detected - recompiling the module!
[WARNING] File encoding has not been set, using platform encoding UTF-8, i.e. build is platform dependent!
[INFO] Compiling 2 source files to /home/benjamin/Desktop/test-assignment1/target/test-classes
[INFO]
[INFO] --- maven-surefire-plugin:2.19.1:test (default-test) @ test-assignment1 ---

-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running TrainPriceMultiplierTest
Tests run: 6, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.137 sec - in TrainPriceMultiplierTest
Running FindMinMaxTest
Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0 sec - in FindMinMaxTest

Results :

Tests run: 11, Failures: 0, Errors: 0, Skipped: 0

[INFO]
[INFO] --- jacoco-maven-plugin:0.8.2:report (report) @ test-assignment1 ---
[INFO] Loading execution data file /home/benjamin/Desktop/test-assignment1/target/jacoco.exec
[INFO] Analyzed bundle 'test-assignment1' with 5 classes
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 3.701 s
[INFO] Finished at: 2019-02-16T01:51:03+01:00
[INFO] ------------------------------------------------------------------------

```