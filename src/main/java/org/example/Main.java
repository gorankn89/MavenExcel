package org.example;

import com.github.javafaker.Faker;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Faker faker = new Faker();



    }

    public static void WriteData(){
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFWorkbook sheet1 = workbook.createSheet("UserAndPasswords").getWorkbook();
        Faker faker = new Faker();
    }

}