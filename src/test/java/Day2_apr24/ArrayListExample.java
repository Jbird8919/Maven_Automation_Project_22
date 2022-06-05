package Day2_apr24;

import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {
    //create arraylist of countries
        ArrayList<String> countries = new ArrayList<>();
        countries.add("USA"); //index 0
        countries.add("India"); //index 1
        countries.add("Bangladesh"); //index 2
        countries.add("Pakistan"); //index 3
        countries.add("Canada"); //index 4

    // I want to print the 4th value from the list
        System.out.println("My last country is " + countries.get(0) + " and my other country is " + countries.get(4));
    //index 5 will be throw index out of bound exception since there is no value stored for index 5

    }//end of main
}//end of class
