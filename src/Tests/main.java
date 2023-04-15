package Tests;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class main {
static String file_path = "C:\\Users\\asibonyx\\OneDrive - Intel Corporation\\Desktop\\Aviv\\QA Projects\\Spotify Project\\STD - Chrome.xlsx";

public static void excel_read(String Sheet) throws IOException {
    FileInputStream file = new FileInputStream(file_path);
    XSSFWorkbook wb =new XSSFWorkbook(file);
    XSSFSheet sheet =wb.getSheet(Sheet);
    int last = sheet.getLastRowNum();
    int first = sheet.getFirstRowNum();
        for(int i=0;first<last;i++){
        XSSFRow name_row = sheet.getRow(i);
        XSSFCell name_cell = name_row.getCell(0);
        String value = name_cell.getStringCellValue();
        while(value.equals("מס הצעד")){
            XSSFRow name_row1 = sheet.getRow(i++);
            XSSFCell name_cell1 = name_row1.getCell(1);
            String test = name_cell1.getStringCellValue();
            System.out.println(test);
             if(test.isEmpty()){
                 break;}
        }
    }
}

@BeforeClass
public static void BeforeClass(){}
@AfterClass
public static void AfterClass(){}
@Test
public void Test01() throws IOException {
    excel_read("כניסה לאתר");
}@Test
public void Test02() throws IOException {
    excel_read("כניסה לאתר");
}@Test
public void Test03() throws IOException {
    excel_read("כניסה לאתר");
}



}
