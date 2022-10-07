package Runners;

/*
 This Class represents the Test Runner. All features tagged with @MyRegression will run "consecutively".
 - You will find a basic report under cucumber.html as taught by our instructor.
 - It was time-consuming to learn & make the advanced one (Allure as an example) with a dashboard,
 but I am sure that I will definitely do it in the near future.
*/

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/Features",
        glue = "TestCasesDefinitions",
        tags = "@MyRegression",
        plugin = {"html:target/cucumber.html", "json:target/cucumber.json",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "rerun:target/failed_scenarios.txt"})

public class RegressionTest extends AbstractTestNGCucumberTests {
}
