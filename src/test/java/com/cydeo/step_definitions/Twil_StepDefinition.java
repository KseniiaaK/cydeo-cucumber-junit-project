package com.cydeo.step_definitions;

import com.cydeo.pages.TwilPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class Twil_StepDefinition {

    TwilPage twilPage = new TwilPage();

    @Given("user is on a discuss page of the application")
    public void user_is_on_a_discuss_page_of_the_application() {
        twilPage.twilLogin();

    }
    @When("user navigate to direct message field")
    public void user_navigate_to_direct_message_field() {

    }
    @When("user select another user")
    public void user_select_another_user() {

        twilPage.posManager.click();

    }
    @When("user send message")
    public void user_send_message() {
        twilPage.textArea.sendKeys("Hi");
        twilPage.sendBtn.click();

    }
    @Then("message is displayed")
    public void message_is_displayed() {
        Driver.getDriver().navigate().refresh();
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("(//div/p)[14]")).getText().equals("Hi"));

    }
}
