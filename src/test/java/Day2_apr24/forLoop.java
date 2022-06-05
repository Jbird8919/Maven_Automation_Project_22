package Day2_apr24;

import java.util.ArrayList;

public class forLoop {
    public static void main(String[] args) {
        //create ArrayList for cities and loop/iterate through all the value using for loop
        ArrayList<String> cities = new ArrayList<>();
        cities.add("bkln");
        cities.add("S.I");
        cities.add("BX");
        cities.add("Long Is");

        for (int i=0; i<cities.size(); i++){
            System.out.println("i is now " + i);
            System.out.println("My city is " + cities.get(i));

        }//end of for loop
    }//end of main
}//end of class
