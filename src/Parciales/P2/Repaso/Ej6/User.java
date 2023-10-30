package Parciales.P2.Repaso.Ej6;

import java.util.*;

public class User {

    private final String name;

    private Map<String, Date> dateMap = new HashMap<>();

    public User(String name){
        this.name = name;
    }

    public void setDate(String date){
        dateMap.putIfAbsent(date,new Date(date) );
    }

    public int getRead(String date){
        Date myDate = dateMap.get(date);
        if (myDate == null) {
            throw new IllegalArgumentException("Fecha no encontrada: " + date);
        }
        return myDate.getRead();
    }

    public int getWrite(String date){
        return dateMap.get(date).getWrite();
    }

    public void sumWrite(String date){
        dateMap.get(date).sumWrite();
    }

    public void sumRead(String date){
        dateMap.get(date).sumRead();
    }

    @Override
    public boolean equals(Object o) {
       return (o == this) || (o instanceof User that && that.name.equals(this.name));
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }



}
