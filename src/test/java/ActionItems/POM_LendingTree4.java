package ActionItems;

import ReusableClasses.Reusable_Actions_POM_Loggers;
import ReusableClasses.Reusable_Annotations_Class;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_LendingTree4 extends Reusable_Annotations_Class {
    ExtentTest logger;

    //Steps to pick a down payment on lending tree

    public POM_LendingTree4(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.logger = Reusable_Annotations_Class.logger;
        //constructor class
    }

    @FindBy(xpath = "//*[@id='formData.TotalDownPayment']")
    WebElement selectLoanTerm;
    @FindBy(xpath = "//*[@id='formData.TotalDownPayment']")
    WebElement downPaymentAmount;
    @FindBy(xpath = "//*[@class='ltFormButton TotalDownPayment']")
    WebElement clickLoanAmountField;


    public void pickLoanTerm(){
        Reusable_Actions_POM_Loggers.clickAction(driver,selectLoanTerm,logger,"down payment field");
    }
    public void pickDownPaymentAmount(){
        Reusable_Actions_POM_Loggers.sendKeysAction(driver,downPaymentAmount,"50000",logger, "down payment field box");
    }
    public void clickLoanField(){
        Reusable_Actions_POM_Loggers.clickAction(driver,clickLoanAmountField,logger,"down payment continue button");
    }

}//end of class