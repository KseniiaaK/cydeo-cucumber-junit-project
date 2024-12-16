package com.cydeo.step_definitions;

import com.cydeo.pages.VytrackLoginPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class VytrackLogin_StepDefinitions {

    VytrackLoginPage vytrackLoginPage = new VytrackLoginPage();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("vyTrackUrl"));
    }

    @When("user enters the driver information")
    public void user_enters_the_driver_information() {
//        vytrackLoginPage.usernameInput.sendKeys(ConfigurationReader.getProperty("driver_username"));
//        vytrackLoginPage.passwordInput.sendKeys(ConfigurationReader.getProperty("driver_password"));
//        vytrackLoginPage.loginBtn.click();

        vytrackLoginPage.login("driver_username","driver_password");
    }

    @Then("user should be able to login")
    public void user_should_be_able_to_login() {
//
        BrowserUtils.waitForTitle("Dashboard", 10);

        String expectedTitle = "Dashboard";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals("Title verification is FAILED",expectedTitle, actualTitle);
    }

    @When("user enters the sales manager information")
    public void userEntersTheSalesManagerInformation() {
        vytrackLoginPage.login("sales_manager_username", "sales_manager_password");

    }

    @When("user enters the store manager information")
    public void userEntersTheStoreManagerInformation() {
        vytrackLoginPage.login("store_manager_username", "store_manager_password");
    }

    @When("user enters the username {string} and password {string}")
    public void userEntersTheUsernameAndPassword(String username, String password) {
        vytrackLoginPage.login2(username,password);
    }
}
