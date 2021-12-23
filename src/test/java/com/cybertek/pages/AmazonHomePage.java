package com.cybertek.pages;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonHomePage extends AmazonSearchBasePAge{

    @FindBy(css = "#twotabsearchtextbox") public WebElement searchBox;

    @Override
    public void isCurrentPage() {
        String exp = "Amazon.com. Spend less. Smile more.";
        Assert.assertEquals(driver.getTitle(),exp);
    }

    public void enterSomething(String item){
        searchBox.sendKeys(item + Keys.ENTER);
    }
}
