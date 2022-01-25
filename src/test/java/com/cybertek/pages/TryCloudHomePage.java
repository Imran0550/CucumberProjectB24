package com.cybertek.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class TryCloudHomePage extends BasePage{

    @FindBy(xpath = "//div[@class ='panel--header']")
    public List<WebElement> headers;


    public ArrayList<String> allHeader(){

        ArrayList<String> HE = new ArrayList<>();

        for (WebElement each : headers){
            HE.add(each.getText().trim());
        }

        return HE;
    }
}
