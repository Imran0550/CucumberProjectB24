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
    @FindBy(xpath = "//table/tbody/tr[1]/td[3]") public WebElement rideCost;
    @FindBy(xpath = "//small[.='Please select a valid location.']") public WebElement errorMessage;


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

    public String totalCost(){

        return rideCost.getText().substring(0,6);
    }


}
