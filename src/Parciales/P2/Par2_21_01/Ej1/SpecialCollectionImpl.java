package Parciales.P2.Par2_21_01.Ej1;

import java.util.Comparator;
import java.util.TreeSet;
import java.util.function.Predicate;

public class SpecialCollectionImpl<E extends Comparable<? super E>> extends TreeSet<E> implements SpecialCollection<E> {
    private E lastRemoved;

    public SpecialCollectionImpl(){
        super(Comparator.reverseOrder());
    }

    @Override
    public void deleteFirst() {
        deleteFirst(first -> true);
    }

    @Override
    public void deleteFirst(Predicate<E> pred) {
        if (pred.test(this.first())){
            lastRemoved = this.first();
            this.remove(this.first());
        }
    }

    @Override
    public void undoDeleteFirst() {
        if (lastRemoved == null){
            throw new NothingToUndoException();
        }
        this.add(lastRemoved);
        lastRemoved = null;
    }

}
