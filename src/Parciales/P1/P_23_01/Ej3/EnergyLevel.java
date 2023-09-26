package Parciales.P1.P_23_01.Ej3;

public enum EnergyLevel {

    LEVELA("A",1),
    LEVELB("B", 0.1),
    LEVELC("C", 0.2);

    private double tax;
    private String level;

    EnergyLevel(String level, double tax){
        this.level = level;
        this.tax = tax;
    }

    public double getTax(){
        return tax;
    }

    public String getLevel(){
        return level;
    }

}
