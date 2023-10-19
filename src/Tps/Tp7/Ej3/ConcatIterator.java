package Tps.Tp7.Ej3;
//preguntar
import java.util.*;

public class ConcatIterator<E> implements Iterator<E> {

    List<Iterator<E>> listIterators = new ArrayList<>();
    private static final int itLenght = 2;
    private int index;

    public ConcatIterator(Iterator<E> iterator1, Iterator<E> iterator2){
        listIterators.add(iterator1);
        listIterators.add(iterator2);
            this.index = 0;
    }

    @Override
    public boolean hasNext() {
        if (index < itLenght && !listIterators.get(index).hasNext()) {
            index++;
        }
        return index < listIterators.size();
    }

    @Override
    public E next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return listIterators.get(index).next();
    }
}
