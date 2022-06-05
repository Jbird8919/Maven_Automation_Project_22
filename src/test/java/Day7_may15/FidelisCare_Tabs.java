package Day7_may15;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class FidelisCare_Tabs {
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

        driver.navigate().to("https://www.fideliscare.org");
        //go to bing home page

        Thread.sleep(3000);

        driver.findElements(By.xpath("//*[text()='Shop For a Plan']")).get(0).click();
        //we are clicking on index 0 because there are two elements for this xpath

        Thread.sleep(1000);
        //wait for page to load

        driver.findElements(By.xpath("//*[text()='Medicaid Managed Care']")).get(0).click();
        //click on medicaid managed care

        Thread.sleep(1000);
        //wait for page to load

        driver.findElement(By.xpath("//*[@href='/findadoctor']")).click();
        //click on search under find a doctor

        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        //store new tabs in a array list, we use getwindowhandles to get list of tabs

        driver.switchTo().window(tabs.get(1));
        //switch tab, it should be index 1

        driver.findElement(By.xpath("//*[@class='fal fa-search-plus']")).click();
        //click on search button

        Thread.sleep(1000);
        //wait for page to load

        driver.close();
        //close the new tab

        driver.switchTo().window(tabs.get(0));
        //then click on providers tab, this is needed even though we only have 1 tab left for the elements to be used on that tab too


        driver.findElement(By.xpath("//*[@class='fal fa-stethoscope fa-fw']")).click();
        //Then click on providers card

        Thread.sleep(3000);
        //wait for page to load
















    }//end of main
}//end of class
