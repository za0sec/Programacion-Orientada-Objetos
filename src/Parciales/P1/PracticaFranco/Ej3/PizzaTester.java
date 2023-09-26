package Parciales.P1.PracticaFranco.Ej3;

public class PizzaTester {

    public static void main(String[] args) {
        // Pizza a la parrilla con Tomate
        Pizza pizza1 = new Tomate(new PizzaALaParrilla());
        // Pizza a la parrilla con Tomate con Cebolla con Extra queso
        Pizza pizza2 = new ExtraQueso(new Cebolla(new Tomate(new PizzaALaParrilla())));
        // Pizza al horno con Cebolla con Extra queso
        Pizza pizza3 = new ExtraQueso(new Cebolla(new PizzaAlHorno()));
        System.out.println(pizza1.getDescription() + ": $" + pizza1.getPrice());
        System.out.println(pizza2.getDescription() + ": $" + pizza2.getPrice());
        System.out.println(pizza3.getDescription() + ": $" + pizza3.getPrice());
    }

}

