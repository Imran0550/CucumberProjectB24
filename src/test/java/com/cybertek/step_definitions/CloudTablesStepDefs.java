package com.cybertek.step_definitions;

import com.cybertek.pages.CloudTablesHomePage;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CloudTablesStepDefs {

    CloudTablesHomePage cloudTablesHomePage = new CloudTablesHomePage();

    @Given("User is on cloudtables homepage")
    public void user_is_on_cloudtables_homepage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("cloudtable.url"));
        Assert.assertEquals("Editor | Editing for DataTables",Driver.getDriver().getTitle());
    }
    @When("User clicks on New button")
    public void user_clicks_on_new_button() {

        cloudTablesHomePage.newButton.click();


    }
    @When("User enters {string} to firstname field")
    public void user_enters_to_firstname_field(String firstName) {

        cloudTablesHomePage.firstName.sendKeys(firstName);

    }
    @When("User enters {string} to lastname field")
    public void user_enters_to_lastname_field(String lastName) {

        cloudTablesHomePage.lastName.sendKeys(lastName);

    }
    @When("User enters {string} to position field")
    public void user_enters_to_position_field(String pos) {

        cloudTablesHomePage.position.sendKeys(pos);
    }
    @When("User enters {string} to salary field")
    public void user_enters_to_salary_field(String salary) {

        cloudTablesHomePage.salary.sendKeys(salary);

    }
    @When("User clicks on create button")
    public void user_clicks_on_create_button() {
        cloudTablesHomePage.createButton.click();

    }
}
