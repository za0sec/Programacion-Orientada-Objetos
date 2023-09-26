package Parciales.P1.PracticaFranco.Ej3;

public class Tomate extends PizzaDecorator{

    public Tomate(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription(){
        return super.getDescription() + " con Tomate";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 30;
    }
}
