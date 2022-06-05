package Day4_may7;

public class SplitMessage {

    public static void main(String[] args) {
        //declare string variable
        String splitMsg = "My Name Is John";
        //String splitMsg = "My_Name_Is_John";  underscore can also be used as space

        //declare and array of string to store the string split
        String[] splitMsgArray = splitMsg.split(" ");   //"_" can be use from line 8

        //print out John to the console
        System.out.println("My first name is " + splitMsgArray[3]);





    }//end of main
}//end of class
