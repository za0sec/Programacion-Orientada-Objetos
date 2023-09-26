package Parciales.P1.P_23_01.Ej3;

public class Accesory extends Product{

    private String description;
    private double price;
    private Brand brand;
    public Accesory(String name, Brand brand, double price, String description) {
        super(name, brand, price);
        this.description = description;
        this.price = price + (price - brand.applyDiscount(price));
        this.brand = brand;
    }



    @Override
    public String toString(){
        return String.format("[Accsessory] " + super.toString() + String.format(" with feature %s", description));
    }

}
