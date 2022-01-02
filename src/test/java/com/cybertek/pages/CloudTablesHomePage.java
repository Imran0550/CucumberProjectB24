package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CloudTablesHomePage {


    public CloudTablesHomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//button[@class ='dt-button buttons-create']") public WebElement newButton;
    @FindBy(css = "#DTE_Field_first_name") public WebElement firstName;
    @FindBy(css = "#DTE_Field_last_name") public WebElement lastName;
    @FindBy(css = "#DTE_Field_position") public WebElement position;
    @FindBy(css = "#DTE_Field_salary") public WebElement salary;
    @FindBy(css = "button[class ='btn']") public WebElement createButton;




}
