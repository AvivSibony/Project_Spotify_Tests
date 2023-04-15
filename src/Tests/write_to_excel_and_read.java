package Tests;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class write_to_excel {

        static String filepath = "C:\\Users\\asibonyx\\OneDrive - Intel Corporation\\Desktop\\Aviv\\QA Projects\\Spotify Project\\STD - Chrome.xlsx";
        static XSSFSheet sheet;

        public static void excelPrint(int rowNumber, int cellNumber ) throws FileNotFoundException {
            FileInputStream file = new FileInputStream(filepath); // path of the Excel file
            Row row = sheet.getRow(rowNumber);
            if (row == null) {
                row = sheet.createRow(rowNumber);
            }
            Cell cell = row.getCell(cellNumber);
            if (cell == null) {
                cell = row.createCell(cellNumber);
            }
        }
    }



