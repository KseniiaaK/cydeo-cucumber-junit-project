package com.cydeo.step_definitions;

import com.cydeo.utilities.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @Before
    public void setupMethod() {
        System.out.println("@Before - Running before each scenario");
    }


    @After
    public void teardown(Scenario scenario) {

        if (scenario.isFailed()) {


            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }

        System.out.println("@After - Running after each scenario");
        Driver.closeDriver();
    }


    // @BeforeStep
    public void setupStep() {
        System.out.println("--------> @Before Step running before each step");
    }

    //  @AfterStep
    public void afterStep() {
        System.out.println("--------> @After Step running after each step");
    }
}
