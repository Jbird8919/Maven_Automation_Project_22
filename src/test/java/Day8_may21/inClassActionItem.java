package Day8_may21;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class inClassActionItem {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        //setup your chromedriver with webdrivermanager

        ChromeOptions options = new ChromeOptions();
        //set up chrome options

        options.addArguments("incognito");
        //set the condition to incognito mode

        options.addArguments("start-maximized");
        //set the condition to maximize/fullscreen your driver

        //options.addArguments("headless");
        //setting your driver as headless(running in background)

        //options.addArguments("start-fullscreen");
        //for mac use full screen

        WebDriver driver = new ChromeDriver(options);
        //define the webdriver I am going to use

        ArrayList<String> location = new ArrayList<>();
        location.add("New York");
        location.add("New Jersey");
        location.add("Long Island");

        ArrayList<String> checkInDate = new ArrayList<>();
        checkInDate.add("Jun 6, 2022");
        checkInDate.add("Jun 13, 2022");
        checkInDate.add("Jun 20, 2022");

        ArrayList<String> checkOutDate = new ArrayList<>();
        checkOutDate.add("Jun 10, 2022");
        checkOutDate.add("Jun 17, 2022");
        checkOutDate.add("Jun 24, 2022");

        ArrayList<String> travelers = new ArrayList<>();
        travelers.add("3");
        travelers.add("4");
        travelers.add("5");

        driver.navigate().to("https://www.hotels.com");
        //navigate to website

        //   for(int i=0; i<location.size();i++) {

        try{
            WebElement searchBox = driver.findElement(By.xpath("//*[@aria-label='Going to']"));
            searchBox.click();
            Thread.sleep(2000);
            WebElement searchInput = driver.findElement(By.xpath("//*[@id='location-field-destination']"));
            searchInput.click();
            //  searchInput.sendKeys(location.get(i));
            searchInput.sendKeys("New York");
            Thread.sleep(2000);

        }catch (Exception e){
            System.out.println(" line57" + e);
        }

        try {
            WebElement searchOption1 = driver.findElements(By.xpath("//*[@class='uitk-typeahead-button-label truncate']")).get(0);
            searchOption1.click();
        }catch (Exception e){
            System.out.println("64" + e);
        }

        // select check in date
        try{
            driver.findElement(By.id("d1-btn")).click();
            //   driver.findElement(By.xpath("//*[@aria-label='"+checkInDate.get(i)+"']")).click();
            driver.findElement(By.xpath("//*[@aria-label='Jun 14, 2022']")).click();

        }catch (Exception e){
            System.out.println("line74" + e);
        }
        // select check out date
        try{
            //     driver.findElement(By.xpath("//*[@aria-label='"+checkOutDate.get(i)+"']")).click();
            driver.findElement(By.xpath("//*[@aria-label='Jun 20, 2022']")).click();
            Thread.sleep(1000);
            //click done
            driver.findElement(By.xpath("//*[@class='uitk-button uitk-button-medium uitk-button-has-text uitk-button-primary uitk-layout-flex-item uitk-layout-flex-item-flex-shrink-0 dialog-done']")).click();
        }catch (Exception e){
            System.out.println("line 84" + e);
        }

        // add travelers
        try{
            driver.findElements(By.xpath("//*[@class='uitk-fake-input uitk-form-field-trigger']")).get(1).click();
            Thread.sleep(1000);
            WebElement addTraveler = driver.findElements(By.xpath("//*[@class='uitk-layout-flex-item uitk-step-input-touch-target']")).get(1);
            addTraveler.click();

        }catch(Exception e){
            System.out.println("line 95"+ e);
        }

        try{
            //click done for travelers
            driver.findElement(By.xpath("//*[@class='uitk-button uitk-button-large uitk-button-fullWidth uitk-button-has-text uitk-button-primary uitk-button-floating-full-width']")).click();
        }catch(Exception e){
            System.out.println("line 101"+ e);
        }

        try {
            // click search button
            driver.findElement(By.xpath("//*[@data-testid='submit-button']")).click();
            Thread.sleep(2000);
        } catch(Exception e){
            System.out.println("line 108"+ e);
        }

        //click on first link
        try{
            driver.findElements(By.xpath("//*[@class='listing__link uitk-card-link']")).get(0).click();
            ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
            //within the second tab
            driver.switchTo().window(tabs.get(1));

            String resortName = driver.findElement(By.xpath("//*[@class='uitk-heading-3']")).getText();
            System.out.println("My resort name is " + resortName);
        }catch (Exception e){

        }
        //scroll down the page and capture price
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        WebElement price = driver.findElements(By.xpath("//*[@class='uitk-text uitk-type-600 uitk-type-bold uitk-text-emphasis-theme']")).get(0);
        //jse.executeScript()




        //   }// end of for loop
        // driver.quit();
    }//end of main method
}// end of java class
