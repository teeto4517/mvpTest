# mvpTest
- Clone Repo to your local and use any IDE of your choice, IntelliJ preferably to run test 
- Ensure you have Apache Maven install, and it's environment variable declared
- Clone Repo and ensure all dependencies are downloaded
- Open src/test/java/e2e or build the TestNg.xml to run test

# Architecture 
Based on instruction, I used Page Object Model POM enhanced with Page Factory design pattern. The benefit or reason
 for doing this is to provide lazy initialization, and the ability to use annotations which automatically find the elements on the page without specifying findElement. 