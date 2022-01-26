package com.cybertek.pages;

import io.cucumber.java.it.Ma;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Map;

public class AddSpartanPage extends BasePage{


    @FindBy(xpath = "//input[@id='name']")
    public WebElement nameInput;

    @FindBy(xpath = "//select[@id='genderSelect']")
    public WebElement genderSelect;

    @FindBy(xpath = "//input[@id='phone']")
    public WebElement phoneNumberInput;

    @FindBy(id = "submit_btn")
    public WebElement submitBtn;


    @FindBy(xpath = "//div[@role ='alert']")
    public WebElement successMsg;


    public void selectMale(String gender){
        new Select(genderSelect).selectByVisibleText(gender);
    }
}
