package Parciales.P1.PracticaFranco.Ej3;

public class PizzaALaParrilla implements Pizza{
    @Override
    public String getDescription() {
        return "Pizza A La Parrilla";
    }

    @Override
    public double getPrice() {
        return 150;
    }
}