package Tests;
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

import static Tests.Sign_UP.signUP_tests;
import static Tests.write_to_excel_and_read.*;

public class main {

    public static void main(String[] args) throws IOException, InterruptedException {
        for (int i = 0; i < sheet_name.length; i++) {
            read_from_excel(sheet_name[i]);
            if (sheet_name[i].equals("entry")) { // or write with switch case
                Sign_UP.signUP_tests(); // class of sheet = entry , with all the connected tests //
            }
        }
    }
}










