package Parciales.P2.Repaso.Ej4;

import java.util.*;

public class RowBoardingFlight extends BoardingFlight{


    public RowBoardingFlight() {
        super(new Comparator<Passenger>() {
            @Override
            public int compare(Passenger o1, Passenger o2) {
                int cmp = Integer.compare(o1.getRow(), o2.getRow());
                if (cmp != 0){
                    return cmp;
                }
                return o1.getName().compareTo(o2.getName());
            }
        });
    }
}