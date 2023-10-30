package Parciales.P2.Repaso.Ej2;

import java.util.Iterator;
import java.util.LinkedList;
public class ReversedListImpl<E> extends LinkedList<E> implements ReversedList<E> {

    public Iterator<E> defaultIterator() {
        return super.iterator();
    }

    @Override
    public Iterator<E> iterator() {
        return descendingIterator();
    }

}

