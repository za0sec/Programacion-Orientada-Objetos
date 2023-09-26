package Parciales.P1.P_23_01.Ej3;

public enum Warranty {

    BASIC(120, 1),
    PREMIUM(0, 0.2);

    private double set;
    private int plus;


    Warranty(int plus, double set){
        this.set = set;
        this.plus = plus;
    }
    public int getPlus(){
        return plus;
    }
    public double getSet(){
        return set;
    }

}
