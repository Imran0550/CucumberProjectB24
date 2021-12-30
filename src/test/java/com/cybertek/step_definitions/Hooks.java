package com.cybertek.step_definitions;

import com.cybertek.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;

/**
 * similar to TestBase.java in testNg framework
 * We open close browsers here etc
 */

public class Hooks {

    @Before
    public void setUpScenario(){
        System.out.println("BEFORE - setUp method is running before the scenario ");

    }

    @After
    public void tearDownScenario(){
        System.out.println("AFTER - tearDown scenario is running after the scenario");

        Driver.closeDriver();
    }
}
