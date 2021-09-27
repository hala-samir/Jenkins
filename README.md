### This Selenium java code is used in Jenkins.
### What is Jenkins?
Jenkins – an open source automation server which enables developers around the world to reliably build, test, and deploy their software.
### How to Run it on Windows?
- Download Jenkins for Windows10 from https://www.jenkins.io/download/, then open cmd and run the command
  ##### > java -jar jenkins.war --httpPort=8080
    ![](https://github.com/hala-samir/Jenkins/blob/1593e0dba793cc19f43290e217a74cc84ce56adc/assets/1.png)
- Now Jenkins server is running on http://localhost:8080
    ![](https://github.com/hala-samir/Jenkins/blob/1593e0dba793cc19f43290e217a74cc84ce56adc/assets/2.png)

### How to create a job to run Seleium java Maven test?
- Visit Add new Item page to add a new job.
- From configurations add a code repository link under the section of source code management.
  ![](https://github.com/hala-samir/Jenkins/blob/1593e0dba793cc19f43290e217a74cc84ce56adc/assets/3.png)
- Visit Jenkins Global Tool Configuration: 
  - From JDK section, install Java and enter its version number and JAVA_HOME location.
  ![](https://github.com/hala-samir/Jenkins/blob/c73372f667a2e6ce8a3d3abfa29b5c1d3c38f4e5/assets/4.png) 
  - From Maven section, enter its version number and MAVEN_HOME location to install it.
  ![This is an image](https://github.com/hala-samir/Jenkins/blob/c73372f667a2e6ce8a3d3abfa29b5c1d3c38f4e5/assets/5.png)
  - From a job configuration and under Build section, enter maven target data.
  ![ ](https://github.com/hala-samir/Jenkins/blob/c73372f667a2e6ce8a3d3abfa29b5c1d3c38f4e5/assets/6.png)
  

## How to skip tests in Jenkins job?
In a job configuration and under build section, add this flag -DskipTests=true .
![](https://github.com/hala-samir/Jenkins/blob/deaa3f77ebbd6eb0cd8e9ea5836270c94574466c/assets/8.png)

### How to create HTML reports for tests?
From manage Jenkins configuration and under the plugin manager section install HTML publisher plugin and TestNG Results plugin.
![](https://github.com/hala-samir/Jenkins/blob/deaa3f77ebbd6eb0cd8e9ea5836270c94574466c/assets/7.png)
From a job configuration and under Post-build Actions then add HTML publisher plugin and TestNG Results plugin with configurations.
![](https://github.com/hala-samir/Jenkins/blob/deaa3f77ebbd6eb0cd8e9ea5836270c94574466c/assets/9.png)

