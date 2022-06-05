package Day6_may14;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebElement_mortgageCalc {
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

        driver.navigate().to("https://www.mortgagecalculator.org");
        //go to bing home page

        Thread.sleep(3000);

        WebElement homeValue = driver.findElement(By.xpath("//*[@id='homeval']"));
        //click, clear and enter new data on home value field
        homeValue.click();
        homeValue.clear();
        homeValue.sendKeys("450000");

        driver.findElement(By.xpath("//*[@value='percent']")).click();
        //click on % ratio button

        WebElement downPayment = driver.findElement(By.xpath("//*[@id='downpayment']"));
        //click, clear and enter new data on down payment field
        downPayment.click();
        downPayment.clear();
        downPayment.sendKeys("5");


    }//end of main
}//end of class
