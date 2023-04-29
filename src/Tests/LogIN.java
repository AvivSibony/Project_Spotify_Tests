package Tests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import static Tests.SignUP.driver;
import static java.lang.Thread.sleep;

public class LogIN {
        public static List<String> list_of_steps_first_login = new ArrayList<>();
        public static List<String> list_of_steps_username_login = new ArrayList<>();
        public static List<String> list_of_steps_password = new ArrayList<>();
        public static List<String> list_of_steps_social = new ArrayList<>();
        public static List<String> list_of_steps_forgot_pw = new ArrayList<>();
        public static List<String> list_of_steps_checkbox = new ArrayList<>();
        public static List<String> list_of_steps_last_login = new ArrayList<>();
        public static List<String> list_of_steps_go_signup = new ArrayList<>();
    public static WebElement LOGIN_FIRST_BTN(WebDriver driver) {return SignUP.driver.findElement(By.xpath("//span[text()='Log in']"));}
    public static WebElement SOCIAL_BTNS(WebDriver driver, int i) {
        List<WebElement> SOCIAL_BTNS = SignUP.driver.findElements(By.className("sc-iJnaPW ygyMW"));
        return SOCIAL_BTNS.get(i);
    }
    public static WebElement USER_LOGIN(WebDriver driver) {
        return SignUP.driver.findElement(By.id("login-username"));}
    public static WebElement PLEASE_ENTER(WebDriver driver) {return SignUP.driver.findElement(By.xpath("//p[text()='Please enter your Spotify username or email address.']"));}
    public static WebElement PLEASE_PW(WebDriver driver) {return SignUP.driver.findElement(By.xpath("//span[text()='Please enter your password.']"));}
    public static WebElement PW_LOGIN(WebDriver driver) {return SignUP.driver.findElement(By.id("login-password"));}
    public static WebElement CHECK_BOX_REMEMBER(WebDriver driver) {return SignUP.driver.findElement(By.className("Indicator-sc-1airx73-0 bpcByA"));}
    public static WebElement FORGOT_PW_LINK(WebDriver driver) {return SignUP.driver.findElement(By.xpath("//a[text()='Forgot your password?']"));}
    public static WebElement LOGIN_OFFICIAL(WebDriver driver) {return SignUP.driver.findElement(By.xpath("//span[text()='Log In']"));}
    public static WebElement GO_SIGNUP(WebDriver driver) {return SignUP.driver.findElement(By.xpath("//span[text()='Sign up for Spotify']"));} // POM Elements //

    public static void LogIN_tests() throws IOException, InterruptedException {
        for (int j = 0; j < write_to_excel_and_read.list_of_steps.size(); j++) {
            switch (write_to_excel_and_read.list_of_steps.get(j)) {
                case "log_in_first_btn" -> write_to_excel_and_read.locations_of_steps2.add(j); // 1 position //
                case "social_buttons" -> write_to_excel_and_read.locations_of_steps2.add(j); // 3 position //
                case "username" -> write_to_excel_and_read.locations_of_steps2.add(j); // 7 position //
                case "password" -> write_to_excel_and_read.locations_of_steps2.add(j); // 51 position //
                case "forgot_password" -> write_to_excel_and_read.locations_of_steps2.add(j); // 77 position //
                case "check_box" -> write_to_excel_and_read.locations_of_steps2.add(j); // 80 position //
                case "login" -> write_to_excel_and_read.locations_of_steps2.add(j); // 83 position //
                case "go_signup" -> write_to_excel_and_read.locations_of_steps2.add(j); // 86 position //
            }
        }
        for (int i = 0; i < write_to_excel_and_read.list_of_steps.size(); i++) {
            if (i > write_to_excel_and_read.locations_of_steps2.get(0) && i < write_to_excel_and_read.locations_of_steps2.get(1)) {// tests of login first button //
                list_of_steps_first_login.add(write_to_excel_and_read.list_of_steps.get(i));
            }
            if (i > write_to_excel_and_read.locations_of_steps2.get(1) && i < write_to_excel_and_read.locations_of_steps2.get(2)) {// tests of social buttons //
                list_of_steps_social.add(write_to_excel_and_read.list_of_steps.get(i));
            }
            if (i > write_to_excel_and_read.locations_of_steps2.get(2) && i < write_to_excel_and_read.locations_of_steps2.get(3)) {// tests of username //
                list_of_steps_username_login.add(write_to_excel_and_read.list_of_steps.get(i));
            }
            if (i > write_to_excel_and_read.locations_of_steps2.get(3) && i < write_to_excel_and_read.locations_of_steps2.get(4)) {  // tests of password //
                list_of_steps_password.add(write_to_excel_and_read.list_of_steps.get(i));
            }
            if (i > write_to_excel_and_read.locations_of_steps2.get(4) && i < write_to_excel_and_read.locations_of_steps2.get(5)) {// tests of forgot password//
                list_of_steps_forgot_pw.add(write_to_excel_and_read.list_of_steps.get(i));
            }
            if (i > write_to_excel_and_read.locations_of_steps2.get(5) && i < write_to_excel_and_read.locations_of_steps2.get(6)) {// tests of checkbox //
                list_of_steps_checkbox.add(write_to_excel_and_read.list_of_steps.get(i));
            }
            if (i > write_to_excel_and_read.locations_of_steps2.get(6) && i < write_to_excel_and_read.locations_of_steps2.get(7)) {// tests of last login //
                list_of_steps_last_login.add(write_to_excel_and_read.list_of_steps.get(i));
            }
            if (i > write_to_excel_and_read.locations_of_steps2.get(7)) {// tests of go signup //
                list_of_steps_go_signup.add(write_to_excel_and_read.list_of_steps.get(i));
            }
        }
        BeforeClass_LOGIN(); // start the tests //
    }

    @BeforeClass
    public static void BeforeClass_LOGIN() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://open.spotify.com/");
    }

    @AfterClass
    public static void AfterClass_LOGIN() { driver.close();} // -> need to move to another tests in the web //

    /////////////////////////////////  TESTS - LOG-IN  ///////////////////////////////////////
@Test
public static void log_in_first_btn() throws InterruptedException, IOException {
    for (String x : list_of_steps_first_login) {
        LOGIN_FIRST_BTN(driver).click(); // click on sign-up button //
        sleep(2000); // delay 2 seconds //
        driver.navigate().back(); // go back to the first page //
        write_to_excel_and_read.write_to_excel(driver.getCurrentUrl(), write_to_excel_and_read.list_of_steps.indexOf(x)); // write the data to the Excel file //
    }
}

@Test
public static void social_buttons() throws InterruptedException, IOException {
    for (String x : list_of_steps_social) {
        SOCIAL_BTNS(driver, list_of_steps_social.indexOf(x)).click();
        sleep(2000);
        driver.navigate().back(); // go back to sign-up page //
        write_to_excel_and_read.write_to_excel(driver.getCurrentUrl(), write_to_excel_and_read.list_of_steps.indexOf(x)); // write the data to the Excel file //
    }
}

@Test
public static void username() throws IOException {
    for (String x : list_of_steps_username_login) {
        USER_LOGIN(driver).clear();
        USER_LOGIN(driver).sendKeys(x);
        if (PLEASE_ENTER(driver).getText().equals("Please enter your Spotify username or email address.")) {
            write_to_excel_and_read.write_to_excel(PLEASE_ENTER(driver).getText(), write_to_excel_and_read.list_of_steps.indexOf(x));
        } else {
            write_to_excel_and_read.write_to_excel(x, write_to_excel_and_read.list_of_steps.indexOf(x));
        }
    }
}

@Test
public static void password() throws IOException {
            for (String x : list_of_steps_password) {
                PW_LOGIN(driver).clear();
                PW_LOGIN(driver).sendKeys(x);
                if (PLEASE_PW(driver).getText().equals("Please enter your password.")) {
                    write_to_excel_and_read.write_to_excel(PLEASE_PW(driver).getText(), write_to_excel_and_read.list_of_steps.indexOf(x));
                } else {
                    write_to_excel_and_read.write_to_excel(x, write_to_excel_and_read.list_of_steps.indexOf(x));
                }
            }
        }

@Test
public static void forgot_password() throws InterruptedException, IOException {
        for (String x : list_of_steps_forgot_pw) {
            if (x.startsWith("clicked")) {
                FORGOT_PW_LINK(driver).click();
                // only one click //
                sleep(2000);
                write_to_excel_and_read.write_to_excel(driver.getCurrentUrl(), write_to_excel_and_read.list_of_steps.indexOf(x));
                driver.navigate().refresh();
            }// refresh the page //
            if (x.startsWith("always")) {
                // always clicked //
                for (int i = 0; i < 100; i++) { // 100 clicks //
                     FORGOT_PW_LINK(driver).click(); }
                write_to_excel_and_read.write_to_excel(driver.getCurrentUrl(), write_to_excel_and_read.list_of_steps.indexOf(x));
                driver.navigate().refresh(); // refresh the page //
            }
        }}

@Test
public static void check_box() throws IOException, InterruptedException {
        for (String x : list_of_steps_checkbox){
                if(x.startsWith("clicked")) {
                    // only one click //
                    CHECK_BOX_REMEMBER(driver).click();
                    sleep(2000);
                    if(CHECK_BOX_REMEMBER(driver).isSelected()) {
                        // if the button was click //
                        write_to_excel_and_read.write_to_excel("clicked",write_to_excel_and_read.list_of_steps.indexOf(x)); // write clicked in Excel file //
                    } else{write_to_excel_and_read.write_to_excel("FAIL - not clicked",write_to_excel_and_read.list_of_steps.indexOf(x)); } // write fail in Excel file //
                    driver.navigate().refresh(); }// refresh the page //
                if(x.startsWith("always")) {
                    // always clicked //
                    CHECK_BOX_REMEMBER(driver).click(); // first click - need to be clicked //
                    CHECK_BOX_REMEMBER(driver).click(); // second click - need to be un-clicked //
                    if(CHECK_BOX_REMEMBER(driver).isSelected())
                    { // if the button was click and now is un-clicked //
                        write_to_excel_and_read.write_to_excel("FAIL - clicked,need to un-clicked",write_to_excel_and_read.list_of_steps.indexOf(x)); // write clicked in Excel file //
                    } else{write_to_excel_and_read.write_to_excel("not clicked",write_to_excel_and_read.list_of_steps.indexOf(x)); } // write fail in Excel //
                    driver.navigate().refresh(); } // refresh the page //
        }
}
@Test
public static void login() throws InterruptedException, IOException {
    for (String x : list_of_steps_last_login) {
        if (x.startsWith("clicked")) {
            LOGIN_OFFICIAL(driver).click();
            // only one click //
            sleep(2000);
            write_to_excel_and_read.write_to_excel(driver.getCurrentUrl(), write_to_excel_and_read.list_of_steps.indexOf(x));
            driver.navigate().refresh();}
            // refresh the page //
        if (x.startsWith("always")) {
            // always clicked //
            for (int i = 0; i < 100; i++) { // 100 clicks //
                LOGIN_OFFICIAL(driver).click(); }
                write_to_excel_and_read.write_to_excel(driver.getCurrentUrl(), write_to_excel_and_read.list_of_steps.indexOf(x));
                driver.navigate().refresh(); // refresh the page //
             }
    }}
@Test
public static void go_signup() throws InterruptedException, IOException {
    for (String x : list_of_steps_go_signup) {
        if (x.startsWith("clicked")) {
            GO_SIGNUP(driver).click();
            // only one click //
            sleep(2000);
            write_to_excel_and_read.write_to_excel(driver.getCurrentUrl(), write_to_excel_and_read.list_of_steps.indexOf(x));
            driver.navigate().refresh();}
        // refresh the page //
        if (x.startsWith("always")) {
            // always clicked //
            for (int i = 0; i < 100; i++) { // 100 clicks //
                GO_SIGNUP(driver).click(); }
                write_to_excel_and_read.write_to_excel(driver.getCurrentUrl(), write_to_excel_and_read.list_of_steps.indexOf(x));
                driver.navigate().refresh(); // refresh the page //
             }}}
}

