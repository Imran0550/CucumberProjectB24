package com.cybertek.tests;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ExcelRead2 {

    @Test
    public void excelRead() throws IOException {

        String filePath = "Book1.xlsx";

        //open the excel
        XSSFWorkbook workbook = new XSSFWorkbook(filePath);
        //open the excel sheet
        XSSFSheet sheet = workbook.getSheetAt(0);

        System.out.println(sheet.getRow(0).getCell(0));

        List<String > addFromExcel = new ArrayList<>();

        for(int i =0;i <sheet.getLastRowNum();i++){
            addFromExcel.add(sheet.getRow(0).getCell(i).toString());
        }
        System.out.println(addFromExcel);

        System.out.println("Imran's Info");
        System.out.println("Name  | id  | school ");

        for(int i=0;i<sheet.getLastRowNum();i++){
            if(sheet.getRow(i).getCell(0).toString().equals("Imran")){
                System.out.println(sheet.getRow(i).getCell(0)+" | " + sheet.getRow(i).getCell(1) + " | " + sheet.getRow(i).getCell(2));
                break;
            }

        }

    }
}
