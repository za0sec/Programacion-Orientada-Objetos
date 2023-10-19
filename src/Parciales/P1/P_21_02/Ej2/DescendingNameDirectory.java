package Parciales.P1.P_21_02.Ej2;

import java.util.Comparator;

public class DescendingNameDirectory extends Directory {

    public DescendingNameDirectory(int limit) {
        super(limit);
    }

    @Override
    public Person[] persons() {
        return persons(Comparator.reverseOrder());
    }

}


