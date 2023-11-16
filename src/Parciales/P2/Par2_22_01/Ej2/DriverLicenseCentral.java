package Parciales.P2.Par2_22_01.Ej2;

import java.time.LocalDate;
import java.util.*;

public class DriverLicenseCentral {
    Map<String, Driver> myMap = new HashMap<>();


    public void register(String name, int points){
        myMap.putIfAbsent(name, new Driver(name, points));
    }

    public int points(String name){
        return myMap.get(name).getPoints();
    }

    public void infraction(String name, LocalDate date, Infraction infraction){
        who(name).add(date, infraction);
    }

    Set<LocalDate> getInfractionDates(String name){
        return who(name).getInfractionDates();
    }

    Collection<Infraction> getInfractionTypes(String name){
        return who(name).getInfractionTypes();
    }

    private Driver who(String name){
        if (!myMap.containsKey(name)){
            throw new IllegalArgumentException("Driver does not exists");
        }
        return myMap.get(name);
    }



}
