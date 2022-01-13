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

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class VyTrackLoginDDTTest2 {

    VytrackLoginPage vytrackLoginPage = new VytrackLoginPage();
    VyTrackDashboardPage vyTrackDashboardPage = new VyTrackDashboardPage();

    @Before
    public void setUp(){
        Driver.getDriver().get(ConfigurationReader.getProperty("vytrack.url"));
    }

    @After
    public void tearDown(){
        //close the driver here
    }

    @Test
    public void vyTrackDDTTest() throws IOException {

        String filePath = "VyTrackQa2Users.xlsx";
        FileInputStream in = new FileInputStream(filePath);

        XSSFWorkbook workbook = new XSSFWorkbook(in);

        XSSFSheet sheet = workbook.getSheetAt(0);

        //using loop send username and password from excel sheet

        for(int i =1; i<sheet.getLastRowNum();i++){

            String username = sheet.getRow(i).getCell(0).toString();
            String password = sheet.getRow(i).getCell(1).toString();
            String firstName = sheet.getRow(i).getCell(2).toString();
            String lastName = sheet.getRow(i).getCell(3).toString();

            vytrackLoginPage.login(username,password);

            System.out.println(vyTrackDashboardPage.fullName.getText());

            String actualName = vyTrackDashboardPage.fullName.getText();

            XSSFCell cell = sheet.getRow(i).createCell(4);

            if(actualName.contains(firstName) && actualName.contains(lastName)){
                System.out.println("PASS");
                cell.setCellValue("PASS");
            }else {
                System.out.println("FAIL");
                cell.setCellValue("FAIL");
            }

            vyTrackDashboardPage.logout();
        }
        //save the changes to excel file

        FileOutputStream out = new FileOutputStream(filePath);
        workbook.write(out);
        in.close();
        out.close();
        workbook.close();
    }
}
