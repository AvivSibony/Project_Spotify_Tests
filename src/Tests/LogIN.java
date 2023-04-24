package Tests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LogIN {
public static List<String> list_of_steps_first_login = new ArrayList<>();
public static List<String> list_of_steps_username_login = new ArrayList<>();
public static List<String> list_of_steps_password = new ArrayList<>();
public static List<String> list_of_steps_social = new ArrayList<>();
public static List<String> list_of_steps_forgot_pw = new ArrayList<>();
public static List<String> list_of_steps_checkbox = new ArrayList<>();
public static List<String> list_of_steps_last_login = new ArrayList<>();
public static List<String> list_of_steps_go_signup = new ArrayList<>();

public static WebElement LOGIN_BTN(WebDriver driver) {
    return SignUP.driver.findElement(By.xpath("//span[text()='Log in']"));}
public static WebElement SOCIAL_BTNS(WebDriver driver, int i) {
    List<WebElement> SOCIAL_BTNS = SignUP.driver.findElements(By.className("sc-iJnaPW ygyMW"));
    return SOCIAL_BTNS.get(i); }
public static WebElement USER_LOGIN(WebDriver driver) {
    return SignUP.driver.findElement(By.id("login-username")); }
public static WebElement PW_LOGIN(WebDriver driver) {
    return SignUP.driver.findElement(By.id("login-password")); }
public static WebElement CHECK_BOX_REMEMBER(WebDriver driver) {
    return SignUP.driver.findElement(By.className("Indicator-sc-1airx73-0 bpcByA")); }
public static WebElement FORGOT_PW_LINK(WebDriver driver) {
    return SignUP.driver.findElement(By.xpath("//a[text()='Forgot your password?']")); }
public static WebElement LOGIN_OFFICIAL(WebDriver driver) {
    return SignUP.driver.findElement(By.xpath("//span[text()='Log In']")); }
public static WebElement GO_SIGNUP(WebDriver driver) {
        return SignUP.driver.findElement(By.xpath("//span[text()='Sign up for Spotify']")); }

    public static void LogIN_tests()throws IOException, InterruptedException{
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
        }}
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
            if (i > write_to_excel_and_read.locations_of_steps2.get(7) ) {// tests of go signup //
                list_of_steps_go_signup.add(write_to_excel_and_read.list_of_steps.get(i));
            }
    }log_in_first_btn();}


@Test
public static void log_in_first_btn(){}
@Test
public static void social_buttons(){}
@Test
public static void username(){}
@Test
public static void password(){}
@Test
public static void forgot_password(){}
@Test
public static void check_box(){}
@Test
public static void login(){}
@Test
public static void go_signup(){}

}

