package chapter2;

import java.util.Scanner;

public class MadLibs {
    public static void main(String... arg){
        // 1. Ask user for a season of the year
        System.out.println("Enter a season of the year");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.next();

        //2. Ask user for whole number
        System.out.println("Enter a whole number");
        int number = scanner.nextInt();

        // 3. Ask user for an adjective
        System.out.println("Enter an adjective");
        String adjective = scanner.next();
        scanner.close();

        // 4. Print output with "On a [adjective] [season of the year] day, I drink a minimum of [whole number] cups of
        System.out.println("On a " + adjective + " " + season +
                " day, I drink a minimum of " + number +
                " cups of coffee.");


    }

}
