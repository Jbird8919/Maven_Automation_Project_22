package ActionItems;


import ReusableClasses.Reusable_Actions_Loggers;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ActionItem6part2_LendingTree {

    WebDriver driver;
    ExtentReports reports;
    ExtentTest logger;

    @BeforeSuite
    public void SetChromeDriver() {
        driver = Reusable_Actions_Loggers.setDriver();
        //define the driver
        reports = new ExtentReports("src/main/java/HTML_Report/Automation.html", true);
        //define report path
    }//end of before suite

    //this test case is to do the steps to get an auto loan quote
    @Test(priority = 1)
    public void LendingTreeAutoLoans() throws InterruptedException {
        logger = reports.startTest("Lending Tree Auto Loans");
        driver.navigate().to("https://www.lendingtree.com");
        //navigate to lending tree website
        Reusable_Actions_Loggers.clickAction(driver,"//*[@class='nav-dropdown-trigger nav-autos-trigger']","Auto Loans tab");
        //click on auto loans tab dropdown
        Reusable_Actions_Loggers.clickAction(driver,"//*[@class='nav-dropdown-icon lt4-Autos']","Auto Loans button");
        //click on auto loans button in dropdown
        Thread.sleep(2000);
        //wait for new page to load
        Reusable_Actions_Loggers.clickAction(driver,"//*[@id='AutomobileLoanType']","Auto loan type");
        //click on auto load type dropdown
        Reusable_Actions_Loggers.clickAction(driver,"//*[text()='New Car Purchase']","New Car Purchase Auto loan type");
        //select on new car purchase from auto loan type dropdown
        Reusable_Actions_Loggers.clickAction(driver,"//*[@class='btn btn-orange full-width']","See personalized rates button");
        //click on See personalized rates button
        Thread.sleep(2000);
        //wait for new page to load for loan term amount
        Reusable_Actions_Loggers.clickAction(driver,"//*[text()='7 Years (84 Months)']","7 years loan term button");
        //click on 7 years loan term button
        Thread.sleep(2000);
        //wait for new page to load for down payment
        Reusable_Actions_Loggers.clickAction(driver,"//*[@id='formData.TotalDownPayment']","down payment field");
        //click on down payment field
        Reusable_Actions_Loggers.sendKeysAction(driver,"//*[@id='formData.TotalDownPayment']","50000",logger,"down payment field box");
        //enter down payment amount
        Reusable_Actions_Loggers.clickAction(driver,"//*[@class='ltFormButton TotalDownPayment']","down payment continue button");
        //click on loan amount field
        Thread.sleep(2000);
        //wait for new page to load for loan amount
        Reusable_Actions_Loggers.clickAction(driver,"//*[@class='ltFormControl Amount']","loan amount field");
        //click on loan amount field
        Reusable_Actions_Loggers.sendKeysAction(driver,"//*[@class='ltFormControl Amount']","120000",logger,"loan amount");
        //enter loan amount
        Reusable_Actions_Loggers.clickAction(driver,"//*[@class='ltFormButton Amount']","loan amount continue button");
        //click on loan amount field
        Thread.sleep(2000);
        //wait for new page to load
        //Reusable_Actions.clickAction(driver,"//*[@class='ltFormRadioButton NewCarPurchase']","New Cars list button");
        //click on new cars button
        Reusable_Actions_Loggers.clickAction(driver,"//*[@class='seeMore']","See more cars button");
        //click on see more cars button
        Reusable_Actions_Loggers.clickAction(driver,"//*[@class='ltFormVehicleMakeControl ltFormVehicleMakeControl26']","Mazda cars");
        //click on mazda cars button
        Thread.sleep(2000);
        //wait for new page to load for year and model of car
        Reusable_Actions_Loggers.clickAction(driver,"//*[@class='ltFormRadioControl ltFormRadioControl2022']","Car year");
        //click on car year
        Reusable_Actions_Loggers.clickAction(driver,"//*[@class='ltFormVehicleModelControl ltFormVehicleModelControl35259 vehicleUsedModel']","Mazda Miata RF");
        //click on mazda model(miata rf)
        Thread.sleep(2000);
        //wait for new page to load for trim of car
        Reusable_Actions_Loggers.clickAction(driver,"//*[text()='Grand Touring Manual']","Car trim");
        //click on car trim
        Thread.sleep(2000);
        //wait for new page to load for did you find car to buy already question
        Reusable_Actions_Loggers.clickAction(driver,"//*[@class='ltFormRadioControl ltFormRadioControltrue VehicleFoundIndicator']","Yes, I found car i want");
        //click on if you found the car you want to buy point
        //Reusable_Actions.clickAction(driver,"//*[@class='ltFormButton VehicleFoundIndicator']","Continue button");
        //click on continue button
        Thread.sleep(2000);
        //wait for new page to load for when were you born
        Reusable_Actions_Loggers.clickAction(driver,"//*[@class='ltFormControlMulti DOB box1']","Month dropdown");
        //click on month dropdown
        Reusable_Actions_Loggers.clickAction(driver,"//*[text()='October']","The Month");
        //click on month you were born
        Reusable_Actions_Loggers.clickAction(driver,"//*[@class='ltFormControlMulti DOB box2']","Day dropdown");
        //click on day dropdown
        Reusable_Actions_Loggers.clickAction(driver,"//*[text()='31']","The Day");
        //click on day you were born
        Reusable_Actions_Loggers.clickAction(driver,"//*[@class='ltFormControlMulti DOB box3']","year dropdown");
        //click on year dropdown
        Reusable_Actions_Loggers.clickAction(driver,"//*[text()='1980']","The year");
        //click on year you were born
        //Reusable_Actions.clickAction(driver,"//*[@class='ltFormButtonContainer']","DOB continue button");
        //click on dob continue button
        Thread.sleep(2000);
        //wait for new page to load for any bankruptcy
        Reusable_Actions_Loggers.clickAction(driver,"//*[@class='ltFormRadioControl ltFormRadioControlfalse BankruptIndicator']","No option for Bankruptcy");
        //click on no option for bankruptcy
        Thread.sleep(2000);
        //wait for new page to load for credit score
        Reusable_Actions_Loggers.clickAction(driver,"//*[@class='ltFormGroupContentSelect']","Credit score dropdown");
        //click on credit score dropdown
        Reusable_Actions_Loggers.clickAction(driver,"//*[text()='Excellent (680+)']","Current Credit score");
        //click on current credit score
        Reusable_Actions_Loggers.clickAction(driver,"//*[@class='ltFormButtonContainer']","credit score continue button");
        //click on credit score continue button
        Thread.sleep(2000);
        //wait for new page to load for employment status
        Reusable_Actions_Loggers.clickAction(driver,"//*[@class='ltFormRadioControlInner FULLTIME EmploymentStatus']","Full time Employment status");
        //click on employment status full time
        Thread.sleep(2000);
        //wait for new page to load for employment start date
        Reusable_Actions_Loggers.clickAction(driver,"//*[@class='ltFormControlMulti JobStartDate box1']","Employment start month");
        //click on employment start date for year dropdown
        Reusable_Actions_Loggers.clickAction(driver,"//*[text()='June']","Employment month");
        //click on employment start date for month
        Reusable_Actions_Loggers.clickAction(driver,"//*[@class='ltFormControlMulti JobStartDate box3']","Employment start year");
        //click on employment start date for year dropdown
        Reusable_Actions_Loggers.clickAction(driver,"//*[text()='2020']","Employment year");
        //click on employment start date for year
        //Reusable_Actions.clickAction(driver,"//*[@class='ltFormActionText JobStartDate']","employment start continue button");
        //click on employment start date continue button
        Thread.sleep(2000);
        //wait for new page to load for current employer and job title
        Reusable_Actions_Loggers.clickAction(driver,"//*[@id='formData.EmployerName']","Current Employer");
        //click on employment start date for year
        Reusable_Actions_Loggers.sendKeysAction(driver,"//*[@id='formData.EmployerName']","abcxyz",logger,"Current Employer field");
        //enter current employer name
        Reusable_Actions_Loggers.clickAction(driver,"//*[@id='formData.JobTitle']","Job title");
        //click on job title field
        Reusable_Actions_Loggers.sendKeysAction(driver,"//*[@id='formData.JobTitle']","office work",logger,"job title field");
        //enter job title
        Reusable_Actions_Loggers.clickAction(driver,"//*[@class='ltFormButton EmployerName']","Job title continue button");
        //click on job title continue button
        Thread.sleep(2000);
        //wait for new page to load for pretax income
        Reusable_Actions_Loggers.clickAction(driver,"//*[@id='formData.AnnualIncome']","Pretax income");
        //click on pretax income field
        Reusable_Actions_Loggers.sendKeysAction(driver,"//*[@id='formData.AnnualIncome']","65000",logger,"pretax income field");
        //enter pretax income amount
        Reusable_Actions_Loggers.clickAction(driver,"//*[@id='formData.OtherAnnualIncome']","Other yearly income");
        //click on other income field
        Reusable_Actions_Loggers.sendKeysAction(driver,"//*[@id='formData.OtherAnnualIncome']","2000",logger,"Other yearly income field");
        //enter other income amount
        Reusable_Actions_Loggers.clickAction(driver,"//*[@class='ltFormButton AnnualIncome']","pretax income continue button");
        //click on pretax income continue button
        Thread.sleep(2000);
        //wait for new page to load for liquid assets
        Reusable_Actions_Loggers.clickAction(driver,"//*[@id='formData.TotalLiquidAssetValue']","Liquid assets field");
        //click liquid assets field
        Reusable_Actions_Loggers.sendKeysAction(driver,"//*[@id='formData.TotalLiquidAssetValue']","28000",logger,"liquid assets amount");
        //enter liquid assets amount
        Reusable_Actions_Loggers.clickAction(driver,"//*[@class='ltFormButtonContainer']","Liquid assets field");
        //click liquid assets field
        Thread.sleep(2000);
        //wait for new page to load for your name
        Reusable_Actions_Loggers.clickAction(driver,"//*[@id='formData.FirstName']","Liquid assets field");
        //click first name field
        Reusable_Actions_Loggers.sendKeysAction(driver,"//*[@id='formData.FirstName']","JJ",logger,"liquid assets amount");
        //enter first name
        Reusable_Actions_Loggers.clickAction(driver,"//*[@id='formData.LastName']","Liquid assets field");
        //click last name field
        Reusable_Actions_Loggers.sendKeysAction(driver,"//*[@id='formData.LastName']","CC",logger,"liquid assets amount");
        //enter last name
        Reusable_Actions_Loggers.clickAction(driver,"//*[@class='ltFormButton FirstName']","Name continue button");
        //click name continue button
        Thread.sleep(2000);
        //wait for new page to load for your email/password
        Reusable_Actions_Loggers.clickAction(driver,"//*[@id='formData.EmailAddress']","Email address field");
        //click email address field
        Reusable_Actions_Loggers.sendKeysAction(driver,"//*[@id='formData.EmailAddress']","abc123@abc.com",logger,"email address");
        //enter valid email address
        Reusable_Actions_Loggers.clickAction(driver,"//*[@id='formData.Password']","password field");
        //click password field
        Reusable_Actions_Loggers.sendKeysAction(driver,"//*[@id='formData.Password']","CC",logger,"masked password");
        //enter masked password
        Reusable_Actions_Loggers.clickAction(driver,"//*[@class='ltFormButton EmailAddress']","Create log in button");
        //click Create log in button
        reports.endTest(logger);
    }//end of Test 1

    @Test(priority = 2)
    public void BestAutoLenders2022() throws InterruptedException {
        logger = reports.startTest("Best Auto Lenders 2022");
        driver.navigate().to("https://www.lendingtree.com");
        //navigate to lending tree website
        Reusable_Actions_Loggers.clickAction(driver, "//*[@class='nav-dropdown-trigger nav-autos-trigger']", "Auto Loans tab");
        //click on auto loans tab dropdown
        Reusable_Actions_Loggers.clickAction(driver, "//*[@class='nav-dropdown-icon lt4-Autos']", "Auto Loans button");
        //click on auto loans button in dropdown
        Thread.sleep(3500);
        //wait for new page to load
        Reusable_Actions_Loggers.manualscrollamountAction(driver,"custom scroll amount");
        //scroll to loan mount field
        Thread.sleep(3500);
        //wait for new page to load
        Reusable_Actions_Loggers.getTextActionwithHardcodeindex(driver,"//*[@class='table table-striped']","capital one table");
        //capital one table
        String result = Reusable_Actions_Loggers.getTextAction(driver, "//*[@class='table table-striped']", logger, "Table Text results");
        //split the result by single space and print out the search number
        String[] arrayResult = result.split(" ");
        System.out.println("Search number is " + arrayResult[1]);
        logger.log(LogStatus.INFO, "Search number is " + arrayResult[1]);
        Reusable_Actions_Loggers.verifyTitleAction(driver,"Best Auto Loans & Auto Loan Rates for 2022 - LendingTree");
        //getting title of page
        reports.endTest(logger);
    }//end of test 5


    @AfterSuite
    public void quitSession() {
        driver.quit();
        reports.flush();
    }//end of after suite


}//end of class

