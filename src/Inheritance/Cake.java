package Inheritance;

//Superclass
public class Cake {
    private String flavor;
    private int price;

    //Constructor to set cake
    public Cake(String flavor){
        setFlavor(flavor);
        setPrice(20);
    }

    //Getter and Setter Methods
    public String getFlavor(){
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
