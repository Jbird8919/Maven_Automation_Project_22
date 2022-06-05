package ActionItems;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class Actionitem4 {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        //setup your chromedriver with webdrivermanager

        ChromeOptions options = new ChromeOptions();
        //set chrome options arguments

        options.addArguments("incognito");
        //set the condition to incognito mode

        options.addArguments("start-maximized");
        //set the condition to maximize/fullscreen your driver

        //options.addArguments("start-fullscreen");
        //for mac use full screen

        WebDriver driver = new ChromeDriver(options);
        //define the webdriver I am going to use

        driver.navigate().to("https://www.weightwatchers.com");
        //navigate to mortgage calculator
        Thread.sleep(3000);

        ArrayList<String> zipCode = new ArrayList<>();
        zipCode.add("10306");
        zipCode.add("11746");
        zipCode.add("10006");

        for(int i=0;i<zipCode.size();i++) {

            try {
                driver.findElement(By.xpath("//*[@da-label='Attend']")).click();
                //click on attend drop down
            } catch (Exception e) {
                System.out.println("Unable to locate Attend dropdown" + e);
            }//end of dropdown exception

            Thread.sleep(1000);
            //wait for page to load

            try {
                driver.findElements(By.xpath("//*[text()='Unlimited Workshops']")).get(1).click();
                //get Unlimited Workshops under dropdown - array index 1 and click it
            } catch (Exception e) {
                System.out.println("Unable to locate unlimited workshop button" + e);
            }//end of unlimited workshop button exception

            Thread.sleep(3000);
            //wait for new page to load

            try {
                driver.findElement(By.xpath("//*[text()='Studio']")).click();
                //after new page loads click on studio tab option
            } catch (Exception e) {
                System.out.println("Unable to locate studio button" + e);
            }//end of studio exception

            Thread.sleep(1000);
            //wait for page to load

            try {
                WebElement studioZipcode = driver.findElement(By.xpath("//*[@id='location-search']"));
                //xpath for search field
                studioZipcode.clear();
                //clears text field
                studioZipcode.sendKeys(zipCode.get(i));
                //send keys for zipcodes to be looped using zipcode arraylist variable and i from for loop
            }catch(Exception e) {
                System.out.println("Unable to type in zipcodes" + e);
            }//end of studio exception

            Thread.sleep(2000);
            //wait for page to load

            driver.findElement(By.xpath("//*[@id='location-search-cta']")).click();
            //click on the search button

            Thread.sleep(2000);
            //wait for page to load

            try {
            if (zipCode.get(i) == "10306"){
                Thread.sleep(2000);
                String address1 = driver.findElement(By.xpath("//*[@href='/us/find-a-workshop/1180130/ww-studio-richmond-avenue-staten-island-ny']")).getText();
                System.out.println("Studio zipcode 10306 is called " + address1);
            } else if (zipCode.get(i) == "11746") {
                Thread.sleep(2000);
                String address1 = driver.findElement(By.xpath("//*[@href='/us/find-a-workshop/1253009/ww-studio--moose-lodge-greenlawn-greenlawn-ny']")).getText();
                System.out.println("Studio zipcode 11746 is called " + address1);
            } else if (zipCode.get(i) == "10006") {
                Thread.sleep(2000);
                String address1 = driver.findElement(By.xpath("//*[@href='/us/find-a-workshop/1252579/ww-studio--fairfield-inn--suites-new-york-brooklyn-brooklyn-ny']")).getText();
                System.out.println("Studio zipcode 10006 is called " + address1);
                }
            }catch(Exception e){
                System.out.println("No usable elements found " + e);
            }//end of exception for studio zipcodes
/*
            try{
                JavascriptExecutor jse = (JavascriptExecutor)driver;
                //declare javascriptexecutor variable

                WebElement table = driver.findElement(By.xpath("//*[@id='search-results']"));
                //declare a webelement variable that we want to scroll into

                jse.executeScript("arguments[0].scrollIntoView(true);",table);
                System.out.println("This is the JSE table text " + table.getText());
                Thread.sleep(2000);

            }catch(Exception e) {
                System.out.println("Jse table didn't share anything " + e);
            }//end of jse exception
*/
        }//end of for loop

        driver.quit();
        //closes the browser

    }//end of main
}//end of class
