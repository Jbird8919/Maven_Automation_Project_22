package ActionItems;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class ActionItem3 {
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

        ArrayList<String> hobbies = new ArrayList<>();
        //capture search number and print for following cities using arraylist and for loop
        hobbies.add("paintballing");
        hobbies.add("high velocity field");
        hobbies.add("snowboards");
        hobbies.add("2001 mazda miata nb");
        hobbies.add("toyota tundra 2022");

        for(int i=0; i<hobbies.size(); i++) {

            driver.navigate().to("https://www.bing.com");
            //go to Google home page

            Thread.sleep(3500);

            //driver.manage().window().maximize(); --being called in option argument
            //maximize the driver

            driver.findElement(By.xpath("//*[@id='sb_form_q']")).sendKeys(hobbies.get(i));
            //locate element for search field and type keyword cars

            driver.findElement(By.xpath("//*[@id='search_icon']")).submit();
            //submit on google search button

            Thread.sleep(4500);

            String searchResult = driver.findElement(By.xpath("//*[@class='sb_count']")).getText();
            //System.out.println("Result is " + searchResult);

            String[] arrayResult = searchResult.split(" ");
            System.out.println("My search number for hobby of " + hobbies.get(i) + " is " + arrayResult[0]);
            //extract out the number and print the search number only

        }//end of for loop

        driver.quit();  //quit the driver

    }//end of main
}//end of class
