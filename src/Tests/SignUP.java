package Tests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.io.IOException;
import java.util.List;
import static Tests.write_to_excel_and_read.*;
import static java.lang.Thread.sleep;
public class SignUP {
    static WebDriver driver;
    static String result;
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
    public static WebElement DAY(WebDriver driver) {return driver.findElement(By.id("day"));}
    public static WebElement MONTH(WebDriver driver) {
        return driver.findElement(By.id("month"));}
    public static WebElement YEAR(WebDriver driver) {
        return  driver.findElement(By.id("year"));}
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
    public static void signUP_tests() throws IOException, InterruptedException {
        for (int j = 0; j < list_of_steps.size(); j++) {
            switch (list_of_steps.get(j)) {
                case "sign_up_first_btn": locations_of_steps.add(j);
                    break;
                case "email": locations_of_steps.add(j);
                    break;
                case "confirm_email": locations_of_steps.add(j);
                    break;
                case "pw": locations_of_steps.add(j);
                    break;
                case "username": locations_of_steps.add(j);
                    break;
                case "all_btns": locations_of_steps.add(j);
                    break;
                case "day": locations_of_steps.add(j);
                    break;
                case "month": locations_of_steps.add(j);
                    break;
                case "year": locations_of_steps.add(j);
                    break;
                case "radio box": locations_of_steps.add(j);
                    break;
                case "check box": locations_of_steps.add(j);
                    break;
            }
        }
        for (int i = 0; i < list_of_steps.size(); i++) {
            if (i > locations_of_steps.get(0) && i < locations_of_steps.get(1)) {// tests of sign_up_first_btn //
                list_of_steps_sign_up_first_btn.add(list_of_steps.get(i));
            }
            if (i > locations_of_steps.get(1) && i < locations_of_steps.get(2)) {// tests of all_btns //
                list_of_steps_all_btns.add(list_of_steps.get(i));
            }
            if (i > locations_of_steps.get(2) && i < locations_of_steps.get(3)) {// tests of confirm_email //
                list_of_steps_confirm_email.add(list_of_steps.get(i));
            }
            if (i > locations_of_steps.get(3) && i < locations_of_steps.get(4)) {  // tests of pw //
                list_of_steps_pw.add(list_of_steps.get(i));
            }
            if (i > locations_of_steps.get(4) && i < locations_of_steps.get(5)) {// tests of username //
                list_of_steps_username.add(list_of_steps.get(i));
            }
            if (i > locations_of_steps.get(5) && i < locations_of_steps.get(6)) {// tests of all_btns //
                list_of_steps_all_btns.add(list_of_steps.get(i));
            }
            if (i > locations_of_steps.get(6) && i < locations_of_steps.get(7)) {// tests of age_d_m_y - day //
                list_of_steps_age_day.add(list_of_steps.get(i));
            }
            if (i > locations_of_steps.get(7) && i < locations_of_steps.get(8)) {// tests of age_d_m_y - month //
                list_of_steps_age_month.add(list_of_steps.get(i));
            }
            if (i > locations_of_steps.get(8) && i < locations_of_steps.get(9)) { // tests of age_d_m_y - year //
                list_of_steps_age_year.add(list_of_steps.get(i));
            }
            if (i > locations_of_steps.get(9) && i < locations_of_steps.get(10)){ // tests of radio_box --> all btns //
                list_of_steps_radio_box.add(list_of_steps.get(i));
            }
            if (i > locations_of_steps.get(10)){ // tests of check_box --> all_btns //
                list_of_steps_check_box.add(list_of_steps.get(i));
            } }
        sign_up_first_btn();
    }

    @BeforeClass
    public static void BeforeClass() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://open.spotify.com/");
        }
    @AfterClass
    public static void AfterClass() { driver.close();}

    @Test()
    public static void sign_up_first_btn() throws IOException, InterruptedException {
        for (String x : list_of_steps_sign_up_first_btn){
            SIGNUP(driver).click(); // click on sign-up button //
            sleep(2000); // delay 2 seconds //
            result = driver.getCurrentUrl(); // get the URL of the page - from the URL I need to see sign-up//
            driver.navigate().back(); // go back to the first page //
            write_to_excel_and_read.write_to_excel(result,list_of_steps.indexOf(x)); // write the data to the Excel file //
        } all_btns(); }
        @Test()
        public static void all_btns()throws IOException, InterruptedException {
        for(String x : list_of_steps_all_btns) {
            //// buttons from list all_btn ////
            BTN(driver, list_of_steps_all_btns.indexOf(x)).click(); // button from the index we send //
            result = driver.getCurrentUrl(); // get the URL of the page //
            sleep(2000);
            driver.navigate().back(); // go back to sign-up page //
            write_to_excel_and_read.write_to_excel(result,list_of_steps.indexOf(x)); // write the data to the Excel file //
        }
            //// buttons from list radio box ////
        for(String x: list_of_steps_radio_box){
            if(x.startsWith("clicked")) { // only one click //
                RADIO_BOX(driver, list_of_steps_radio_box.indexOf(x)).click();
                sleep(2000);
                if(RADIO_BOX(driver, list_of_steps_radio_box.indexOf(x)).isSelected()) {
                    // if the button was click //
                    write_to_excel_and_read.write_to_excel("clicked",list_of_steps.indexOf(x)); // write clicked in Excel file //
                } else{write_to_excel_and_read.write_to_excel("FAIL - not clicked",list_of_steps.indexOf(x)); } // write fail in Excel file //
            driver.navigate().refresh(); }// refresh the page //

            if(x.startsWith("always")) { // always clicked //
                { // loop of many times we clicked on the radio box //
                    RADIO_BOX(driver, list_of_steps_radio_box.indexOf(x)).click(); // first click - need to be clicked //
                    RADIO_BOX(driver, list_of_steps_radio_box.indexOf(x)).click(); // second click - need to be un-clicked //
                }
                if(RADIO_BOX(driver, list_of_steps_radio_box.indexOf(x)).isSelected())
                { // if the button was click and now is un-clicked //
                    write_to_excel_and_read.write_to_excel("FAIL - clicked,need to un-clicked",list_of_steps.indexOf(x)); // write clicked in Excel file //
                } else{write_to_excel_and_read.write_to_excel("not clicked",list_of_steps.indexOf(x)); } // write fail in Excel //
                driver.navigate().refresh(); } // refresh the page //
             } email();}
        @Test()
        public static void email ()throws IOException, InterruptedException {
        for(String x : list_of_steps_email){
            EMAIL(driver).clear();
            EMAIL(driver).sendKeys(x);
            if(ALREADY_CONNECTED_EMAIL(driver).getText().equals("This email is already connected to an account. Log in."))
            { // if we have a comment of duplicate email in the system //
                write_to_excel_and_read.write_to_excel(ALREADY_CONNECTED_EMAIL(driver).getText(),list_of_steps.indexOf(x));
            }
            else if(INVALID_EMAIL(driver).getText().equals("This email is invalid. Make sure it's written like example@email.com"))
            { // if we have a comment of invalid email //
                write_to_excel_and_read.write_to_excel(INVALID_EMAIL(driver).getText(),list_of_steps.indexOf(x));
            }
            else if(EMPTY_EMAIL_LABEL(driver).getText().equals("You need to enter your email."))
            { // if we have a comment of empty email label //
                write_to_excel_and_read.write_to_excel(EMPTY_EMAIL_LABEL(driver).getText(),list_of_steps.indexOf(x));
            }
            else
            { // if we have not got a comment --> writing correct email //
                write_to_excel_and_read.write_to_excel(x,list_of_steps.indexOf(x));
            }
            EMAIL(driver).clear(); // clear the email label //
        }


    }
    @Test()
        public static void confirm_email ()throws IOException, InterruptedException {
        for(String x:list_of_steps_confirm_email){
            String compere_email = "avivsibony@gmail.com";
            EMAIL(driver).sendKeys(compere_email);
            CONFIRM_EMAIL(driver).sendKeys(x);
            if(compere_email.equals(x)){
                // if confirm_email == email //
                write_to_excel_and_read.write_to_excel("Equal to - "+x,list_of_steps.indexOf(x));
            }
            else if(x.isEmpty() && NEED_TO_CONFIRM(driver).equals("You need to confirm your email.")){
                // if you confirm_email is empty //
                write_to_excel_and_read.write_to_excel(NEED_TO_CONFIRM(driver).getText(),list_of_steps.indexOf(x));
            }
            else{ // if confirm_email != email //
                write_to_excel_and_read.write_to_excel(CONFIRM_DO_NOT_MATCH(driver).getText(),list_of_steps.indexOf(x)); }
            CONFIRM_EMAIL(driver).clear(); // clear the confirmation label //
        }

    }
        @Test()
        public static void pw ()throws IOException, InterruptedException {
        for(String x:list_of_steps_pw){
            PASSWORD(driver).clear();
            PASSWORD(driver).sendKeys(x);
            if(EMPTY_PASSWORD(driver).isDisplayed()){
                // if the label is empty //
                write_to_excel_and_read.write_to_excel(EMPTY_PASSWORD(driver).getText(),list_of_steps.indexOf(x));
            }
            else if(SHORT_PASSWORD(driver).isDisplayed()){
                // if the password is too short //
                write_to_excel_and_read.write_to_excel(SHORT_PASSWORD(driver).getText(),list_of_steps.indexOf(x));
            }else if(WEAK_PASSWORD(driver).isDisplayed()){
                // if the password is too weak //
                write_to_excel_and_read.write_to_excel(WEAK_PASSWORD(driver).getText(),list_of_steps.indexOf(x));
            }else{
                // if the password is good //
                write_to_excel_and_read.write_to_excel("good password "+x,list_of_steps.indexOf(x));
            }
        } username();}
        @Test()
        public static void username ()throws IOException, InterruptedException {

        }
        @Test()
        public static void age_d_m_y ()throws IOException, InterruptedException {


        }


    }




