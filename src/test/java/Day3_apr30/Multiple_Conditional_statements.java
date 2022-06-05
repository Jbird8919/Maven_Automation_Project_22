package Day3_apr30;

public class Multiple_Conditional_statements {

    public static void main(String[] args) {

        int a = 1;
        int b = 2;
        int c = 3;

        //if a+b is less than c then print the result
        //if a+b is greater than c then print the result
        //finally print a+b is equal to c
        if (a+b < c){
            System.out.println("a and b is less than c");
        }else if (a+b > c){
            System.out.println("a and b is greater than c");
        }else{
            System.out.println("a and b is equal to c");
        }//end of condition

// || is used for 'or' operator -- one of the conditions needs to be true only
// && is used for 'and' operator -- both conditions need to be true

    }//end of main
}//end of class

