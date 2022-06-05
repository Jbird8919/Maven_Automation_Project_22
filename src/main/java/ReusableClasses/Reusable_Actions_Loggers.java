package ReusableClasses;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Reusable_Actions_Loggers {


    //set a static timeout variable so it can cover all explicit for all methods
    public static int timeout = 30;

    //resuable function for webdriver as a return method
    public static WebDriver setDriver() {
        //setup your chromedriver with webdrivermanager
        WebDriverManager.chromedriver().setup();
        //set chrome options arguments
        ChromeOptions options = new ChromeOptions();
        //set the condition to incognito mode
        options.addArguments("incognito");
        //set the condition to maximize/fullscreen your driver
        options.addArguments("start-maximized");
        //for mac use full screen
        //options.addArguments("start-fullscreen");
        //define the webdriver I am going to use
        WebDriver driver = new ChromeDriver(options);
        return driver;

    }//end of setDriver method

    //create a mouse hover method
    public static void mouseHover(WebDriver driver, String xpath, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        Actions actions = new Actions(driver);
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
            actions.moveToElement(element).perform();
        } catch (Exception e) {
            System.out.println("Unable to hover on element " + elementName + " " + e);
        }
    }//end of mouseHover

    //create a click method
    public static void clickAction(WebDriver driver, String xpath, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
            element.click();
        } catch (Exception e) {
            System.out.println("Unable to click on element " + elementName + " " + e);
        }
    }//end of clickAction

    //create a click method
    public static void clickActionYahooclass(WebDriver driver, String xpath, ExtentTest logger, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
            element.click();
        } catch (Exception e) {
            System.out.println("Unable to click on element " + elementName + " " + e);
        }
    }//end of clickAction
    //create a submit method
    public static void submitAction(WebDriver driver, String xpath, ExtentTest logger, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
            element.submit();
            logger.log(LogStatus.PASS, "Successfully submit on element " + elementName);
        } catch (Exception e) {
            System.out.println("Unable to submit on element " + elementName + " " + e);
            logger.log(LogStatus.FAIL, "Unable to submit on element " + elementName + " " + e);
        }
    }//end of submit


    //create a sendkeys method
    public static void sendKeysAction(WebDriver driver, String xpath, String userValue, ExtentTest logger, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
            element.sendKeys(userValue);
            logger.log(LogStatus.PASS, "Successfully enter user value on element " + elementName);
        } catch (Exception e) {
            System.out.println("Unable to click on element " + elementName + " " + e);
            logger.log(LogStatus.FAIL, "Unable to click on element " + elementName + " " + e);
        }
    }//end of sendkeys method

    //create a getText method
    public static String getTextAction(WebDriver driver, String xpath, ExtentTest logger, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        String result = "";
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
            result = element.getText();
            logger.log(LogStatus.PASS, "Successfully capture text on element " + elementName);
        } catch (Exception e) {
            System.out.println("Unable to capture text on element " + elementName + " " + e);
            logger.log(LogStatus.FAIL, "Unable to capture text on element " + elementName + " " + e);
        }
        return result;
    }//end of getTextAction method

    //create a click by index method
    public static void clickByIndexAction(WebDriver driver, String xpath, int indexNumber, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(xpath))).get(indexNumber);
            element.click();
        } catch (Exception e) {
            System.out.println("Unable to click on element " + elementName + " " + e);
        }
    }//end of clickByIndexAction

    //create a scroll method
    public static void scrollAction(WebDriver driver, String xpath, String elementName) {
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        try {
            WebElement scrollToElement = driver.findElement(By.xpath(xpath));
            jse.executeScript("arguments[0].scrollIntoView(true);",scrollToElement);
        } catch (Exception e) {
            System.out.println("Unable to scroll on page " + elementName + " " + e);
        }
    }//end of scrollAction

    //create a scroll method
    public static void manualscrollAction(WebDriver driver, String elementName) {
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        try {
            jse.executeScript("scroll(0,2000)");
            //scroll down to pixel 500 on webpage

            //jse.executeScript("scroll(0,-500)");
            //scroll up to pixel 500 on webpage

            //jse.executeScript("scroll(500,0)");
            //scroll left to pixel 500 on webpage

            //jse.executeScript("scroll(-500,0)");
            //scroll right to pixel 500 on webpage
        } catch (Exception e) {
            System.out.println("Unable to scroll on page " + elementName + " " + e);
        }
    }//end of scrollAction

    //create a scroll method
    public static void manualscrollamountAction(WebDriver driver, /* String scollToElement1, String scollToElement2, */ String elementName) {
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        try {
            jse.executeScript("scroll(0,7150)");
            //String scrollToElement1 = null;
            //String scrollToElement2 = null;
            //jse.executeScript("scroll("+scrollToElement1+","+scrollToElement2+")");
            //scroll down to pixel 500 on webpage

            //jse.executeScript("scroll(0,-500)");
            //scroll up to pixel 500 on webpage

            //jse.executeScript("scroll(500,0)");
            //scroll left to pixel 500 on webpage

            //jse.executeScript("scroll(-500,0)");
            //scroll right to pixel 500 on webpage
        } catch (Exception e) {
            System.out.println("Unable to scroll on page " + elementName + " " + e);
        }
    }//end of scrollAction

    //create a getText method
    public static String getTextActionwithHardcodeindex(WebDriver driver, String xpath, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        String result = null;
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(xpath))).get(5);
            result = element.getText();
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("Unable to capture text on element " + elementName + " " + e);
        }
        return result;
    }//end of getTextAction method

    //create a verify title method
    public static void verifyTitleAction(WebDriver driver, String actualtabTitle) {

        String actualTitle = driver.getTitle();
        if(actualTitle.equals(actualtabTitle)){
            System.out.println("My title matches ");
        }else {
            System.out.println("Title doesn't match. Actual title is " + actualTitle);
        }
    }//end of verifyTitleAction



}//end of class


