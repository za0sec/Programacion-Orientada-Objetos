package Parciales.P2.Repaso.Ej4;

import java.util.Comparator;

public class Passenger{

    private int row;
    private String name;

    private PassengerCategory category;

    public Passenger(String name, int row, PassengerCategory category) {
        this.name = name;
        this.row = row;
        this.category = category;
    }

    public PassengerCategory getCategory() {
        return category;
    }

    public String getName() {
        return name;
    }

    public int getRow() {
        return row;
    }

}