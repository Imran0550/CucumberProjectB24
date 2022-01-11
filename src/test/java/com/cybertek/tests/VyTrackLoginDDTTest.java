package com.cybertek.tests;

import com.cybertek.pages.VyTrackDashboardPage;
import com.cybertek.pages.VytrackLoginPage;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

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
    public void loginDDTTest() throws IOException {

        //open excel workbook;

        String filePath = "VyTrackQa2Users.xlsx";
        FileInputStream in = new FileInputStream(filePath);
        XSSFWorkbook workbook = new XSSFWorkbook(in);
        //get a page from the sheet
        XSSFSheet sheet = workbook.getSheetAt(0);
        /*
        String userName = "user1";
        String password = "UserUser123";
        String firstName = "John";
        String lastName = "Doe";

         */
        for(int i = 1; i <= sheet.getLastRowNum(); i++) {

            String userName = sheet.getRow(i).getCell(0).toString();
            String password = sheet.getRow(i).getCell(1).toString();
            String firstName = sheet.getRow(i).getCell(2).toString();
            String lastName = sheet.getRow(i).getCell(3).toString();


            vytrackLoginPage.login(userName, password);

            VyTrackDashboardPage dashboardPage = new VyTrackDashboardPage();
            System.out.println("Full name = " + dashboardPage.fullName.getText());

            String actualFullName = dashboardPage.fullName.getText();

            // Assert.assertTrue(actualFullName.contains(firstName) && actualFullName.contains(lastName));

            XSSFCell resultCell = sheet.getRow(i).getCell(4);

            if (actualFullName.contains(firstName) && actualFullName.contains(lastName)) {
                System.out.println("PASS");
                resultCell.setCellValue("PASS");
            } else {
                System.out.println("FAIL");
                resultCell.setCellValue("FAIL");
            }

            dashboardPage.logout();
        }

        //save changes in the excel file
        FileOutputStream out = new FileOutputStream(filePath);
        workbook.write(out);

        in.close();
        out.close();
        workbook.close();
    }
}
