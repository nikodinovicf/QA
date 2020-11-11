# HTEC

This is test project for job interview. 

## Requrements

1. Check Java version. Open CMD and execute following command:
```bash
java -version
```
This is expected output:
```bash
java version "15.0.1" 2020-10-20
Java(TM) SE Runtime Environment (build 15.0.1+9-18)
Java HotSpot(TM) 64-Bit Server VM (build 15.0.1+9-18, mixed mode, sharing)
```
If you do not have installed [Java](https://www.oracle.com/java/technologies/javase/javase-jdk8-downloads.html), you will need to install it.

2. Check Maven version. Open CMD and execute following command:
```bash
mvn -version
```
This is expected output:
```bash
Apache Maven 3.6.3 (cecedd343002696d0abb50b32b541b8a6ba2883f)
Maven home: C:\apache-maven-3.6.3\bin\..
Java version: 15.0.1, vendor: Oracle Corporation, runtime: C:\Program Files\Java\jdk-15.0.1
Default locale: en_US, platform encoding: Cp1252
OS name: "windows 10", version: "10.0", arch: "amd64", family: "windows"
```
If you do not have installed [Maven](https://maven.apache.org/download.cgi?Preferred=ftp://ftp.osuosl.org/pub/apache/), you will need to install it.

3. Download [Geckodriver](https://github.com/mozilla/geckodriver/releases), and extract it on this location "C:\Selenium".


After download and install, you need to setup local variables for Java and Maven.

## Build and start
Once you have installed Java and Maven, and extracted Geckodriver, using your IDE (IntelliJ IDEA is suggested), open project and wait for all maven dependencies are downloaded.

For executing all tests, you need to run "testng.xml" file.

After executed tests, test report will be automatically created on this location: 
```bash
[project-location]/QA/test-output
```



## Additional

All suggestions are welcome. 
I am aware that there is a lot of space for improvements.
I did much as I had time.
AfterMethod is necessary, which will tear down the driver in case that is some error and when the test is successfully done.
I would like to add that all tests to be executed on Docker images, which allow the developer to continue writing test cases while tests are running on Docker.
If you rate this code as acceptable, I would like to talk about all things that I have on mind but not enough time to finish.
Feel free to contact me: nikodinovicf@gmail.com
Cheers!
Stay safe.





