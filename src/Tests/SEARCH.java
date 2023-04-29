package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static Tests.SignUP.driver;
import static java.lang.Thread.sleep;

public class SEARCH {
    public static List<String> list_of_steps_search = new ArrayList<>();
    public static WebElement SEARCH_FIRST_BTN(WebDriver driver) {
        return SignUP.driver.findElement(By.xpath("//span[text()='Search']"));
    } // search button //
    public static List<String> list_of_steps_playlists_podcast = new ArrayList<>();
    public static WebElement BROWSE_ALL(WebDriver driver ,int i) {
        List<WebElement> BROWSE_ALL =SignUP.driver.findElements(By.xpath("//span[@class='Type__TypeElement-sc-goli3j-0 hulXhb i2yp6pOoZpYZLd5QWguN']"));
        return BROWSE_ALL.get(i);} // the first page when we clicked on search //
    public static WebElement PLAYLIST_NAME_H1(WebDriver driver , int i) {
        List<WebElement> PLAYLIST_NAME_H1 = SignUP.driver.findElements(By.xpath("//h1[@class='Type__TypeElement-sc-goli3j-0 bZdlXz']"));
        return PLAYLIST_NAME_H1.get(i);} // the name in the main page of the playlist //
    public static WebElement PODCAST_GENRES(WebDriver driver, int i) {
        List<WebElement> PODCAST_GENRES = SignUP.driver.findElements(By.xpath("//span[@class='Type__TypeElement-sc-goli3j-0 hulXhb i2yp6pOoZpYZLd5QWguN']"));
        return PODCAST_GENRES.get(i);} // genres in the podcast page  //
    public static WebElement PODCAST_SEE_ALL_CATEGORIES(WebDriver driver) {
        return SignUP.driver.findElement(By.xpath("//span[text()='See all categories']"));
    } // see all categories in the podcast page  //
    public static WebElement FOLLOW(WebDriver driver) {
        return SignUP.driver.findElement(By.xpath("//button[text()='Follow']"));
    } // follow in podcast/artist  //
    public static WebElement SETTINGS_3_DOTS(WebDriver driver) {
        return SignUP.driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div[3]/div[1]/div[2]/div[2]/div/div/div[2]/main/section/div[3]/div[4]/div/div/div/div/button[2]"));
    } // settings  //
    public static WebElement ABOUT_MORE_PODCASTS(WebDriver driver,int i) {
       List<WebElement> ABOUT_MORE_PODCASTS =SignUP.driver.findElements(By.xpath("//span[@class='ChipInner__ChipInnerComponent-sc-1ly6j4j-0 bhATCW']"));
    return ABOUT_MORE_PODCASTS.get(i);}// about more genres in any podcast //
    public static WebElement SETTINGS_MENU_3_OPTIONS(WebDriver driver,int i) {
       List<WebElement> SETTINS_MENU_3_OPTIONS =SignUP.driver.findElements(By.xpath("//li[@class='DuEPSADpSwCcO880xjUG']"));
    return SETTINS_MENU_3_OPTIONS.get(i);}// about more genres in any podcast //
    public static WebElement NAME_OF_MORE_PODCASTS_NAMES(WebDriver driver,int i) {
       List<WebElement> NAME_OF_MORE_PODCASTS_NAMES =SignUP.driver.findElements(By.xpath("//div[@class='Type__TypeElement-sc-goli3j-0 bDwzoz nk6UgB4GUYNoAcPtAQaG']"));
       return NAME_OF_MORE_PODCASTS_NAMES.get(i);}// names about any podcast in any genres //
    public static WebElement COMPARE_ABOUT_MORE_PODCASTS_NAMES(WebDriver driver) {
        return SignUP.driver.findElement(By.xpath("//span[@data-testid='show-title']"));
     }// compare names in each podcast //

    @BeforeClass
    public static void BeforeClass_SEARCH() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://open.spotify.com/");}
    @AfterClass
    public static void AfterClass_SEARCH() {
        driver.close();
    } // -> need to move to another tests in the web //

/////////////////////////////////  TESTS - SEARCH  ///////////////////////////////////////
@Test
public static void search_first_btn(){
        for(String x: list_of_steps_search){
        SEARCH_FIRST_BTN(driver).click();
        if(driver.getCurrentUrl().endsWith("search")){
            System.out.println("correct"); }// -> return data to excel file //
        else{
            System.out.println("Failed"); }// -> return data to excel file //
}
    }
static String compare_names;
    @Test
    public static void browse_all_podcasts() throws InterruptedException {
        for(String x : list_of_steps_playlists_podcast) {
            compare_names = BROWSE_ALL(driver, list_of_steps_playlists_podcast.indexOf(x)).getText(); // get text to string to comparing //
            BROWSE_ALL(driver, list_of_steps_playlists_podcast.indexOf(x)).click();// clicked on podcasts //
            sleep(2000); // delay 2 sec //
            if (compare_names.equals(PLAYLIST_NAME_H1(driver, list_of_steps_playlists_podcast.indexOf(x)))) {
                // comparing if we get to the correct playlist //
                System.out.println("equals"); // -> need to add the result to Excel file //
            } else {
                System.out.println("Failed"); // -> need to add the result to Excel file //
            }
            sleep(3000);// delay 3 sec //
            PODCAST_SEE_ALL_CATEGORIES(driver).click(); // open more categories of podcasts //
            if (PODCAST_SEE_ALL_CATEGORIES(driver).isSelected()) {
                // check the see all button is good //
                System.out.println("selected/clicked");// -> need to add the result to Excel file //
            } else {
                System.out.println("Failed");// -> need to add the result to Excel file //
            }
            compare_names = PODCAST_GENRES(driver, list_of_steps_playlists_podcast.indexOf(x)).getText();
            PODCAST_GENRES(driver, list_of_steps_playlists_podcast.indexOf(x)).click(); // clicked on one genre, go into podcast //
            sleep(2000);// delay 2 sec //
            if (compare_names.equals((PLAYLIST_NAME_H1(driver, list_of_steps_playlists_podcast.indexOf(x))))) {
                // check if we go to the right podcast //
                System.out.println("equals");// -> need to add the result to Excel file //
            } else {
                System.out.println("Failed");// -> need to add the result to Excel file //
            }
            compare_names = NAME_OF_MORE_PODCASTS_NAMES(driver, list_of_steps_playlists_podcast.indexOf(x)).getText(); // copy the name of the podcast to comparing //
            NAME_OF_MORE_PODCASTS_NAMES(driver, list_of_steps_playlists_podcast.indexOf(x)).click(); // go into this podcast //
            sleep(2000); // delay 2 sce //
            if (compare_names.equals(NAME_OF_MORE_PODCASTS_NAMES(driver, list_of_steps_playlists_podcast.indexOf(x)))) {
                // comparing if we go to the right podcast in some genres //
                System.out.println("equals");// -> need to add the result to Excel file //
            } else {
                System.out.println("Failed");// -> need to add the result to Excel file //
            }
            FOLLOW(driver).click();
            if (FOLLOW(driver).isSelected()) {
                // check the follow button //
                System.out.println("equals");// -> need to add the result to Excel file -- need to be following btn //
            } else {
                System.out.println("Failed");// -> need to add the result to Excel file //
            }
            SETTINGS_3_DOTS(driver).click();
            if (SETTINGS_3_DOTS(driver).isSelected()) {
                // check the setting button //
                System.out.println("equals");// -> need to add the result to Excel file -- need to be following btn //
            } else {
                System.out.println("Failed");// -> need to add the result to Excel file //
            }
        }









        }
    }





