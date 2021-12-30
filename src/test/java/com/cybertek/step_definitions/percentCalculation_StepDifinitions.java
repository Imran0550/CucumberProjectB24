package com.cybertek.step_definitions;

import com.cybertek.pages.PercentageCalculatorPage;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.sl.In;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import java.util.Map;

public class percentCalculation_StepDifinitions {

    @Given("User is on percentage calculator page")
    public void user_is_on_percentage_calculator_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("percentage.url"));

    }
    @Then("User should see following calculations:")
    public void user_should_see_following_calculations(Map<Integer, Integer> valuesMap) {

        System.out.println(valuesMap);

        PercentageCalculatorPage percentageCalculatorPage = new PercentageCalculatorPage();
        percentageCalculatorPage.percent.sendKeys("5");

        //loop through keys in the map
        for(Integer inputKey : valuesMap.keySet()){
           percentageCalculatorPage.input.clear();
           percentageCalculatorPage.input.sendKeys(inputKey +"" + Keys.ENTER);
            BrowserUtils.sleep(1);

            System.out.println("INPUT VALUE = " + inputKey);
            System.out.println("Expected 5% value = " + valuesMap.get(inputKey));
            System.out.println("Actual 5% calculated value =" + percentageCalculatorPage.result.getAttribute("value"));
            System.out.println("--------------------------------------------");

            //assert that expected 5% value matches the actual calculated value.
            Assert.assertEquals(valuesMap.get(inputKey), Integer.valueOf(percentageCalculatorPage.result.getAttribute("value")));
        }


    }
}
