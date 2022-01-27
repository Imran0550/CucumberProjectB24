package com.cybertek.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SauceDemoLoginPage extends BasePage{

    @FindBy(id = "user-name") public WebElement usernameField;
    @FindBy(id = "password") public WebElement passwordField;
    @FindBy(id = "login-button") public WebElement loginBtn;
}
