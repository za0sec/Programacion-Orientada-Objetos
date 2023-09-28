package Parciales.P1.P_2022_02.Ej3;

public enum Reciever {

    PERSONAL("PERSONAL",50000, 12),
    VEHICLE("VEHICLE",300000, 24),
    HOME("HOME",1000000, 360);

    private double amount;
    private String name;
    private int maxStatement;
    Reciever(String name, double amount, int maxStatement){
        this.name = name;
        this.amount = amount;
        this.maxStatement = maxStatement;
    }

    public double getAmount(){
        return amount;
    }
    public String getName(){
        return name;
    }
    public int getMaxStatement(){
        return maxStatement;
    }

}
