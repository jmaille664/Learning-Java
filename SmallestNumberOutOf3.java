package math;

import java.util.Scanner;

public class SmallestNumberOutOf3 {

    public static void main(String [] args){

        System.out.println("Enter a whole number:");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();

        System.out.println("Enter a whole number:");
        int num2 = scanner.nextInt();

        System.out.println("Enter a whole number:");
        int num3 = scanner.nextInt();

        scanner.close();

        if (num1 < num2 && num1 < num3)
        {
            System.out.println(num1 + " Is the smallest number");
        }
        else if (num2 < num1)
        {
            System.out.println(num2 + " Is the smallest number");
        }
        else
        {
            System.out.println(num3 + " Is the smallest number");
        }

    }
}
