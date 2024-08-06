package com.pru.test;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;

public class util {


    public static void main(String[] args) throws IOException {

        long startTime = System.currentTimeMillis();
getData();
        long endtime = System.currentTimeMillis();


        long excecutionTime = endtime - startTime;

        System.out.println(excecutionTime);
    }

    public static void getData() throws IOException {

        FileInputStream fileinputStream = new FileInputStream("C:\\Users\\abdel\\IdeaProjects\\prudential\\src\\main\\resources\\Book1.xlsx");

        XSSFWorkbook workbook = new XSSFWorkbook(fileinputStream);
        XSSFSheet sheet1 = workbook.getSheet("sheet1");

        for (int i = 0; i < sheet1.getRow(i).getLastCellNum(); i++) {

            XSSFCell cell = sheet1.getRow(1).getCell(i);
            System.out.println("cell.toString() = " + cell.toString());
        }

    }


}


