package Day7_may15;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Select_MortgageCalc {
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

        WebElement startMonth = driver.findElement(By.xpath("//*[@name='param[start_month]']"));
        //select start month from the dropdown

        Select dropDown = new Select(startMonth);
        //define select command

        dropDown.selectByVisibleText("Jun");
        //select by visible text - Jun

        //line 50-53 is for selecting tag by text instead of commonly used visible text
        //startMonth.click();
        //clicking on the dropdown and its value if the dropdown tag is not under the select tag
        //driver.findElements(By.xpath("//*[text()='Jun']")).click();
        //click on the value of the month

        WebElement loanType = driver.findElement(By.xpath("//*[@name='param[milserve]']"));
        //select loan type from the dropdown

        Select loanTypeDropdown = new Select(loanType);
        //define select command

        loanTypeDropdown.selectByVisibleText("FHA");
        //select by visible text

    }//end of main
}//end of class
