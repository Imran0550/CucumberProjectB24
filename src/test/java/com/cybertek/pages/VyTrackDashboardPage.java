package com.cybertek.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VyTrackDashboardPage extends BasePage {

    @FindBy(xpath = "//li[@id ='user-menu']/a[contains(text(),'John Doe')]")
    public WebElement fullName;

    @FindBy(xpath = "//a[.='Logout']")
    public WebElement logoutText;

    public String getFullName(){

        return fullName.getText().trim();
    }

    public void logout(){
        fullName.click();
        logoutText.click();
    }
}
