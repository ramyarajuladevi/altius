# altius
### software test automation  

This project is a behavior driven development (BDD) approach to write automation test script to test Web application “https://vardenisiffror.se/unitlists”. It enables you to write and execute automated acceptance/unit tests. 

### Test Automation Artifacts Used:

1. Automation Tool: Selenium Web Driver  
2. Programming Language: Java  
3. Framework: cucumber with Page Object Model  
4. Build tool: maven, Git  

### Pre requisites:

1. jre 1.8  
2. cucumber  
3. Eclipse with Selenium web driver  
4. maven  

### Scenarios Automated:

1. Creating a Device List  
2. Deleting a Device List Created  
3. Renaming a Device List created  
4. Changing the color of Unit  
5. Search For Organzation which is not listed  

### Please follow below steps for execution:

1. Download the project from the Git link mentioned above  
2. You can run pom.xml as Maven Test  
3. Or you can run the Runner.java file as a Junit  
4. Or you can run the createList.feature File as a cucumber feature  
5. For the detailed report, run mvn verify
6. For the detailed report, run mvn verify. Once execution is done , please check results in 
   path: \target\cucumber-report-html\cucumber-html-reports path  
