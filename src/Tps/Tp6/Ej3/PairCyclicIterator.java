package Tps.Tp6.Ej3;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class PairCyclicIterator<E> implements Iterator<Pair<E>> {

    private Iterator<E> iterator;
    private final Iterable<E> collection;

    public PairCyclicIterator(Iterable<E> collection){
        this.collection = collection;
        this.iterator = collection.iterator();
    }
    @Override
    public boolean hasNext(){
        return collection.iterator().hasNext();
    }

    @Override
    public Pair<E> next(){
        if (!hasNext()){
            throw new NoSuchElementException();
        }
        E left, right;
        if (!iterator.hasNext()){
            iterator = collection.iterator();
        }
        left = iterator.next();
        if (!iterator.hasNext()){
            iterator = collection.iterator();
        }
        right = iterator.next();
        return new Pair<E>(left,right);

    }
}