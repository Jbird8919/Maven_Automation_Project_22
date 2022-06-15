package ActionItems;

import ReusableClasses.Reusable_Actions_POM_Loggers;
import ReusableClasses.Reusable_Annotations_Class;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_LendingTree3 extends Reusable_Annotations_Class {
    ExtentTest logger;

    //Steps to get up to pick loan term on lending tree

    public POM_LendingTree3(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.logger = Reusable_Annotations_Class.logger;
        //constructor class
    }

    @FindBy(xpath = "//*[text()='7 Years (84 Months)']")
    WebElement selectLoanTerm;

    public void loanTermAmount(){
        Reusable_Actions_POM_Loggers.clickAction(driver,selectLoanTerm,logger,"7 years loan term button");
    }


}