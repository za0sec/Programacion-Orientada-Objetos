package Parciales.P2.Rec2_21_02.Ej2;

import java.util.Comparator;

public class Landmark implements Comparable<Landmark>{

    private String name;
    private Double rating;

    public Landmark(String name, double rating){
        this.name = name;
        this.rating = rating;
    }


    @Override
    public String toString(){
        return String.format("# %s # %.1f #", name, rating);
    }

    @Override
    public int compareTo(Landmark o) {
        int cmp = o.rating.compareTo(rating);
        if (cmp != 0) {
            return cmp;
        }
        return name.compareTo(o.name);
    }
}
