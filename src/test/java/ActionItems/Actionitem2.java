package ActionItems;

import java.util.ArrayList;

public class Actionitem2 {

    public static void main(String[] args) {

        gradingHomeworkMethod();
        citiesLoopHomework();

    }//end of main
public static void gradingHomeworkMethod() {

    //int Grade = 87;
    //int Grade = 65;
    //int Grade = 74;
    //int Grade = 98;
    int Grade = 70;

    if (Grade >= 90 && Grade <= 100) {
        System.out.println("The grade is A");
    } else if (Grade >= 80 && Grade < 90) {
        System.out.println("The grade is B");
    } else if (Grade >= 70 && Grade < 80) {
        System.out.println("The grade is C");
    } else if (Grade >= 60 && Grade < 70) {
        System.out.println("The grade is D");
    } else {
        System.out.println("The grade is F");
    }// end of if else statements

}//end of gradingHomeworkMethod

    public static void citiesLoopHomework() {

        ArrayList<String> cities = new ArrayList<>();
        cities.add("Brooklyn");
        cities.add("Queens");
        cities.add("Manhattan");
        cities.add("Staten Island");

        for (int i = 0; i < cities.size(); i++) {
            if (cities.get(i) == "Brooklyn") {
                System.out.println("My city is " + cities.get(i));
            } else if (cities.get(i) == "Manhattan") {
                System.out.println("My city is " + cities.get(i) + " if my city is not Brooklyn");
            }
        }//end of for loop

    }//end of citiesLoopHomework

}//end of class
