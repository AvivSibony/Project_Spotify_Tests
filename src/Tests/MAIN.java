package Tests;
import java.io.IOException;

public class MAIN {
static String[] sheet_name = {"signup","login"};
    public static void main(String[] args) throws IOException, InterruptedException {
        for (String s : sheet_name) {
            write_to_excel_and_read.read_from_excel(s);
            if (s.equals("signup")) { // or write with switch case
                SignUP.signUP_tests(); // class of sheet = signup , with all the connected tests //
            }
            if (s.equals("login")) { // or write with switch case
                LogIN.LOGIN_Tests(); // class of sheet = login , with all the connected tests //
            }
        }
    }
}









