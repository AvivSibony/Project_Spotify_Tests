package Tests;


import org.bouncycastle.asn1.dvcs.DVCSObjectIdentifiers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;

import static java.lang.Thread.sleep;

public class Sign_UP {
    static WebDriver driver;

    public WebElement EMAIL(WebDriver driver) {
        WebElement EMAIL = driver.findElement(By.id("email"));
        return EMAIL;
    }

    public WebElement CONFIRM_EMAIL(WebDriver driver) {
        WebElement CONFIRM_EMAIL = driver.findElement(By.id("confirm"));
        return CONFIRM_EMAIL;
    }

    public WebElement PASSWORD(WebDriver driver) {
        WebElement PASSWORD = driver.findElement(By.id("password"));
        return PASSWORD;
    }

    public WebElement USER(WebDriver driver) {
        WebElement USER = driver.findElement(By.id("displayname"));
        return USER;
    }

    public WebElement DAY(WebDriver driver) {
        WebElement DAY = driver.findElement(By.id("day"));
        return DAY;
    }

    public WebElement MONTH(WebDriver driver) {
        WebElement MONTH = driver.findElement(By.id("month"));
        return MONTH;
    }

    public WebElement YEAR(WebDriver driver) {
        WebElement YEAR = driver.findElement(By.id("year"));
        return YEAR;
    }

    public WebElement RADIO_BOX(WebDriver driver) {
        List<WebElement> RADIO_BOX = driver.findElements(By.xpath("//span[@class='Indicator-sc-hjfusp-0 benotq']"));
        return (WebElement) RADIO_BOX;
    }

    public WebElement CHECK_BOX(WebDriver driver) {
        List<WebElement> CHECK_BOX = driver.findElements(By.xpath("//span[@class='Indicator-sc-1airx73-0 jrJQVH']"));
        return (WebElement) CHECK_BOX;
    }

    public WebElement BTN(WebDriver driver) {
        List<WebElement> BTN = driver.findElements(By.xpath("//a[1]"));
        return (WebElement) BTN;
    }

    public WebElement SIGNUP(WebDriver driver) {
        WebElement SIGNUP = driver.findElement(By.xpath("//span[text()='Sign up']"));
        return SIGNUP;
    } // POM Elements

    @BeforeClass
    public static void BC() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://open.spotify.com/");
    }

    @AfterClass
    public static void AC() {
        driver.close();
    }

    @Test
    public void sign_up_first_btn() throws IOException, InterruptedException {
        SIGNUP(driver).click();
        driver.navigate().refresh();
        sleep(3000);
    }

        @Test
        public void fb_gg_btns()throws IOException, InterruptedException {

        }
        @Test
        public void email ()throws IOException, InterruptedException {

        }
        @Test
        public void pw ()throws IOException, InterruptedException {

        }
        @Test
        public void username ()throws IOException, InterruptedException {

        }
        @Test
        public void age_d_m_y ()throws IOException, InterruptedException {

        }


    }




