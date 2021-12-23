package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DiceJobSearchHomePage {


    public DiceJobSearchHomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "typeaheadInput") public WebElement InputJob;
    @FindBy(xpath = "//input[@placeholder = 'Location (zip, city, state)']") public WebElement zipcode;
    @FindBy(xpath = "//button[@id ='submitSearch-button']") public WebElement searchButton;
}
