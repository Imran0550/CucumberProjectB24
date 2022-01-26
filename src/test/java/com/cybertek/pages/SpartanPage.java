package com.cybertek.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SpartanPage extends BasePage{

    @FindBy(xpath = "//i[@class = 'fas fa-users']") public WebElement webDataTab;
    @FindBy(xpath = "//a[@id='add_spartan_btn']") public WebElement addSpartanBtn;
}
