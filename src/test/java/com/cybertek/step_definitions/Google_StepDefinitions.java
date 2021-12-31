package com.cybertek.step_definitions;

import com.cybertek.pages.GoogleSearchPage;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import java.util.List;

public class Google_StepDefinitions {

    GoogleSearchPage googleSearchPage = new GoogleSearchPage();

    @Given("User is on Google home page")
    public void user_is_on_google_home_page() {

        Driver.getDriver().get("https://www.google.com");

    }


    @When("User searches for apple")
    public void user_searches_for_apple() {

        googleSearchPage.searchBar.sendKeys("apple" + Keys.ENTER);

    }

    @Then("User should see apple in the title")
    public void user_should_see_apple_in_the_title() {

        String actualTitle = Driver.getDriver().getTitle();
        String expectedInTitle = "apple";

        Assert.assertTrue(actualTitle.contains(expectedInTitle));

    }


    @Then("User should be able to search for following:")
    public void userShouldBeAbleToSearchForFollowing(List<String> items) {


        System.out.println("items = " + items);


        for(String each : items){
            new GoogleSearchPage().searchBar.clear();
            new GoogleSearchPage().searchBar.sendKeys(each + Keys.ENTER);
            Assert.assertTrue(Driver.getDriver().getTitle().contains(each));


        }

    }

    @When("User searches for {string} capital")
    public void userSearchesForCapital(String capital) {

        googleSearchPage.searchBar.sendKeys("what is capital city of " + capital + Keys.ENTER);
    }

    @Then("User should see {string} in the result")
    public void userShouldSeeInTheResult(String result) {

        Assert.assertTrue("title doesn't contains the country name",Driver.getDriver().getTitle().contains(result));

    }


}
