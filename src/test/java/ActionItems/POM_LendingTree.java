package ActionItems;

import ReusableClasses.Reusable_Actions_POM_Loggers;
import ReusableClasses.Reusable_Annotations_Class;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_LendingTree extends Reusable_Annotations_Class {
    ExtentTest logger;

    //Lending Tree Auto loans tab steps

    public POM_LendingTree(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.logger = Reusable_Annotations_Class.logger;
        //constructor class
    }

    //xpath locators
    @FindBy(xpath = "//*[@class='nav-dropdown-trigger nav-autos-trigger']")
    WebElement autoLoansTabDropDown;
    @FindBy(xpath = "//*[@class='nav-dropdown-icon lt4-Autos']")
    WebElement autoLoansButtonInDropDown;



    public void ALoanDDown(){
        Reusable_Actions_POM_Loggers.clickAction(driver,autoLoansTabDropDown,logger,"Autoloan DDown");
    }
    public void ALoanDDownButton(){
        Reusable_Actions_POM_Loggers.clickAction(driver,autoLoansButtonInDropDown,logger,"Autoloan DDown button");
    }



}//end of class
