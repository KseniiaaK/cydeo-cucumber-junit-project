package com.cydeo.pages;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TwilPage {

    public TwilPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "login")
    public WebElement username;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(xpath = "//button[.='Log in']")
    public WebElement loginBtn;

    @FindBy(xpath = "(//div//span[@class='o_channel_name'])[12]")
    public WebElement posManager;

    @FindBy(xpath = "(//textarea[@placeholder='Write something...'])[1]")
    public WebElement textArea;

    @FindBy(xpath = "(//button[@tabindex='3'])[1]")
    public WebElement sendBtn;

    public void twilLogin(){
        Driver.getDriver().get(ConfigurationReader.getProperty("twilURL"));
        username.sendKeys(ConfigurationReader.getProperty("im_username"));
        password.sendKeys(ConfigurationReader.getProperty("im_password"));
        loginBtn.click();
    }


}
