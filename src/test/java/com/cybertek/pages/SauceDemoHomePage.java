package com.cybertek.pages;

import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SauceDemoHomePage extends BasePage{

    @FindBy(xpath = "//span[contains(text(),'Products')]") public WebElement productText;
    @FindBy(xpath = "//div[.='Sauce Labs Backpack']") public WebElement packPackText;
    @FindBy(css = "#add-to-cart-sauce-labs-backpack") public WebElement addToCartBtn;


    public String product(){

        return productText.getText();
    }
}
