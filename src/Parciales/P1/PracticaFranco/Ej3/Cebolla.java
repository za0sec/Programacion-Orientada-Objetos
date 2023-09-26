package Parciales.P1.PracticaFranco.Ej3;

public class Cebolla extends PizzaDecorator{


    public Cebolla(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " con Cebolla";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 10;
    }
}
