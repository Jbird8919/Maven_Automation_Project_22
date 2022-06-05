package Day7_may15;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;

public class Exception_MortgageCalc {
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

        /*
        ArrayList<String> pPriceList = new ArrayList<>();
        pPriceList.add("450000");
        pPriceList.add("470000");
        pPriceList.add("500000");

        ArrayList<String> sMonthList = new ArrayList<>();
        sMonthList.add("Jun");
        sMonthList.add("Jul");
        sMonthList.add("Aug");
        */  //lines 35 to 43 is used for the for loop to enter and loop data

        //for(int i=0;i<sMonthList.size();i++) {
        driver.navigate().to("https://www.mlcalc.com");
        //navigate to mortgage calculator
        Thread.sleep(3000);

        try{     //handle exception for purchase price
            WebElement pPrice = driver.findElement(By.xpath("//*[@id='ma']"));
            pPrice.clear();
            pPrice.sendKeys("450000"); //for the arraylist take out hard code amount and put im pPrice variable
        }catch (Exception e){
            System.out.println("Unable to locate purchase price " + e);
            //print out the exception
        }//end of purchase price exception


        try{     //handle exception for show advance option button
            driver.findElement(By.xpath("//*[text()='Show advanced options']")).click();
        }catch (Exception e){
            System.out.println("Unable to locate Show Advance Options button " + e);
            //print out the exception
        }//end of Show advanced options exception


        try{     //handle exception for start month drop down
            WebElement startMonth = driver.findElement(By.xpath("//*[@name='sm']"));
            Select dropdown = new Select(startMonth);
            dropdown.selectByVisibleText("Jun");//for the arraylist take out hard code month and put im sMonth variable
        }catch (Exception e){
            System.out.println("Unable to locate Start Month dropdown " + e);
            //print out the exception
        }//end of start month exception



        try{     //handle exception for calculate button
            driver.findElement(By.xpath("//*[@value='Calculate']")).click();
        }catch (Exception e){
            System.out.println("Unable to locate Calculate button " + e);
            //print out the exception
        }//end of calculate exception

        Thread.sleep(3000);

        try{     //handle exception for monthly payment
            String mntPayment = driver.findElements(By.xpath("//div[@style='font-size: 32px']")).get(0).getText();
            System.out.println("Monthly payment is " + mntPayment);
        }catch (Exception e){
            System.out.println("Unable to locate monthly payment text " + e);
            //print out the exception
        }//end of monthly payment exception

        //}//end of for loop

    }//end of main

}//end of class
