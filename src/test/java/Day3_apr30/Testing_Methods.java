package Day3_apr30;

import ReuseableMethodsLibraries.Reusable_Methods;

public class Testing_Methods {

    public static void main(String[] args) {

        //call the add two number method and execute it
        Reusable_Methods.addTwoNumbers(20,30);

        //call the return method and store it on a variable to perform something else
        int finalResult = Reusable_Methods.subtractTwoNumbers(20, 10);
        //or define the result - int newResult = finalResult + 10; and call newResult instead of finalResult in line 15 ( )
        System.out.println("New result is " + (finalResult+10));

    }//end of main
}//end of java class