package org.example;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;


public class App 
{
            public static  void main(String args[]) throws IOException {

                List<Object> excelRead = new ArrayList<>();
                String path = "src/main/resources/emre1.xlsx";
                FileInputStream fis = new FileInputStream(path);
                Workbook workbook = new XSSFWorkbook(fis);
                Sheet sheet = workbook.getSheet("emre");

                int rowCount=sheet.getLastRowNum()-sheet.getFirstRowNum();
                System.out.println("row count:"+rowCount);

                for(int i=0;i<=rowCount;i++){
                    System.out.print(sheet.getRow(i).getCell(0));
                    System.out.println();
                    excelRead.add((sheet.getRow(i).getCell(0)).toString().trim());

                }

                List<Object> bb=new ArrayList<>();
                bb.add("emre1");
                bb.add("emre");
                bb.add("ddd");


                excelRead.removeAll( bb );
                System.out.println( excelRead );
                int diffSize=excelRead.size();

                if(diffSize==0){
                    System.out.println("Fark 0");
                }
                else{
                    System.out.println("İki excel farklı değil!");
                }
            }
}











