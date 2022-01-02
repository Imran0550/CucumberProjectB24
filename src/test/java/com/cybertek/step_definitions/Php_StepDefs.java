package com.cybertek.step_definitions;

import com.cybertek.pages.PhpHomeAndLoginPage;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Php_StepDefs {

    PhpHomeAndLoginPage phpHomeAndLoginPage = new PhpHomeAndLoginPage();

    @Given("user is on php home page")
    public void user_is_on_php_home_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("php.url"));
        Assert.assertEquals("Administator Login",Driver.getDriver().getTitle());
    }
    @When("user enters {string} in email field")
    public void user_enters_in_email_field(String Email) {

        phpHomeAndLoginPage.inputEmail(Email);

    }
    @When("user enters {string} in password field")
    public void user_enters_in_password_field(String pass) {

        phpHomeAndLoginPage.passwordField.sendKeys(pass);

    }
    @When("user clicks login")
    public void user_clicks_login() {

        phpHomeAndLoginPage.submitBtn.click();

    }
    @Then("user should be able to see dashboard")
    public void user_should_be_able_to_see_dashboard() {

       Assert.assertTrue(phpHomeAndLoginPage.dashboard.isDisplayed());
    }

}
