package ActionItems;

import ReusableClasses.Reusable_Actions_POM_Loggers;
import ReusableClasses.Reusable_Annotations_Class;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_LendingTree5 extends Reusable_Annotations_Class {
    ExtentTest logger;

    //Steps to enter loan amount on lending tree

    public POM_LendingTree5(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.logger = Reusable_Annotations_Class.logger;
        //constructor class
    }

    @FindBy(xpath = "//*[@class='ltFormControl Amount']")
    WebElement loanAmountField;
    @FindBy(xpath = "//*[@class='ltFormControl Amount']")
    WebElement enterLoanAmount;
    @FindBy(xpath = "//*[@class='ltFormButton Amount']")
    WebElement loanAmountContinueButton;


    public void clickLoanAmountField(){
        Reusable_Actions_POM_Loggers.clickAction(driver,loanAmountField,logger,"loan amount field");
    }
    public void actualLoanAmount(){
        Reusable_Actions_POM_Loggers.sendKeysAction(driver,enterLoanAmount,"120000",logger, "loan amount");
    }
    public void loanContinueButton(){
        Reusable_Actions_POM_Loggers.clickAction(driver,loanAmountContinueButton,logger,"loan amount continue button");
    }

}//end of class