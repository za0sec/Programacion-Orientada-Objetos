package Parciales.P2.Repaso.Ej3;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.function.Predicate;

public class FilteredKeyMapIterator<K,V> implements Iterator<K> {

    private K actualKey;

    private Map<K,V> map;
    private Predicate<K> pred;
    private final Iterator<Map.Entry<K,V>> it;
    public FilteredKeyMapIterator(Map<K,V> map , Predicate<K> pred){
        this.pred = pred;
        this.map = map;
        this.it = map.entrySet().iterator();
    }

    @Override
    public boolean hasNext() {
        return it.hasNext();
    }

    @Override
    public K next() {
        do{
            if (!hasNext()){
                throw new NoSuchElementException();
            }
            actualKey = it.next().getKey();
        }while(!pred.test(actualKey));
        return actualKey;
    }

    public V getValue(){
        if (actualKey == null){
            throw new NoSuchElementException();
        }
        return map.get(actualKey);
    }
}
