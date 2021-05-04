package changeforadollar;

import java.util.Scanner;

/*
Change for a Dollar Game
Program that asks the user to enter the quantities for the following coins.

How many nickels do you have?
How many dimes do you have?
And then, how many quarters?

The program is going to do is count up the value of all of the change that they answered.

If it's exactly one dollar then they win the game.
If it's more than one dollar, then the program will tell them that it's more than one dollar and how much they went over.
If it's less than one dollar, the program will tell them how much they went under.
 */
public class ChangeForADollarGame {

    public static void main(String[] args){

    double pennies = .01;
    double nickel = .05;
    double dimes = .10;
    double quarters = .25;
    int dollar = 1;

        System.out.println("Ready to play Change For A Dollar Game?");

        System.out.println("Enter how many pennies you have:");
        Scanner scanner = new Scanner(System.in);
        double penniesChange = scanner.nextDouble();


    System.out.println("Enter how many nickels you have:");
    double nickelChange = scanner.nextDouble();

    System.out.println("Enter how many dimes you have:");
    double dimesChange = scanner.nextDouble();

    System.out.println("Enter how many quarters you have:");
    int quartersChange = scanner.nextInt();

    scanner.close();

    double total = penniesChange * pennies + nickelChange * nickel + dimesChange * dimes + quartersChange * quarters;

        if(total < dollar) {
double shortChange = dollar - total;
            System.out.println("Sorry, you lose! You were short by " + shortChange + " cents");
        }
    else if (total > dollar) {
        double toMuchChange = total - dollar;
System.out.println("Sorry, you lose! You were above by " + toMuchChange + " cents");
    }
    else{
            System.out.println("Congratulations! You Win!");

    }
}
}

