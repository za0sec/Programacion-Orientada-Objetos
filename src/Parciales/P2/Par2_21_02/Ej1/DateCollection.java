package Parciales.P2.Par2_21_02.Ej1;

import java.time.LocalDate;
import java.util.*;

public class DateCollection<E extends Comparable<? super E>> extends TreeSet<DateElement<E>>{

    private LocalDate date;

    public DateCollection(LocalDate date){
        this.date = date;
    }

    @Override
    public boolean add(DateElement<E> dateElem){
        if (this.contains(dateElem)){
            return false;
        }
        if (dateElem.getDate().isAfter(date)){
            throw new IllegalArgumentException();
        }
        return super.add(dateElem);
    }

    public ArrayList<E> getElementsBeforeToday() {
        return getElements(date);
    }
    public ArrayList<E> getElements(LocalDate maxDate){
        ArrayList<E> ret = new ArrayList<E>();
        for (DateElement<E> elem : this){
            if (elem.getDate().isBefore(maxDate)) {
                ret.add(elem.getElem());
            }
        }
        return ret;
    }

    public ArrayList<E> getElementsBefore(LocalDate maxDate) {
        return getElements(maxDate);
    }

    public void changeToday(LocalDate date){
        this.date = date;
    }


}
