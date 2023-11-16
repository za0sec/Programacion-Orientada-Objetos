package Parciales.P2.Par2_22_01.Ej2;

import java.time.LocalDate;
import java.util.*;

public class Driver {

    private String name;

    private final Map<LocalDate, Infraction> infractions = new TreeMap<>();
    private int points;

    public Driver(String name, int points){
        this.name = name;
        this.points = points;
    }

    public void add(LocalDate date, Infraction infraction){
        if (infractions.containsKey(date)){
            throw new IllegalArgumentException("Infraction already exists for driver and date");
        }
        infractions.put(date, infraction);
        points -= infraction.getPoints();

    }

    public Set<LocalDate> getInfractionDates() {
        return infractions.keySet();
    }

    public Collection<Infraction> getInfractionTypes(){
        return infractions.values();
    }

    public int getPoints(){
        return points;
    }

}
