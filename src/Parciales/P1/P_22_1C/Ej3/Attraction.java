package Parciales.P1.P_22_1C.Ej3;

import java.util.Objects;

public class Attraction {
    private final String name;

    public Attraction(String name){
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Attraction attraction))
            return false;
        return name.equals(attraction.name);

    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return String.format("%s", name);
    }


}
