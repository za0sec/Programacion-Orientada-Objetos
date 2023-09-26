package Parciales.P1.P_23_01.Ej1;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.UnaryOperator;

public class CustomIndex<T> implements Iterable<T>{

    private final T[] v;

    private final int start;
    private final int end;

    private UnaryOperator<Integer> nextIndex;


    public CustomIndex(T[] v, int start, int end, UnaryOperator<Integer> nextIndex){
        if (start >= end) {
            throw new IllegalArgumentException("Invalid combination of start and end index");
        }
        this.v = v;
        this.start = start;
        this.end = end;
        setNextIndex(nextIndex);
    }

    public void setNextIndex(UnaryOperator<Integer> nextIndex){
        this.nextIndex = nextIndex;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<>() {
            private int current = start;
            private final UnaryOperator<Integer> itNextIndex = nextIndex;
            @Override
            public boolean hasNext() {
                return current <= end;
            }

            @Override
            public T next() {
                if (!hasNext()){
                    throw new NoSuchElementException();
                }
                T ret = v[current];
                current = itNextIndex.apply(current);
                return ret;
            }
        };
    }
}
