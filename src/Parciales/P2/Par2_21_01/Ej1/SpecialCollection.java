package Parciales.P2.Par2_21_01.Ej1;

import java.util.Collection;
import java.util.Comparator;
import java.util.function.Predicate;

public interface SpecialCollection<E extends Comparable<? super E>> extends Collection<E> {

    public void deleteFirst();
    public void deleteFirst(Predicate<E> pred);

    public void undoDeleteFirst();

}
