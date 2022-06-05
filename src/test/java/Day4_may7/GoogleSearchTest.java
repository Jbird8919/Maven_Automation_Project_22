package Day4_may7;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        //setup your chromedriver with webdrivermanager

        WebDriver driver = new ChromeDriver();
        //define the webdriver I am going to use

        driver.navigate().to("https://www.google.com");
        //go to Google home page

        driver.manage().window().maximize();
        //maximize the driver

        driver.findElement(By.xpath("//*[@name='q']")).sendKeys("cars");
        //locate element for search field and type keyword cars

        driver.findElement(By.xpath("//*[@name='btnK']")).submit();
        //submit on google search button

        String searchResult = driver.findElement(By.xpath("//*[@id='result-stats']")).getText();
        //System.out.println("Result is " + searchResult);

        String [] arrayResult = searchResult.split(" ");
        //String replaceParanth = arrayResult[3].replace("(","").replace(")","");
        System.out.println("My search number is " + arrayResult[1]);
        //extract out the number and print the search number only

        driver.quit();  //quit the driver

    }//end of main
}//end of class
