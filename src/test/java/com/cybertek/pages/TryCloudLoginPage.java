package com.cybertek.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TryCloudLoginPage extends BasePage{

    @FindBy(css = "#user")
    public WebElement usernameField;

    @FindBy(css = "#password")
    public WebElement passwordField;

    @FindBy(xpath = "//input[@id ='submit-form']")
    public WebElement loginButton;

}
