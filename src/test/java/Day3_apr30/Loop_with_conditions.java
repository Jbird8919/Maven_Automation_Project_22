package Day3_apr30;

import java.util.ArrayList;

public class Loop_with_conditions {

    public static void main(String[] args) {

        //create an array with fruits and print only when fruit is and apple or an orange
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Grape");
        fruits.add("Strawberry");

        for(int i=0;i<fruits.size();i++){
            if(fruits.get(i) == "Apple"){
                System.out.println("My fruit is " + fruits.get(i));
            } else if(fruits.get(i) == "Grape"){
                System.out.println("My fruit is " + fruits.get(i));
            }

           /*
           //with or operator
            if (fruits.get(i) == "Apple" || fruits.get(i) == "Grape"){
                System.out.println("My fruit is " + fruits.get(i));
            }
            */
        }//end of for loop

    }//end of main
}//end of class

/*

the /* on top and * / on bottom comments out lines 27 thru 31

 */