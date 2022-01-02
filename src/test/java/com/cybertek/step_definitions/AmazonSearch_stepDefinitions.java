package com.cybertek.step_definitions;

import com.cybertek.pages.AmazonHomePage;
import com.cybertek.pages.AmazonSearchResultPage;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import java.util.List;

public class AmazonSearch_stepDefinitions {
    AmazonHomePage homePage = new AmazonHomePage();

    @Given("User is on Amazon home page")
    public void user_is_on_amazon_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("Amazon.url"));

        homePage.isCurrentPage();
    }

    @When("User searches for anything")
    public void user_searches_for_anything() {

        AmazonHomePage homePage = new AmazonHomePage();
        homePage.enterSomething("Play station 5");

    }

    @Then("User should be able to see the results of the search")
    public void user_should_be_able_to_see_the_results_of_the_search() {

        AmazonSearchResultPage resultPage = new AmazonSearchResultPage();
        BrowserUtils.sleep(2);
        resultPage.isCurrentPage();
        System.out.println("Total results for your search: " + resultPage.getResult());

        resultPage.select("Amazon Fresh");

    }

    @Then("User should be able to search for the following:")
    public void user_should_be_able_to_search_for_the_following(List<String> items) {


        for (String each : items) {
            homePage.searchBox.clear();
            homePage.searchBox.sendKeys(each + Keys.ENTER);
            Assert.assertTrue(Driver.getDriver().getTitle().contains(each));
        }
    }
}
