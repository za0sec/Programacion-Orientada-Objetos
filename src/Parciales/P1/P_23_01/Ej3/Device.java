package Parciales.P1.P_23_01.Ej3;

public class Device extends Product{

    private double price;
    private EnergyLevel level;
 //   private Brand brand;

    public Device(String name, Brand brand, double price, EnergyLevel level){
        super(name, brand, price);
        this.level = level;
        this.price = price + (price - brand.applyDiscount(price));
    }


    public double getFinalPrice() {
        return price;
    }

    @Override
    public String toString(){
        return String.format("[Device] " + super.toString() + String.format(" with Energy Label %s", level.getLevel()));
    }


}
