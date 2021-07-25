package evenandodd;
//Check to see if a number is even or odd

import java.util.Scanner;

public class EvenAndOdd {

    public static void main(String[] args) {

        System.out.println("Enter a whole number:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        scanner.close();

        if (0 == number % 2){
            System.out.println( number + " is Even");
        }
        else {

            System.out.println(number + " is Odd");
        }
    }
}
