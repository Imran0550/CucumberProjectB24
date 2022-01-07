package com.cybertek.tests;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelWrite {
    String filePath = "Employees.xlsx";
    @Test
    public void writeToExcelSheet() throws IOException {

        //open the file first
        XSSFWorkbook workbook = new XSSFWorkbook(filePath);

        //open sheets
        XSSFSheet sheet = workbook.getSheetAt(0);

        //add a column name "salary" and into file
        XSSFCell salaryColumn = sheet.getRow(0).createCell(3);
        salaryColumn.setCellValue("Salary");

        //save changes:
        //open to write to the file: inputStream -> reading
        //                           outputStream -> writing
        FileOutputStream fileOutputStream = new FileOutputStream(filePath);
        workbook.write(fileOutputStream);
        fileOutputStream.close();
        workbook.close();
    }
}
