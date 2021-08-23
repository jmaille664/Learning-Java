package Inheritance;

public class WeddingCake extends Cake{

    private int tiers;

    public WeddingCake(){
        super("Vanilla with Vanilla Buttercream");
    }

    public int getTiers() {
        return tiers;
    }

    public void setTiers(int tiers) {
        this.tiers = tiers;
    }
}
