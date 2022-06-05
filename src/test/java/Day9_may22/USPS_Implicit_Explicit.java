package Day9_may22;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class USPS_Implicit_Explicit {
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

        //driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        //set your global implicit wait

        driver.navigate().to("https://www.usps.com");
        //navigate to usps

        Actions actions = new Actions(driver);
        //call mouse actions

        WebDriverWait wait = new WebDriverWait(driver,8);
        //declare and define explicit wait

        WebElement quicktools = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Quick Tools']")));
        actions.moveToElement(quicktools).perform();
        //hover to quick tools

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Track a Package']"))).click();
        //click on track a package

        WebElement packageField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='tracking-input']")));
        packageField.click();
        packageField.sendKeys("42142143214");
        //click and then type on track a package field









    }//end of main
}//end of class
