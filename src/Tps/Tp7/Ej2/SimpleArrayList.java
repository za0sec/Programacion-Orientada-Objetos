package Tps.Tp7.Ej2;

import java.util.ArrayList;

public class SimpleArrayList<E> extends ArrayList<E> implements SimpleList<E> {
    @Override
    public <T> T reduce(T initial, Criteria<E, T> criteria) {

        T cont = initial;

        for (E elem:this) {
            cont = criteria.toDo(cont, elem);
        }
        return cont;
    }
}
