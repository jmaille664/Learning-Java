package array;

import java.util.Scanner;

public class DayOfTheWeek {

    public static void main(String[] args){

        //Array to hold number of days in a week
        String [] dayOfWeek = new String[8];

        dayOfWeek[0] = "Null";
        dayOfWeek[1] = "Monday";
        dayOfWeek[2] = "Tuesday";
        dayOfWeek[3] = "Wednesday";
        dayOfWeek[4] = "Thursday";
        dayOfWeek[5] = "Friday";
        dayOfWeek[6] = "Saturday";
        dayOfWeek[7] = "Sunday";

        //Scanner to have the user input a number and find the array from day of the week
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number from 1-7 for the day of the week");
        int index = input.nextInt();
        input.close();

        System.out.println("The day of the week is " + dayOfWeek[index]);
    }
}
