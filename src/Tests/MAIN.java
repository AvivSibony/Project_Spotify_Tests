package Tests;
import java.io.IOException;

public class MAIN {
static String[] sheet_name = {"signup","login","search"};
    public static void main(String[] args) throws IOException, InterruptedException {
        for (String s : sheet_name) {
            write_to_excel_and_read.read_from_excel(s);
            switch (s) {
                case "signup" -> SignUP.signUP_tests();
                case "login" -> LogIN.LogIN_tests();
                //case "search" -> Search;
            }
        }
    }
}









