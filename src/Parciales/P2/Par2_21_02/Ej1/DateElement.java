package Parciales.P2.Par2_21_02.Ej1;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.Iterator;

public class DateElement<E extends Comparable<? super E>> implements Comparable<DateElement<E>> {

    private E elem;
    private LocalDate date;

    public DateElement(E elem, LocalDate date){
        this.elem = elem;
        this.date = date;
    }

    public LocalDate getDate() {
        return date;
    }

    public E getElem(){
        return elem;
    }

    @Override
    public int compareTo(DateElement<E> o) {
        int cmp = date.compareTo(o.date);
        if (cmp != 0){
            return cmp;
        }
        return o.elem.compareTo(elem);
    }
}
