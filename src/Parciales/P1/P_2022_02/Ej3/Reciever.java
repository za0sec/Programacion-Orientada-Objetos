package Parciales.P1.P_2022_02.Ej3;
public enum Reciever {

    PERSONAL(50000, 12),
    VEHICLE(300000, 24),
    HOME(1000000, 360);

    private double amount;
    private String name;
    private int maxStatement;
    Reciever(double amount, int maxStatement){
        this.amount = amount;
        this.maxStatement = maxStatement;
    }
    public boolean CheckThings(double amount, int statement){
        return this.amount >= amount && maxStatement >= statement;
    }
}