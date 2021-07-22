package PhoneBill;

import java.util.Scanner;

public class PhoneBillCalculator {

    public static void main(String[] args){

     Scanner scanner = new Scanner (System.in);

        System.out.println("Enter base cost of your plan");
        double planFee = scanner.nextDouble();


        System.out.println("Enter overage minutes");
        double overageMinutes = scanner.nextDouble();

        scanner.close();

       double overageFee = calculateOverage(overageMinutes);
       double tax = calculateTax(planFee + overageMinutes);

        calculateFinalBill(planFee,overageMinutes,tax);

    }

    public static double calculateTax(double calculateTax) {

        double taxFee = .15;
        double tax = taxFee * calculateTax;
        return tax;
    }

    public static double calculateOverage(double overageMinutes) {

        double overageFee =.25;
        double overage = overageFee * overageMinutes;
        return overage;
    }

    public static void calculateFinalBill(double overage, double tax, double planFee){
        double finalBill =  overage + tax + planFee;
        System.out.println("Phone bill statement");
        System.out.println("Plan " + "$" + planFee);
        System.out.println("Tax " + "$" tax);
        System.out.println("Overage " + "$" + overage);
        System.out.println("Final Bill " + "$" + finalBill);
    }
}













