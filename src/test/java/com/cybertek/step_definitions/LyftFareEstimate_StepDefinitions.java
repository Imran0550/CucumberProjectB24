package com.cybertek.step_definitions;

import com.cybertek.pages.LyftHomePage;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class LyftFareEstimate_StepDefinitions {

    WebDriver driver;
    LyftHomePage page = new LyftHomePage();

    @Given("user is on the lyft fare estimate home page")
    public void user_is_on_the_lyft_fare_estimate_home_page() {
        driver = Driver.getDriver();
        driver.get(ConfigurationReader.getProperty("LyftFare"));
        assertEquals("Get Fare Estimates for Your City - Lyft Price Estimate | Lyft",driver.getTitle());
    }
    @When("user enters {string} to pick up address")
    public void user_enters_to_pick_up_address(String pickUpLocation) {

        page.enterPickUpLocation(pickUpLocation);


    }
    @When("user enters {string} to drop off location")
    public void user_enters_to_drop_off_location(String dropOffLocation) {
        page.enterDropOffLocation(dropOffLocation + Keys.ENTER);

    }
    @When("user clicks on get estimate button")
    public void user_clicks_on_get_estimate_button() {

//        Actions actions = new Actions(driver);
//        actions.moveToElement(page.estimateButton).doubleClick().perform();

        page.estimateButton.click();
        BrowserUtils.sleep(2);
        page.estimateButton.click();

    }
    @Then("user should be able to see estimate")
    public void user_should_be_able_to_see_estimate() {

        System.out.println(page.rideTypes());

        System.out.println(page.totalCost());

    }

    @Then("user should see error message")
    public void userShouldSeeErrorMessage() {
        assertTrue("Error message is not displayed", page.errorMessage.isDisplayed());
    }
}
