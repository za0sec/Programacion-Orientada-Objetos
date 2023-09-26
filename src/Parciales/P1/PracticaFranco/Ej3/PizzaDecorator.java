package Parciales.P1.PracticaFranco.Ej3;

public abstract class PizzaDecorator implements Pizza {
    protected Pizza pizza;

    public PizzaDecorator(Pizza pizza){
        this.pizza = pizza;
    }
    @Override
    public double getPrice() {
        return pizza.getPrice();
    }

    @Override
    public String getDescription() {
        return pizza.getDescription();
    }
}
