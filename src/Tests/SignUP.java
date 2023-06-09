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
import static java.lang.Thread.sleep;
public class SignUP {
     public static WebDriver driver;
     static List<String> list_of_steps_email = new ArrayList<>();
     static List<String> list_of_steps_sign_up_first_btn = new ArrayList<>();
     static List<String> list_of_steps_confirm_email = new ArrayList<>();
     static List<String> list_of_steps_pw = new ArrayList<>();
     static List<String> list_of_steps_username = new ArrayList<>();
     static List<String> list_of_steps_all_btns = new ArrayList<>();
     static List<String> list_of_steps_age_day = new ArrayList<>();
     static List<String> list_of_steps_age_month = new ArrayList<>();
     static List<String> list_of_steps_age_year = new ArrayList<>();
     static List<String> list_of_steps_radio_box = new ArrayList<>();
     static List<String> list_of_steps_check_box = new ArrayList<>();

    public static WebElement EMAIL(WebDriver driver) {
        return driver.findElement(By.id("email"));}
    public static WebElement ALREADY_CONNECTED_EMAIL(WebDriver driver) {
        return driver.findElement(By.xpath("//span[@class='LinkContainer-sc-1t58wcv-0 bSSutB']"));}
    public static WebElement INVALID_EMAIL(WebDriver driver) {
        return driver.findElement(By.xpath("//span[@class='LinkContainer-sc-1t58wcv-0 bSSutB']"));}
    public static WebElement EMPTY_EMAIL_LABEL(WebDriver driver) {
        return driver.findElement(By.xpath("//span[@class='LinkContainer-sc-1t58wcv-0 bSSutB']"));}
    public static WebElement NEED_TO_CONFIRM(WebDriver driver) {
        return driver.findElement(By.xpath("//span[text()='You need to confirm your email.']"));}
    public static WebElement CONFIRM_DO_NOT_MATCH(WebDriver driver) {
        return driver.findElement(By.xpath("/html/body/div[1]/main/div/div/form/div[2]/div[2]/span"));}
    public static WebElement CONFIRM_EMAIL(WebDriver driver) {return driver.findElement(By.id("confirm"));}
    public static WebElement PASSWORD(WebDriver driver) {return driver.findElement(By.id("password"));}
    public static WebElement WEAK_PASSWORD(WebDriver driver) {return driver.findElement(By.xpath("//span[text()='Your password is too weak. Set a stronger one.']"));}
    public static WebElement SHORT_PASSWORD(WebDriver driver) {return driver.findElement(By.xpath("//span[text()='Your password is too short.']"));}
    public static WebElement EMPTY_PASSWORD(WebDriver driver) {return driver.findElement(By.xpath("//span[text()='You need to enter a password.']"));}
    public static WebElement USER(WebDriver driver) {return driver.findElement(By.id("displayname"));}
    public static WebElement EMPTY_USER(WebDriver driver) {return driver.findElement(By.xpath("//span[text()='Enter a name for your profile.']"));}
    public static WebElement DAY(WebDriver driver) {return driver.findElement(By.id("day"));}
    public static WebElement INVALID_DAY(WebDriver driver) {return driver.findElement(By.xpath("da//span[text()='Enter a valid day of the month.']"));}
    public static WebElement MONTH(WebDriver driver,int i) {
        List<WebElement> MONTH = driver.findElements(By.xpath("//select/option"));
        return MONTH.get(i);}
    public static WebElement YEAR(WebDriver driver) {return  driver.findElement(By.id("year"));}
    public static WebElement INVALID_YEAR(WebDriver driver) {return  driver.findElement(By.xpath("//span[text()='Enter a valid year.']"));}
    public static WebElement RADIO_BOX(WebDriver driver,int i) {
        List<WebElement> RADIO_BOX = driver.findElements(By.xpath("//span[@class='Indicator-sc-hjfusp-0 benotq']"));
        return (WebElement) RADIO_BOX.get(i);
    }
    public static WebElement CHECK_BOX(WebDriver driver,int i) {
        List<WebElement> CHECK_BOX = driver.findElements(By.xpath("//span[@class='Indicator-sc-1airx73-0 jrJQVH']"));
        return (WebElement) CHECK_BOX.get(i);
    }
    public static WebElement BTN(WebDriver driver,int i) {
        List<WebElement> BTN = driver.findElements(By.xpath("//a[1]"));
        return (WebElement) BTN.get(i);
    }
    public static WebElement SIGNUP(WebDriver driver) { return driver.findElement(By.xpath("//span[text()='Sign up']"));}
    // POM Elements //
    public static void signUP_tests() {
        for (int j = 0; j < write_to_excel_and_read.list_of_steps.size(); j++) {
            switch (write_to_excel_and_read.list_of_steps.get(j)) {
                case "sign_up_first_btn" -> write_to_excel_and_read.locations_of_steps.add(j); // 1 //
                case "all_btns" -> write_to_excel_and_read.locations_of_steps.add(j); // 3 //
                case "email" -> write_to_excel_and_read.locations_of_steps.add(j); // 11 //
                case "confirm email" -> write_to_excel_and_read.locations_of_steps.add(j); // 48 //
                case "pw" -> write_to_excel_and_read.locations_of_steps.add(j); // 85 //
                case "username" -> write_to_excel_and_read.locations_of_steps.add(j); // 110 //
                case "day" -> write_to_excel_and_read.locations_of_steps.add(j); // 137 //
                case "month" -> write_to_excel_and_read.locations_of_steps.add(j); // 147 //
                case "year" -> write_to_excel_and_read.locations_of_steps.add(j); // 160 //
                case "radio box" -> write_to_excel_and_read.locations_of_steps.add(j); // 169 //
                case "check box" -> write_to_excel_and_read.locations_of_steps.add(j); // 180 //
            }

        }
        for (int i = 0; i < write_to_excel_and_read.list_of_steps.size(); i++) {
            if (i > write_to_excel_and_read.locations_of_steps.get(0) && i < write_to_excel_and_read.locations_of_steps.get(1)) {// tests of sign_up_first_btn //
                list_of_steps_sign_up_first_btn.add(write_to_excel_and_read.list_of_steps.get(i));
            }
            if (i > write_to_excel_and_read.locations_of_steps.get(1) && i < write_to_excel_and_read.locations_of_steps.get(2)) {// tests of all_btns //
                list_of_steps_all_btns.add(write_to_excel_and_read.list_of_steps.get(i));
            }
            if (i > write_to_excel_and_read.locations_of_steps.get(2) && i < write_to_excel_and_read.locations_of_steps.get(3)) {// tests of confirm_email //
                list_of_steps_confirm_email.add(write_to_excel_and_read.list_of_steps.get(i));
            }
            if (i > write_to_excel_and_read.locations_of_steps.get(3) && i < write_to_excel_and_read.locations_of_steps.get(4)) {  // tests of pw //
                list_of_steps_pw.add(write_to_excel_and_read.list_of_steps.get(i));
            }
            if (i > write_to_excel_and_read.locations_of_steps.get(4) && i < write_to_excel_and_read.locations_of_steps.get(5)) {// tests of username //
                list_of_steps_username.add(write_to_excel_and_read.list_of_steps.get(i));
            }
            if (i > write_to_excel_and_read.locations_of_steps.get(5) && i < write_to_excel_and_read.locations_of_steps.get(6)) {// tests of all_btns //
                list_of_steps_all_btns.add(write_to_excel_and_read.list_of_steps.get(i));
            }
            if (i > write_to_excel_and_read.locations_of_steps.get(6) && i < write_to_excel_and_read.locations_of_steps.get(7)) {// tests of age_d_m_y - day //
                list_of_steps_age_day.add(write_to_excel_and_read.list_of_steps.get(i));
            }
            if (i > write_to_excel_and_read.locations_of_steps.get(7) && i < write_to_excel_and_read.locations_of_steps.get(8)) {// tests of age_d_m_y - month //
                list_of_steps_age_month.add(write_to_excel_and_read.list_of_steps.get(i));
            }
            if (i > write_to_excel_and_read.locations_of_steps.get(8) && i < write_to_excel_and_read.locations_of_steps.get(9)) { // tests of age_d_m_y - year //
                list_of_steps_age_year.add(write_to_excel_and_read.list_of_steps.get(i));
            }
            if (i > write_to_excel_and_read.locations_of_steps.get(9) && i < write_to_excel_and_read.locations_of_steps.get(10)) { // tests of radio_box --> all btns //
                list_of_steps_radio_box.add(write_to_excel_and_read.list_of_steps.get(i));
            }
            if (i > write_to_excel_and_read.locations_of_steps.get(10)) { // tests of check_box --> all_btns //
                list_of_steps_check_box.add(write_to_excel_and_read.list_of_steps.get(i));
            }
        }
        BeforeClass_SIGNUP(); // start the tests //
    }

        @BeforeClass
        public static void BeforeClass_SIGNUP () {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://open.spotify.com/");

        }
        @AfterClass
        public static void AfterClass_SIGNUP () {
            LogIN.BeforeClass_LOGIN();
        }
/////////////////////////////////  TESTS - SIGN-UP  ///////////////////////////////////////
        @Test()
        public static void sign_up_first_btn () throws IOException, InterruptedException {
            for (String x : list_of_steps_sign_up_first_btn) {
                SIGNUP(driver).click(); // click on sign-up button //
                sleep(2000); // delay 2 seconds //
                driver.navigate().back(); // go back to the first page //
                write_to_excel_and_read.write_to_excel(driver.getCurrentUrl(), write_to_excel_and_read.list_of_steps.indexOf(x)); // write the data to the Excel file //
            }
            all_btns();
        }
        @Test()
        public static void all_btns ()throws IOException, InterruptedException {
            for (String x : list_of_steps_all_btns) {
                //// buttons from list all_btn ////
                BTN(driver, list_of_steps_all_btns.indexOf(x)).click(); // button from the index we send //
                sleep(2000);
                driver.navigate().back(); // go back to sign-up page //
                write_to_excel_and_read.write_to_excel(driver.getCurrentUrl(), write_to_excel_and_read.list_of_steps.indexOf(x)); // write the data to the Excel file //
            }
            //// buttons from list radio box ////
            for (String x : list_of_steps_radio_box) {
                if (x.startsWith("clicked")) {
                    // only one click //
                    RADIO_BOX(driver, list_of_steps_radio_box.indexOf(x)).click();
                    sleep(2000);
                    if (RADIO_BOX(driver, list_of_steps_radio_box.indexOf(x)).isSelected()) {
                        // if the button was click //
                        write_to_excel_and_read.write_to_excel("clicked", write_to_excel_and_read.list_of_steps.indexOf(x)); // write clicked in Excel file //
                    } else {
                        write_to_excel_and_read.write_to_excel("FAIL - not clicked", write_to_excel_and_read.list_of_steps.indexOf(x));
                    } // write fail in Excel file //
                    driver.navigate().refresh();
                }// refresh the page //
                if (x.startsWith("always")) {
                    // always clicked //
                    RADIO_BOX(driver, list_of_steps_radio_box.indexOf(x)).click(); // first click - need to be clicked //
                    RADIO_BOX(driver, list_of_steps_radio_box.indexOf(x)).click(); // second click - need to be un-clicked //
                    if (RADIO_BOX(driver, list_of_steps_radio_box.indexOf(x)).isSelected()) { // if the button was click and now is un-clicked //
                        write_to_excel_and_read.write_to_excel("FAIL - clicked,need to un-clicked", write_to_excel_and_read.list_of_steps.indexOf(x)); // write clicked in Excel file //
                    } else {
                        write_to_excel_and_read.write_to_excel("not clicked", write_to_excel_and_read.list_of_steps.indexOf(x));
                    } // write fail in Excel //
                    driver.navigate().refresh();
                } // refresh the page //
            }
            //// buttons from list check box ////
            for (String x : list_of_steps_check_box) {
                if (x.startsWith("clicked")) {
                    // only one click //
                    CHECK_BOX(driver, list_of_steps_check_box.indexOf(x)).click();
                    sleep(2000);
                    if (CHECK_BOX(driver, list_of_steps_check_box.indexOf(x)).isSelected()) {
                        // if the button was click //
                        write_to_excel_and_read.write_to_excel("clicked", write_to_excel_and_read.list_of_steps.indexOf(x)); // write clicked in Excel file //
                    } else {
                        write_to_excel_and_read.write_to_excel("FAIL - not clicked", write_to_excel_and_read.list_of_steps.indexOf(x));
                    } // write fail in Excel file //
                    driver.navigate().refresh();
                }// refresh the page //
                if (x.startsWith("always")) {
                    // always clicked //
                    CHECK_BOX(driver, list_of_steps_check_box.indexOf(x)).click(); // first click - need to be clicked //
                    CHECK_BOX(driver, list_of_steps_check_box.indexOf(x)).click(); // second click - need to be un-clicked //
                    if (CHECK_BOX(driver, list_of_steps_check_box.indexOf(x)).isSelected()) { // if the button was click and now is un-clicked //
                        write_to_excel_and_read.write_to_excel("FAIL - clicked,need to un-clicked", write_to_excel_and_read.list_of_steps.indexOf(x)); // write clicked in Excel file //
                    } else {
                        write_to_excel_and_read.write_to_excel("not clicked", write_to_excel_and_read.list_of_steps.indexOf(x));
                    } // write fail in Excel //
                    driver.navigate().refresh();
                } // refresh the page //
            }
            email();
        }
        @Test()
        public static void email ()throws IOException {
            for (String x : list_of_steps_email) {
                EMAIL(driver).clear();
                EMAIL(driver).sendKeys(x);
                if (ALREADY_CONNECTED_EMAIL(driver).getText().equals("This email is already connected to an account. Log in.")) { // if we have a comment of duplicate email in the system //
                    write_to_excel_and_read.write_to_excel(ALREADY_CONNECTED_EMAIL(driver).getText(), write_to_excel_and_read.list_of_steps.indexOf(x));
                } else if (INVALID_EMAIL(driver).getText().equals("This email is invalid. Make sure it's written like example@email.com")) { // if we have a comment of invalid email //
                    write_to_excel_and_read.write_to_excel(INVALID_EMAIL(driver).getText(), write_to_excel_and_read.list_of_steps.indexOf(x));
                } else if (EMPTY_EMAIL_LABEL(driver).getText().equals("You need to enter your email.")) { // if we have a comment of empty email label //
                    write_to_excel_and_read.write_to_excel(EMPTY_EMAIL_LABEL(driver).getText(), write_to_excel_and_read.list_of_steps.indexOf(x));
                } else { // if we have not got a comment --> writing correct email //
                    write_to_excel_and_read.write_to_excel(x, write_to_excel_and_read.list_of_steps.indexOf(x));
                }
                EMAIL(driver).clear(); // clear the email label //
            }
            confirm_email();
        }
        @Test()
        public static void confirm_email ()throws IOException {
            for (String x : list_of_steps_confirm_email) {
                String compere_email = "avivsibony@gmail.com";
                EMAIL(driver).sendKeys(compere_email);
                CONFIRM_EMAIL(driver).sendKeys(x);
                if (compere_email.equals(x)) {
                    // if confirm_email == email //
                    write_to_excel_and_read.write_to_excel("Equal to - " + x, write_to_excel_and_read.list_of_steps.indexOf(x));
                } else if (x.isEmpty() && NEED_TO_CONFIRM(driver).equals("You need to confirm your email.")) {
                    // if you confirm_email is empty //
                    write_to_excel_and_read.write_to_excel(NEED_TO_CONFIRM(driver).getText(), write_to_excel_and_read.list_of_steps.indexOf(x));
                } else { // if confirm_email != email //
                    write_to_excel_and_read.write_to_excel(CONFIRM_DO_NOT_MATCH(driver).getText(), write_to_excel_and_read.list_of_steps.indexOf(x));
                }
                CONFIRM_EMAIL(driver).clear(); // clear the confirmation label //
            }
            pw();
        }
        @Test()
        public static void pw ()throws IOException {
            for (String x : list_of_steps_pw) {
                PASSWORD(driver).clear();
                PASSWORD(driver).sendKeys(x);
                if (EMPTY_PASSWORD(driver).isDisplayed()) {
                    // if the label is empty //
                    write_to_excel_and_read.write_to_excel(EMPTY_PASSWORD(driver).getText(), write_to_excel_and_read.list_of_steps.indexOf(x));
                } else if (SHORT_PASSWORD(driver).isDisplayed()) {
                    // if the password is too short //
                    write_to_excel_and_read.write_to_excel(SHORT_PASSWORD(driver).getText(), write_to_excel_and_read.list_of_steps.indexOf(x));
                } else if (WEAK_PASSWORD(driver).isDisplayed()) {
                    // if the password is too weak //
                    write_to_excel_and_read.write_to_excel(WEAK_PASSWORD(driver).getText(), write_to_excel_and_read.list_of_steps.indexOf(x));
                } else {
                    // if the password is good //
                    write_to_excel_and_read.write_to_excel("good password - " + x, write_to_excel_and_read.list_of_steps.indexOf(x));
                }
            }
            username();
        }
        @Test()
        public static void username ()throws IOException {
            for (String x : list_of_steps_username) {
                USER(driver).sendKeys(x);
                if (USER(driver).getText().isEmpty()) {
                    // if the username label is empty //
                    write_to_excel_and_read.write_to_excel(EMPTY_USER(driver).getText(), write_to_excel_and_read.list_of_steps.indexOf(x));
                } else {
                    write_to_excel_and_read.write_to_excel("good username - " + x, write_to_excel_and_read.list_of_steps.indexOf(x));
                }
            }
            age_d_m_y();
        }
        @Test()
        public static void age_d_m_y ()throws IOException {
            for (String x : list_of_steps_age_day) {
                //// tests for day label ////
                DAY(driver).clear();
                DAY(driver).sendKeys(x);
                if (INVALID_DAY(driver).isDisplayed()) {
                    // if we write letters/signs/x>32 //
                    write_to_excel_and_read.write_to_excel(INVALID_DAY(driver).getText(), write_to_excel_and_read.list_of_steps.indexOf(x));
                } else {
                    write_to_excel_and_read.write_to_excel("good day - " + x, write_to_excel_and_read.list_of_steps.indexOf(x));
                }
            }
            YEAR(driver).sendKeys("2023"); // write a correct year for month test //
            for (int x = 1; x <= 13; x++) { //// !!!! need to change in the file the names of the months instead the steps i wrote !!!! ////
                //// tests for month label -- check pass/fail of two states in a month ////
                MONTH(driver, x).click();
                if ((MONTH(driver, x).getText().equals("January")) || (MONTH(driver, x).getText().equals("March"))
                        || (MONTH(driver, x).getText().equals("May")) || (MONTH(driver, x).getText().equals("July"))
                        || (MONTH(driver, x).getText().equals("August")) || (MONTH(driver, x).getText().equals("October"))
                        || (MONTH(driver, x).getText().equals("December"))) {
                    //// month == january/March/May/July/August/October/December [7 months] ////
                    DAY(driver).sendKeys("32");
                    if (INVALID_DAY(driver).isDisplayed()) {
                        write_to_excel_and_read.write_to_excel("the day is " + INVALID_DAY(driver).getText() + " in month -" + MONTH(driver, x), write_to_excel_and_read.list_of_steps.indexOf(x));
                    } else {
                        write_to_excel_and_read.write_to_excel("the day is " + DAY(driver).getText() + " in month -" + MONTH(driver, x), write_to_excel_and_read.list_of_steps.indexOf(x));
                    }
                    DAY(driver).clear();
                    DAY(driver).sendKeys("31");
                    if (INVALID_DAY(driver).isDisplayed()) {
                        write_to_excel_and_read.write_to_excel("the day is " + INVALID_DAY(driver).getText() + " in month -" + MONTH(driver, x), write_to_excel_and_read.list_of_steps.indexOf(x));
                    } else {
                        write_to_excel_and_read.write_to_excel("the day is " + DAY(driver).getText() + " in month -" + MONTH(driver, x), write_to_excel_and_read.list_of_steps.indexOf(x));
                    }
                }

                if (MONTH(driver, x).getText().equals("April") || (MONTH(driver, x).getText().equals("June"))
                        || (MONTH(driver, x).getText().equals("September")) || (MONTH(driver, x).getText().equals("November"))) {
                    //// months == April/September/June/November [4 months] ////
                    DAY(driver).sendKeys("30");
                    if (INVALID_DAY(driver).isDisplayed()) {
                        write_to_excel_and_read.write_to_excel("the day is " + INVALID_DAY(driver).getText() + " in month -" + MONTH(driver, x), write_to_excel_and_read.list_of_steps.indexOf(x));
                    } else {
                        write_to_excel_and_read.write_to_excel("the day is " + DAY(driver).getText() + " in month -" + MONTH(driver, x), write_to_excel_and_read.list_of_steps.indexOf(x));
                    }
                    DAY(driver).clear();
                    DAY(driver).sendKeys("31");
                    if (INVALID_DAY(driver).isDisplayed()) {
                        write_to_excel_and_read.write_to_excel("the day is " + INVALID_DAY(driver).getText() + " in month -" + MONTH(driver, x), write_to_excel_and_read.list_of_steps.indexOf(x));
                    } else {
                        write_to_excel_and_read.write_to_excel("the day is " + DAY(driver).getText() + " in month -" + MONTH(driver, x), write_to_excel_and_read.list_of_steps.indexOf(x));
                    }
                }
                if (MONTH(driver, x).getText().equals("February")) {
                    //// month == February ////
                    DAY(driver).sendKeys("29");
                    if (INVALID_DAY(driver).isDisplayed()) {
                        write_to_excel_and_read.write_to_excel("the day is " + INVALID_DAY(driver).getText() + " in month -" + MONTH(driver, x), write_to_excel_and_read.list_of_steps.indexOf(x));
                    } else {
                        write_to_excel_and_read.write_to_excel("the day is " + DAY(driver).getText() + " in month -" + MONTH(driver, x), write_to_excel_and_read.list_of_steps.indexOf(x));
                    }
                    DAY(driver).clear();
                    DAY(driver).sendKeys("28");
                    if (INVALID_DAY(driver).isDisplayed()) {
                        write_to_excel_and_read.write_to_excel("the day is " + INVALID_DAY(driver).getText() + " in month -" + MONTH(driver, x), write_to_excel_and_read.list_of_steps.indexOf(x));
                    } else {
                        write_to_excel_and_read.write_to_excel("the day is " + DAY(driver).getText() + " in month -" + MONTH(driver, x), write_to_excel_and_read.list_of_steps.indexOf(x));
                    }
                }
            }
            driver.navigate().refresh(); // clear all labels //
            for (String x : list_of_steps_age_year) {
                //// tests for year label ////
                YEAR(driver).clear();
                YEAR(driver).sendKeys(x);
                if (INVALID_YEAR(driver).isDisplayed()) {
                    // if I write wrong year //
                    write_to_excel_and_read.write_to_excel(INVALID_YEAR(driver).getText(), write_to_excel_and_read.list_of_steps.indexOf(x));
                } else {
                    write_to_excel_and_read.write_to_excel("good year - " + x, write_to_excel_and_read.list_of_steps.indexOf(x));
                }
            }
        }

    }