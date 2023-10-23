package Tps.Tp7.Ej7;

import java.util.*;

public class SortedMapImpl<K extends Comparable<? super K>, V> extends TreeMap<K, V> implements SortedMap<K, V> {

    @Override
    public K firstKey() {
        return iterator().next().getKey();
    }

    @Override
    public V firstValue() {
        return iterator().next().getValue();
    }


    @Override
    public Iterator<Map.Entry<K, V>> iterator() {
        return entrySet().iterator();
    }

}