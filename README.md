# EcommerceWebAutomation


Prerequisites:

    Git installed on your machine.

    Java installed (preferably JDK 8 or later).

    Maven or Gradle (for dependency management).

    IDE (such as IntelliJ IDEA, Eclipse, or Visual Studio Code).


Steps for Setting Up a Selenium Java Project from GitHub:
1. Clone the GitHub Repository:

    First, you'll need to clone the repository that contains the Selenium Java project from GitHub.

    Open a terminal/command prompt and use the following command to clone the repository:

        git clone https://github.com/username/repository-name.git

Replace https://github.com/username/repository-name.git with the actual URL of the project on GitHub.

Navigate to the folder containing the cloned repository:

    cd repository-name

2. Open the Project in Your IDE:

    Open your IDE (IntelliJ IDEA, Eclipse, etc.).

    For IntelliJ IDEA:

        Click on Open from the start menu or from the File menu.

        Browse to the folder where you cloned the project and select it to open.

    For Eclipse:

        Click on File > Import.

        Select Existing Projects into Workspace and click Next.

        Browse to the folder where you cloned the repository and select it.

    For Visual Studio Code (VS Code):

        Open VS Code and click on File > Open Folder.

        Navigate to the folder where you cloned the repository and open it.

3. Check for Maven or Gradle:

    Most Selenium Java projects will use Maven or Gradle for dependency management. Check the project for a pom.xml file (Maven) or a build.gradle file (Gradle).

    If the project uses Maven, you’ll need to check that it has the necessary Selenium dependencies.

4. Check Dependencies in pom.xml (for Maven):

If the project uses Maven, the pom.xml file should contain the Selenium WebDriver dependency.

Example pom.xml for Selenium WebDriver:

<dependencies>
    <dependency>
        <groupId>org.seleniumhq.selenium</groupId>
        <artifactId>selenium-java</artifactId>
        <version>4.0.0</version> <!-- or the latest version -->
    </dependency>

    <!-- Add other dependencies like JUnit or TestNG if needed -->
</dependencies>

If there’s no pom.xml file, you can manually add the necessary dependencies. Once added, Maven will automatically download the required libraries.
5. Check Dependencies in build.gradle (for Gradle):

If the project uses Gradle, the build.gradle file should include the Selenium WebDriver dependency.

Example build.gradle for Selenium WebDriver:

dependencies {
    testImplementation 'org.seleniumhq.selenium:selenium-java:4.0.0' // or the latest version
    testImplementation 'org.junit.jupiter:junit-jupiter-api:5.7.0'  // for JUnit 5 tests
}

Once this is added, Gradle will automatically fetch the dependencies.
6. Install Necessary Plugins (if required):

If you’re using an IDE like IntelliJ IDEA or Eclipse, ensure that the following plugins are installed:

    -TestNG
    -Maven 

7. Run Maven Build:

After setting up the dependencies, you may want to run a build to download the necessary libraries:

   For Maven:

        In IntelliJ IDEA, right-click the project and choose Maven > Reimport or use the Maven tool window to reload the project.

        Alternatively, run the following command in the terminal:
               mvn clean install

        In Eclipse:
                Right-click on the project in the Project Explorer.
                Select Maven > Update Project (or Maven > Update Project Configuration in some versions of Eclipse).
                In the dialog that appears, make sure to select the "Force Update of Snapshots/Releases" option.
                Click OK.

8. Verify the Setup:

    Check the Project Structure: The project should have a directory structure similar to the following:

        ├── src
            ├── main
            │   └── java
            │       └── com
            │           └── example
            │               └── tests
            │                   └── SeleniumTest.java
            └── test
                └── java
                    └── com
                        └── example
                            └── tests
                                └── SeleniumTestTest.java
        ├── pom.xml (for Maven projects)
        └── build.gradle (for Gradle projects)

    Ensure that your test files are under src/main/java (for actual code) and src/test/java (for tests).

9. Write or Edit Test Scripts:

    If the repository already contains some Selenium test scripts, you can explore and modify them.

    If you need to create new tests, you can create a new test class under src/test/java with something like this:


Example TestNG Test:

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumTest {

    @Test
    public void testGoogle() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        // Perform some actions (e.g., search, click buttons, etc.)
        driver.quit();
    }
}

10. Run Your Tests:

    In IntelliJ IDEA: Right-click the test class and select Run.

    In Eclipse: Right-click the test class and select Run As > TestNG Test.

    In Visual Studio Code: Use the built-in test running extensions to run your tests.

11. Check Test Results:

    After running the tests, check the console/output for the test results to ensure everything is working as expected.

---------------------------------------------------------------------------------------------------------------------------------

      **Kindly note that you can edit /EcommerceWebAutomation/src/test/java/main/MainPageTests.java
            You can freely edit the following:
                  ProductQuantity
                  Email
                  FirstName
                  LastName
                  StreetAddress
                  City
                  Country
                  State
                  Zip
                  PhoneNumber
