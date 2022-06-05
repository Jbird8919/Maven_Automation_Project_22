package ActionItems;

import ReuseableMethodsLibraries.Reusable_Actions;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;

public class ActionItem5 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = Reusable_Actions.setDriver();

        ArrayList<String> firstName = new ArrayList<>();
        firstName.add("Jay");
        firstName.add("Rye");
        firstName.add("Jen");

        ArrayList<String> lastName = new ArrayList<>();
        lastName.add("Ci");
        lastName.add("Cir");
        lastName.add("Cira");

        //ArrayList<String> month = new ArrayList<>();
        //month.add("October");
        //month.add("May");
        //month.add("July");

        ArrayList<String> day = new ArrayList<>();
        day.add("31");
        day.add("3");
        day.add("21");

        ArrayList<String> year = new ArrayList<>();
        year.add("1988");
        year.add("1992");
        year.add("2000");

        ArrayList<String> zipCode = new ArrayList<>();
        zipCode.add("10306");
        zipCode.add("11746");
        zipCode.add("10006");

        ArrayList<String> memberId = new ArrayList<>();
        memberId.add("2143221");
        memberId.add("4354456");
        memberId.add("2132133");

        for (int i = 0; i < firstName.size(); i++) {

            driver.navigate().to("https://www.uhc.com");

            Reusable_Actions.verifyTitleAction(driver, "Health insurance plans for individuals & families, employers, medicare | UnitedHealthcare");

            Reusable_Actions.clickAction(driver, "//*[@href='/find-a-doctor']", "Find a Doctor");

            Reusable_Actions.clickAction(driver, "//*[text()='Sign in']", "Sign in");

            Thread.sleep(1500);

            Reusable_Actions.clickAction(driver, "//*[text()='Medicare plan?']", "Medicare plan");

            Reusable_Actions.switchToTabByIndexAction(driver, 1);

            Thread.sleep(3000);

            Reusable_Actions.clickAction(driver, "//*[@class='uhc-tempo-link uhc-tempo-link--medium registerBtn ng-scope']", "Sign in");

            //*[@id='firstName']
            //*[@id='lastName']
            //*[@id='dob_month_input']
            //*[text()='October']
            //*[@id='dob_day']
            //*[@id='dob_year']
            //*[@id='zipCode']
            //*[@id='memberId']
            //*[@id='submitBtn']

            Reusable_Actions.sendKeysAction(driver, "//*[@id='firstName']", firstName.get(i), "first name");
            Reusable_Actions.sendKeysAction(driver, "//*[@id='lastName']", lastName.get(i), "last name");
            Reusable_Actions.clickAction(driver, "//*[@id='dob_month_input']", "month box");
            Reusable_Actions.clickAction(driver, "//*[text()='October']", "month");
            Reusable_Actions.sendKeysAction(driver, "//*[@id='dob_day']", day.get(i), "month day");
            Reusable_Actions.sendKeysAction(driver, "//*[@id='dob_year']", year.get(i), "year");
            Reusable_Actions.sendKeysAction(driver, "//*[@id='zipCode']", zipCode.get(i), "zip code");
            Reusable_Actions.sendKeysAction(driver, "//*[@id='memberId']", memberId.get(i), "invalid member id");
            Reusable_Actions.clickAction(driver, "//*[@id='submitBtn']", "continue button");

            Thread.sleep(1000);

            String errorMsg = Reusable_Actions.getTextAction(driver, "//*[@id='personalInfo_errors']", "Error text");
            System.out.println("This is the error message " + errorMsg);

            driver.close();

            Thread.sleep(1000);

            Reusable_Actions.switchToTabByIndexAction(driver, 0);


        }//end of loop
        driver.quit();

    }//end of main
}//end of class
