package Parciales.P1.PracticaFranco.Ej3;

public class ExtraQueso extends PizzaDecorator{

    public ExtraQueso(Pizza pizza){
        super(pizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " con Extra Queso";
    }

    @Override
    public double getPrice(){
        return super.getPrice() + 20;
    }
}
