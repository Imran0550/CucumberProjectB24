package com.cybertek.tests;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelWrite2 {

    String filePath = "Book1.xlsx";
    @Test
    public void excelWrite() throws IOException {

        //open the file to read, using input stream

        FileInputStream in = new FileInputStream(filePath);

        //open excel
        XSSFWorkbook workbook = new XSSFWorkbook(in);

        //open sheet
        XSSFSheet sheet = workbook.getSheetAt(0);

        //add a column name salary, and add to file

        XSSFCell cell = sheet.getRow(0).createCell(4);
        //set the cell value to salary
        cell.setCellValue("Salary");

        XSSFCell xssfCell = sheet.getRow(1).createCell(4);
        xssfCell.setCellValue("150000");

        FileOutputStream out = new FileOutputStream(filePath);
        workbook.write(out);
        out.close();
        workbook.close();
        in.close();
    }
}
