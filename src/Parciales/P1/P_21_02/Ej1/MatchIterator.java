package Parciales.P1.P_21_02.Ej1;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Predicate;
public class MatchIterator<T> implements Iterator<MatchElement<T>> {
    private T[] v;
    private int idx = 0;
    private Predicate<T> pred;
    private MatchElement<T> match;

    public MatchIterator(T[] v, Predicate<T> pred){
        this.v = v;
        this.pred = pred;
    }
    @Override
    public boolean hasNext(){
        return idx < v.length;
    }
    @Override
    public MatchElement<T> next(){
        if (!hasNext()){
            throw new NoSuchElementException();
        }
        return new MatchElement(v, pred, idx++);
    }
}
