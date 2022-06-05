package Day2_apr24;

public class whileLoop {
    public static void main(String[] args) {
        //iterate through zipCode and houseNumber using linear array and while loop
        String[] zipCode = new String[]{"11111","22222","33333","44444","55555"};
        int[] houseNumber = new int[]{111,222,333,444,555};

        //initialize your starting point before calling while loop
        int i=0;
        //define the end point in the while loop
        while (i<houseNumber.length){
            System.out.println("My zipcode is " + zipCode[i] + " house number " + houseNumber[i]);
            //incrementing
            i=i+1;


        }//end of while loop
    }//end of main
}//end of class

