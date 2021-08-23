package fishing;
/*
This program allows a user to enter a type of fish and matches a lure to that fish.
 */

import java.util.Scanner;

public class FishingLureMatcher {

    public static void main(String[] args){

        System.out.println("Enter a type of fish to find a lure" + "\n Fish to select: Brook Trout, Rainbow Trout, and Pumpkinseed");
        Scanner scanner  = new Scanner(System.in);
        String name = scanner.nextLine();
        scanner. close();

        if(name.equalsIgnoreCase("Brook Trout")){
            System.out.println("Suggested Lure is: Rapala Original");
        }
        else if(name.equalsIgnoreCase("Rainbow Trout")){
            System.out.println("Suggested Lure is: Mepps Aglia");
        }
        else if(name.equalsIgnoreCase("Pumpkinseed")){
            System.out.println("Suggested Lure is: Culprit original Work");
        }
    }
}
