package com.cybertek.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VytrackLoginPage extends BasePage {

    //no need for @FindBy, since "name" in html is matching
    @FindBy(name = "_username")
    public WebElement userName;

    @FindBy(name = "_password")
    public WebElement password;

    @FindBy(id = "_submit")
    public WebElement logIn;




    public void login(String Name, String pass ){

        userName.sendKeys(Name);
        password.sendKeys(pass);
        logIn.click();
    }
}
