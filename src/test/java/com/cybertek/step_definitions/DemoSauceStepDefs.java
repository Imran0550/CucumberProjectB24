package com.cybertek.step_definitions;

import com.cybertek.pages.SauceDemoHomePage;
import com.cybertek.pages.SauceDemoLoginPage;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Map;

public class DemoSauceStepDefs {

    SauceDemoLoginPage sauceDemoLoginPage = new SauceDemoLoginPage();
    SauceDemoHomePage sauceDemoHomePage = new SauceDemoHomePage();
    @Given("user is on sauce demo login page")
    public void user_is_on_sauce_demo_login_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("saucedemo.url"));
    }
    @When("user enters the following:")
    public void user_enters_the_following(Map<String ,String> dataTable) {

        sauceDemoLoginPage.usernameField.sendKeys(dataTable.get("Username"));
        sauceDemoLoginPage.passwordField.sendKeys(dataTable.get("Password"));

    }
    @When("user clicks on login button")
    public void user_clicks_on_login_button() {

        sauceDemoLoginPage.loginBtn.click();
    }
    @Then("user should be able to see {string} at top of page")
    public void user_should_be_able_to_see_at_top_of_page(String product) {

        Assert.assertEquals(sauceDemoHomePage.product(),product);
    }

    @Then("user should able to see {string}")
    public void userShouldAbleToSee(String backPack) {


        Assert.assertEquals(sauceDemoHomePage.packPackText.getText(),backPack);

    }

    @And("user click on add to cart")
    public void userClickOnAddToCart() {

        sauceDemoHomePage.addToCartBtn.click();
    }
}
