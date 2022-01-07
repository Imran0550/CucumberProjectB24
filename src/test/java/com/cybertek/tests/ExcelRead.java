package com.cybertek.tests;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.IOException;

public class ExcelRead {

    @Test
    public void readingFromExcel() throws IOException {
        //Open excel workbook using XSSFWorkBook class
            XSSFWorkbook workbook = new XSSFWorkbook("Employee2.xlsx");

            //Goto worksheet. pass the worksheet name
        XSSFSheet xssfSheet = workbook.getSheet("sheet1");

        //print mike from the sheet
        System.out.println(xssfSheet.getRow(1).getCell(0));
        //print Romanenko from 3rd row
        System.out.println(xssfSheet.getRow(3).getCell(1));
    }
}
