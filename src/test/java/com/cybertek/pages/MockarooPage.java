package com.cybertek.pages;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MockarooPage extends BasePage{

    @FindBy(xpath = "//input[@type = 'number']") public WebElement numberOfRow;
    @FindBy(xpath = "//div[@id='mui-component-select-file_format']") public WebElement formatDropDown;
    @FindBy(xpath = "//li[.='Excel']") public WebElement excel;
    @FindBy(xpath = "//span[.='Preview']") public WebElement previewBtn;

    @FindBy(xpath = "//thead//th") public List<WebElement> header;

    @FindBy(xpath = "//table/tbody/tr")
    public List<WebElement> tableRows;

    @FindBy(xpath = "//span[.='Download Data']")
    public WebElement downloadData;



}
