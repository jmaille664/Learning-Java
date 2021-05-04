package math;

import java.util.Scanner;

public class LargestNumberOutOf3 {

    public static void main(String[] args) {

        System.out.println("Enter a Whole Number:");
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();

        System.out.println("Enter a whole number");
        int number2 = scanner.nextInt();

        System.out.println(" Enter a whole number");
        int number3 = scanner.nextInt();

        scanner.close();

        if (number1 > number2 && number1 > number3)
        {
            System.out.println(number1 + " Is the largest number");
        }
        else if (number2 > number1)
        {
            System.out.println( number2 + "Is the largest number");
        }
        else
        {
            System.out.println(number3 + "Is the largest number");
        }

    }
}