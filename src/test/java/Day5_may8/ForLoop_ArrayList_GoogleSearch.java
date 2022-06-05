package Day5_may8;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class ForLoop_ArrayList_GoogleSearch {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        //setup your chromedriver with webdrivermanager

        ChromeOptions options = new ChromeOptions();
        //set up chrome options

        options.addArguments("incognito");
        //set the condition to incognito mode

        options.addArguments("start-maximized");
        //set the condition to maximize/fullscreen your driver

        options.addArguments("headless");
        //setting your driver as headless(running in background)

        //options.addArguments("start-fullscreen");
        //for mac use full screen

        WebDriver driver = new ChromeDriver(options);
        //define the webdriver I am going to use

        ArrayList<String> cities = new ArrayList<>();
        //capture search number and print for following cities using arraylist and for loop
        cities.add("Brooklyn");
        cities.add("Queens");
        cities.add("Bronx");

        for(int i=0; i<cities.size(); i++) {

            driver.navigate().to("https://www.google.com");
            //go to Google home page

            Thread.sleep(3000);

            //driver.manage().window().maximize(); --being called in option argument
            //maximize the driver

            driver.findElement(By.xpath("//*[@name='q']")).sendKeys(cities.get(i));
            //locate element for search field and type keyword cars

            driver.findElement(By.xpath("//*[@name='btnK']")).submit();
            //submit on google search button

            Thread.sleep(2500);

            String searchResult = driver.findElement(By.xpath("//*[@id='result-stats']")).getText();
            //System.out.println("Result is " + searchResult);

            String[] arrayResult = searchResult.split(" ");
            //String replaceParanth = arrayResult[3].replace("(","").replace(")","");
            System.out.println("My search number for city  is " + cities.get(i) + " is " + arrayResult[1]);
            //extract out the number and print the search number only

        }//end of for loop

        driver.quit();  //quit the driver

    }//end of main
}//end of class
