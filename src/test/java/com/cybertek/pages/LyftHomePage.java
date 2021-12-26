package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LyftHomePage {

    public LyftHomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(name = "fare-start") public WebElement pickUP;
    @FindBy(name = "fare-end") public WebElement dropOff;
    @FindBy(xpath = "//button[@type = 'submit']") public WebElement estimateButton;

    @FindBy(xpath = "//h3[contains(text(),'RIDE TYPES')]") public WebElement rideInfo;


    public void enterPickUpLocation(String pickUp){

        pickUP.sendKeys(pickUp);

    }
    public void enterDropOffLocation(String dropoff){
        dropOff.sendKeys(dropoff);
    }

    public boolean rideTypes(){
        if (rideInfo.isDisplayed()) return true;


        return false;
    }
}
