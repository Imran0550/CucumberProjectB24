package com.cybertek.tests;

import com.cybertek.pages.VyTrackDashboardPage;
import com.cybertek.pages.VytrackLoginPage;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class VyTrackLoginDDTTest {

   VytrackLoginPage vytrackLoginPage = new VytrackLoginPage();
   VyTrackDashboardPage vyTrackDashboardPage = new VyTrackDashboardPage();

    @Before
    public void setUp(){
        //setUp browser etc if needed
        //open the url

        Driver.getDriver().get(ConfigurationReader.getProperty("vytrack.url"));
    }

    @After
    public void tearDown(){
        //close browser here
    }

    @Test
    public void loginDDTTest(){
        String userName = "user1";
        String password = "UserUser123";
        String firstName = "John";
        String lastName = "Doe";

        vytrackLoginPage.login(userName,password);

        System.out.println(vyTrackDashboardPage.getFullName());

        if(vyTrackDashboardPage.getFullName().contains(firstName) && vyTrackDashboardPage.getFullName().contains(lastName)){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
        }

        vyTrackDashboardPage.logout();

    }
}
