package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PhpHomeAndLoginPage {

    public PhpHomeAndLoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//form[@method='POST']//input[@name= 'email']") public WebElement emailField;
    @FindBy(xpath = "//input[@type= 'password']") public WebElement passwordField;
    @FindBy(xpath = "//button[@type= 'submit']") public WebElement submitBtn;
    @FindBy(xpath = "//a[@class = 'navbar-brand']") public WebElement dashboard;

    public void inputEmail(String email){
        emailField.sendKeys(email);
    }
}
