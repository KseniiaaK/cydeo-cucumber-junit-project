package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BingSearchPage {

    public BingSearchPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "sb_form_q")
    public WebElement searchBox;
}
