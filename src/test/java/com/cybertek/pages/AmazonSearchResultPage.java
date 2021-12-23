package com.cybertek.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AmazonSearchResultPage extends AmazonSearchBasePAge{

    @FindBy(xpath = "//div[@class ='sg-col-14-of-20 sg-col s-breadcrumb sg-col-10-of-16 sg-col-6-of-12']//div[@class ='sg-col-inner']/div[@class ='a-section a-spacing-small a-spacing-top-small']") public WebElement result;

    @FindBy(css = "#searchDropdownBox") public WebElement dropDown;

    @Override
    public void isCurrentPage() {
        Assert.assertEquals(driver.getTitle(),"Amazon.com : Play station 5");
    }

    public String getResult(){
        return result.getText().split(" ")[3];
    }

    public void select(String items){

        Select select = new Select(dropDown);
        select.selectByVisibleText(items);

    }
}
