package Tests;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class write_to_excel_and_read {

    public static String filepath = "C:\\Users\\asibonyx\\OneDrive - Intel Corporation\\spotify.xlsx";
    public static String[] sheet_name = {"entry"};// I can add more
    static int num_value = 0;
    static String value;
    public static List<Integer> locations_of_steps = new ArrayList<>();
    public static List<String> list_of_steps = new ArrayList<>();
    public static List<String> list_of_steps_email = new ArrayList<>();
    public static List<String> list_of_steps_sign_up_first_btn = new ArrayList<>();
    public static List<String> list_of_steps_confirm_email = new ArrayList<>();
    public static List<String> list_of_steps_pw = new ArrayList<>();
    public static List<String> list_of_steps_username = new ArrayList<>();
    public static List<String> list_of_steps_all_btns = new ArrayList<>();
    public static List<String> list_of_steps_age_day = new ArrayList<>();
    public static List<String> list_of_steps_age_month = new ArrayList<>();
    public static List<String> list_of_steps_age_year = new ArrayList<>();
    public static List<String> list_of_steps_radio_box = new ArrayList<>();
    public static List<String> list_of_steps_check_box = new ArrayList<>();

    public static void read_from_excel(String SheetName) throws IOException {
        FileInputStream file = new FileInputStream(filepath);
        XSSFWorkbook wb = new XSSFWorkbook(file);
        XSSFSheet sheet = wb.getSheet(SheetName);
        int last = sheet.getLastRowNum();
        System.out.println(last);
        for (int i = 0; i < last; i++) {
            XSSFRow name_row = sheet.getRow(i);
            XSSFCell name_cell = name_row.getCell(0);
            CellType type = name_cell.getCellType();
            if (type == CellType.NUMERIC) {
                // if the data is number //
                num_value = (int) name_cell.getNumericCellValue();
                list_of_steps.add(String.valueOf(num_value));
                System.out.println(num_value+" = "+i);
            }
            if (type == CellType.STRING) {
                // if the data is string //
                value = name_cell.getStringCellValue();
                list_of_steps.add(value);
                System.out.println(value + " = "+i);}

        }


    }
    public static void write_to_excel(String data, int location) throws IOException {
                FileInputStream inputStream = new FileInputStream(filepath);// open Excel file //
                Workbook workbook = WorkbookFactory.create(inputStream);
                Sheet sheet =workbook.getSheetAt(0); // selected the excepted sheet // now without a loop //
                Row row = sheet.getRow(location); // get the row location //
                if(row==null){
                    row =sheet.createRow(location);}
                Cell cell = row.getCell(2); // write the data to the excepted result cells //
                if(cell==null){
                    cell = row.createCell(2);}
                cell.setCellValue(data); // copy the data to the correct cell //
                FileOutputStream outputStream = new FileOutputStream(filepath); // open access to write //
                workbook.write(outputStream);
                workbook.close(); // close the file with the data I write //
                outputStream.close();
            }

}