package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class AmazonSearchBasePAge {

    @FindBy(xpath = "//a[@class = 'nav-logo-link nav-progressive-attribute']") public WebElement amazonLogo;


    WebDriver driver;

    public AmazonSearchBasePAge(){
        driver = Driver.getDriver();
        PageFactory.initElements(driver,this);

    }

    public abstract void isCurrentPage();

}
