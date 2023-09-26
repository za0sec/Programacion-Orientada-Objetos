package Parciales.P1.PracticaFranco.Ej3;

public class PizzaAlHorno implements Pizza{

    @Override
    public String getDescription() {
        return "Pizza Al Horno";
    }

    @Override
    public double getPrice() {
        return 100;
    }
}
