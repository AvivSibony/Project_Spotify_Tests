package Tests;
import java.io.IOException;
import static Tests.write_to_excel_and_read.*;
public class MAIN {
    static String[] sheet_name = {"entry"};// I can add more
    public static void main(String[] args) throws IOException, InterruptedException {
        for (String s : sheet_name) {
            read_from_excel(s);
            if (s.equals("entry")) { // or write with switch case
                SignUP.signUP_tests(); // class of sheet = entry , with all the connected tests //
            }
        }
    }
}










