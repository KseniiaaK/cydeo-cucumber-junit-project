package com.cydeo.step_definitions;

import com.cydeo.pages.GoogleSearchPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class Google_StepDefinitions {

    GoogleSearchPage googleSearchPage = new GoogleSearchPage();

    @When("user searches for {word}")
    public void user_searches_for_apple(String keyWord) {
        BrowserUtils.sleep(2);
googleSearchPage.searchBox.sendKeys(keyWord + Keys.ENTER);
    }
    @Then("user should see {word} in the title")
    public void user_should_see_apple_in_the_title(String keyWord) {
        BrowserUtils.sleep(2);
        BrowserUtils.verifyTitle(keyWord + " - Google Search");
    }

    @When("user is on the Google search page")
    public void user_is_on_the_google_search_page() {
        Driver.getDriver().get("https://www.google.com");
    }
    @Then("user should see title is Google")
    public void user_should_see_title_is_google() {

        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Google";
        Assert.assertEquals(actualTitle, expectedTitle);

        Driver.closeDriver();
    }


//    @And("user sees {int} apples")
//    public void userSeesApples(int arg0) {
//    }
}
