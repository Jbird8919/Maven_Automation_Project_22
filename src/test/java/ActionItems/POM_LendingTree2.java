package ActionItems;

import ReusableClasses.Reusable_Actions_POM_Loggers;
import ReusableClasses.Reusable_Annotations_Class;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_LendingTree2 extends Reusable_Annotations_Class {
    ExtentTest logger;

    //Steps to get up to pick auto loan type on lending tree

    public POM_LendingTree2(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.logger = Reusable_Annotations_Class.logger;
        //constructor class
    }

    @FindBy(xpath = "//*[@id='AutomobileLoanType']")
    WebElement autoLoansTypeDropDown;
    @FindBy(xpath = "//*[text()='New Car Purchase']")
    WebElement newCarPurchaseAutoLoanTypeDropDown;
    @FindBy(xpath = "//*[@class='btn btn-orange full-width']")
    WebElement seePersonalizedRateButton;


    public void ALoanTypeDDown(){
        Reusable_Actions_POM_Loggers.clickAction(driver,autoLoansTypeDropDown,logger,"Auto loan type");
    }
    public void AutomobileLoan(){
        Reusable_Actions_POM_Loggers.clickAction(driver,newCarPurchaseAutoLoanTypeDropDown,logger,"New Car Purchase Auto loan type");
    }
    public void NewCarDDrown(){
        Reusable_Actions_POM_Loggers.clickAction(driver,seePersonalizedRateButton,logger,"See personalized rates button");
    }















}