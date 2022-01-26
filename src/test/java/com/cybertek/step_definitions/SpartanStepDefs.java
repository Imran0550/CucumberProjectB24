package com.cybertek.step_definitions;

import com.cybertek.pages.AddSpartanPage;
import com.cybertek.pages.SpartanPage;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;
import java.util.Map;


public class SpartanStepDefs {

    SpartanPage spartanPage = new SpartanPage();
    AddSpartanPage addSpartanPage = new AddSpartanPage();

    Map<String ,String> spartanMap;
    @Given("User is on spartan home page")
    public void user_is_on_spartan_home_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("spartan.url"));

    }
    @When("User goes to Web Data page")
    public void user_goes_to_web_data_page() {

        spartanPage.webDataTab.click();
    }
    @When("clicks on add spartan")
    public void clicks_on_add_spartan() {

        spartanPage.addSpartanBtn.click();
    }
    @When("enters following data and submits:")
    public void enters_following_data_and_submits(Map<String,String> dataTable) {

        spartanMap.putAll(dataTable);

        addSpartanPage.nameInput.sendKeys(dataTable.get("name"));
        addSpartanPage.selectMale(dataTable.get("gender"));
        addSpartanPage.phoneNumberInput.sendKeys(dataTable.get("phone"));
        addSpartanPage.submitBtn.click();
    }
    @Then("success message should be displayed")
    public void success_message_should_be_displayed() {

        Assert.assertTrue(addSpartanPage.successMsg.isDisplayed());

    }
    @Then("data on confirmation page must be same")
    public void data_on_confirmation_page_must_be_same() {



    }
}
