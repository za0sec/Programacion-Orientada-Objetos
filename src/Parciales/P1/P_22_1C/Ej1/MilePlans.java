package Parciales.P1.P_22_1C.Ej1;

public enum MilePlans {

    CLUB1000(1000, 950, 0, 0),
    CLUB2000(2000, 1750, 1000, 2),
    CLUB5000(5000, 4400, 2500, 5),
    CLUB10000(10000, 14400, 10000, 6);

    private int miles;
    private double cost;
    private int extraMiles;
    private int months;

    MilePlans(int miles, double cost, int extraMiles, int months){
        this.miles = miles;
        this.cost = cost;
        this.extraMiles = extraMiles;
        this.months = months;
    }

    public double getCost() {
        return cost;
    }

    public int getMiles(int month) {
        int ret = miles;
        if (month <= months){
            ret += extraMiles;
        }
        return ret;
    }
}
