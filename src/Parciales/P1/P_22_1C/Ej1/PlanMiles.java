package Parciales.P1.P_22_1C.Ej1;

public enum PlanMiles{

    CLUB1000(1000, 950, 0, 0),

    CLUB2000(2000,1750,1000,2),

    CLUB5000(5000,4400,2500,5),
    CLUB10000(10000, 14400, 10000, 6);


    private final int miles;
    private final double cost;
    private final int bonusMiles;
    private final int bonusMonths;

    private int getBonusMiles(int month){
        return (month >= 1 && month <= bonusMonths) ? bonusMonths : 0;
    }

    public int getMiles(int month){
        return miles + getBonusMiles(month);
    }

    public double getCost(){
        return cost;
    }
    PlanMiles(int miles, double price, int bonusMiles, int bonusMonths) {

        this.miles = miles;
        this.cost = price;
        this.bonusMiles = bonusMiles;
        this.bonusMonths = bonusMonths;

    }
}
