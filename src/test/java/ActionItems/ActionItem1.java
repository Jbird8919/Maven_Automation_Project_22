package ActionItems;

import java.util.ArrayList;

public class ActionItem1 {
    public static void main(String[] args) {
        //ActionItem1: Using Array(linear&ArrayList) and loops.
        //Create sets of data and iterate through the data and print out the results.

        //Using String country and int countryCode with for loop and ArrayList.
        //Create at least 4 data for each variable and iterate through each to print out the i
        //for both variables. For instance System.out.println("My country is " + country.get(i) + " and my
        //country code is " + countryCode.get(i));

        ArrayList<String> country = new ArrayList<>();

        country.add("Usa"); //index 0
        country.add("China"); //index 1
        country.add("Russia"); //index 2
        country.add("Greece"); //index 3
        country.add("Japan"); //index 4

        ArrayList<Integer> countryCode = new ArrayList<Integer>();

        countryCode.add(555); //index 0
        countryCode.add(666); //index 1
        countryCode.add(777); //index 2
        countryCode.add(888); //index 3
        countryCode.add(999); //index 4

        for (int i=0;i<=4;i++){
            System.out.println("My country is " + country.get(i) + " My country code is " + countryCode.get(i));
        }//end of for loop

        //---------------------------------------------------------------------------------------------------------

        //Using String[] region and int[] areaCode with while loop and linear array.
        //Create at least 4 data for each variable and iterate through each to print out the i
        //for both variables. For instance System.out.println("My region is " + region[i] + " and my area
        //code is " + areaCode[i];

        String[] region = new String[]{"New York","Beijing","Moscow","Athens","Tokyo"};
        int[] areaCode = new int[]{111,222,333,444,555};

        int i=0;
        while(i<region.length){
            System.out.println("My region is " + region[i] + " area code " + areaCode[i]);
            i=i+1;

        }//end of while loop
    }//end of main
}//end of class
