package Inheritance;
//Program to run different types of cake and prices/flavors

public class TasteTester {

    public static void main(String[] args){

        Cake cake = new Cake("Chocolate with Chocolate Frosting");
        cake.setPrice(45);
        System.out.println("Cake Flavor is: " + cake.getFlavor());
        System.out.println("Cake price is: " + cake.getPrice());

        BirthdayCake birthdayCake = new BirthdayCake();
        birthdayCake.setPrice(25);
        System.out.println("Cake flavor is: "+ birthdayCake.getFlavor());
        System.out.println("Cake price is: " + birthdayCake.getPrice());

        WeddingCake weddingCake = new WeddingCake();
        weddingCake.setPrice(100);
        System.out.println("Cake flavor is: " + weddingCake.getFlavor());
        System.out.println("Cake price is: " + weddingCake.getPrice());
    }
}
