package Parciales.P1.P_23_01.Ej3;

public class Product {

    private String name;
    private Brand brand;
    private double price;

    public Product(String name, Brand brand, double price){

        this.name = name;
        this.brand = brand;
        this.price = price;

    }

    @Override
    public String toString() {
        return String.format("%s from %s with price $%.2f", name, brand, price);
    }

    public double getFinalPrice(){
        return price;
    }
    public double getFinalPrice(Warranty w) {
        price = ((price * w.getSet()) + w.getPlus());
        return price;
    }


}
