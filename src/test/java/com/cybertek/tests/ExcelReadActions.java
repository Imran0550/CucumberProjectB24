package com.cybertek.tests;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.IOException;

public class ExcelReadActions {
    String filePath = "Employees.xlsx";

    @Test
    public void readExcelSheetData() throws IOException {

        //open the Employee.xlsx using Apache PIO

        XSSFWorkbook workbook = new XSSFWorkbook(filePath);

        // Go to data sheet. or go to first sheet by index
        XSSFSheet sheet = workbook.getSheetAt(0);

        //print column names. row is 0. cells 0,1,2
        System.out.println("COLUMN NAMES:");
        System.out.println(sheet.getRow(0).getCell(0));

        //loop and print three column names
        System.out.println("-----------------------------");

        for(int i=0;i<=2;i++){

            System.out.println(sheet.getRow(0).getCell(i));

            }

        //find out number of rows in the workSheet

        int rowsCount = sheet.getPhysicalNumberOfRows();
        System.out.println("rowsCount = " + rowsCount);

        //loop and find "fahima" in first name column
        //print her first | lastname | job id then exit loop

        System.out.println("\nFAHIMA INFO");
        System.out.println(" FName " + "|   " + " LName " + "|   "+ " jobTitle ");
        for (int i = 0; i <=rowsCount ; i++) {
            if(sheet.getRow(i).getCell(0).toString().equals("Fahima")){
                System.out.println(sheet.getRow(i).getCell(0) + " | "+
                        sheet.getRow(i).getCell(1)+" | "+
                        sheet.getRow(i).getCell(2));
                break;
            }
        }
    }
}
