package PhoneBill2;

public class PhoneBill {

    private int id;
    private int baseCost;
    private double allottedMinutes;
    private int minutesUsed;

    public PhoneBill(){
        id =0;
        baseCost =74;
        allottedMinutes =100;
        minutesUsed =0;

    }

    public PhoneBill(int id){
        this.id = id;
        baseCost =0;
        allottedMinutes =0;
        minutesUsed =0;
    }

    public PhoneBill(int id, int baseCost, double allottedMinutes, int minutesUsed){
        this.id=id;
        this.baseCost=baseCost;
        this.allottedMinutes=allottedMinutes;
        this.minutesUsed=minutesUsed;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getBaseCost(int baseCost){
        return baseCost;
    }

    public void setBaseCost(int baseCost){
        this.baseCost = baseCost;
    }
    public double getallotedMinutes(){
        return allottedMinutes;
    }

    public void setAllottedMinutes(double allottedMinutes){
        this.allottedMinutes = allottedMinutes;
    }

    public double getminuetsUsed(){
        return minutesUsed;
    }

    public void setMinutesUsed(double minutesUsed){
        this.allottedMinutes = allottedMinutes;
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
}
