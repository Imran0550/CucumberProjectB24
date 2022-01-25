package com.cybertek.step_definitions;

import com.cybertek.pages.TryCloudHomePage;
import com.cybertek.pages.TryCloudLoginPage;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class TryCloudStepDefs {


    TryCloudLoginPage tryCloudLoginPage = new TryCloudLoginPage();
    TryCloudHomePage tryCloudHomePage = new TryCloudHomePage();
    @Given("user is on tyrClod login page")
    public void user_is_on_tyr_clod_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("trycloud.url"));
    }
    @When("user enters {string} in username field")
    public void user_enters_in_username_field(String user) {
        tryCloudLoginPage.usernameField.sendKeys(user);
    }
    @When("user enters {string} is password field")
    public void user_enters_is_password_field(String pass) {
        tryCloudLoginPage.passwordField.sendKeys(pass);
    }
    @Then("user should be able to login")
    public void user_should_be_able_to_login() {
      tryCloudLoginPage.loginButton.click();
    }



    @Then("user should be able to see:")
    public void user_should_be_able_to_see(List<String> dataTable) {

        Assert.assertEquals(tryCloudHomePage.allHeader(),dataTable);
    }
}
