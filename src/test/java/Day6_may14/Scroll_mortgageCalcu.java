package Day6_may14;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Scroll_mortgageCalcu {
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

        JavascriptExecutor jse = (JavascriptExecutor)driver;
        //declare javascriptexecutor variable

        //jse.executeScript("scroll(0,500)");   //right side- ex:500 is for up and down, left side- ex:0 is for left to right scroll
        //scroll down to pixel 500 on webpage

        //jse.executeScript("scroll(0,-500)");
        //scroll up to pixel 500 on webpage

        WebElement shareButton = driver.findElement(By.xpath("//*[@id='share_button']"));
        //declare a webelement variable that we want to scroll into

        jse.executeScript("arguments[0].scrollIntoView(true);",shareButton);
        Thread.sleep(3000);

        shareButton.click();
        //click on the share this calculation button
        Thread.sleep(3000);

        jse.executeScript("scroll(0,-400)");



    }//end of main
}//end of class
