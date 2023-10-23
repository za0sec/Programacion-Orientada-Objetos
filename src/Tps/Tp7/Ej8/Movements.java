package Tps.Tp7.Ej8;

public class Movements {

    private double price;
    private String status;

    public Movements(double price, String status){
        this.price = price;
        this.status = status;
    }

    public double getBalance(){
        return price;
    }
    @Override
    public String toString() {
        return String.format("%s $%.2f", status, price);
    }
}
