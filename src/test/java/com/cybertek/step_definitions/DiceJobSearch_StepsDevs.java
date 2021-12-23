package com.cybertek.step_definitions;

import com.cybertek.pages.DiceJobSearchHomePage;
import com.cybertek.pages.DiceJobSearchResult;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DiceJobSearch_StepsDevs {

    @Given("User is on dice homepage")
    public void user_is_on_dice_homepage() {

        Driver.getDriver().get(ConfigurationReader.getProperty("Dice"));
    }
    @When("User enters keyword and zipcode")
    public void user_enters_keyword_and_zipcode() {

        DiceJobSearchHomePage homePage = new DiceJobSearchHomePage();
        homePage.InputJob.sendKeys("SDET");
        homePage.zipcode.sendKeys("22405");
        homePage.searchButton.click();

    }
    @Then("User should see search results")
    public void user_should_see_search_results() {

        DiceJobSearchResult searchResult = new DiceJobSearchResult();

        System.out.println("total results = " + searchResult.totalJobCount.getText());

        Assert.assertTrue(searchResult.totalJobCount.isDisplayed());


    }
}
