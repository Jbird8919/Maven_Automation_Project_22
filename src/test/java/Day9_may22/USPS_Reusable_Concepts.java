package Day9_may22;

import ReuseableMethodsLibraries.Reusable_Actions;
import org.openqa.selenium.WebDriver;

public class USPS_Reusable_Concepts {
    public static void main(String[] args) {

        WebDriver driver = Reusable_Actions.setDriver();
        //setting the local driver to reusable setDriver method

        driver.navigate().to("https://www.usps.com");
        //navigate to usps

        Reusable_Actions.mouseHover(driver,"//*[text()='Quick Tools']","Quick Tools");
        //hovering to send tab

        Reusable_Actions.mouseHover(driver,"//*[@id='mail-ship-width']","Send Tab");
        //hovering to the quick tools

        Reusable_Actions.clickAction(driver,"//*[@class='tool-calc']","Calculate a Price");
        //hovering to the quick tools

        //Reusable_Actions.clickByIndexAction(driver,"//*[@class='tool-calc']",8,"Calculate a Price");
        //example of clicking by index number example

        String result = Reusable_Actions.getTextAction(driver,"//*[@class='header-usps row']","Header Info");
        System.out.println("My header info is " + result);
        //print out header text info

        Reusable_Actions.sendKeysAction(driver,"//*[@id='Origin']","11746","Zip Code");
        //hovering to the quick tools


    }//end of main
}//end of class
