package Tps.Tp7.Ej6;

import java.util.*;

public class MultiMapImpl<K, V extends Comparable<? super V>> implements MultiMap<K, V>  {

    private HashMap<K, TreeSet<V>> internalMap = new HashMap<>();
    private int count = 0;



    @Override
    public void put(K key, V value) {
        internalMap.putIfAbsent(key, new TreeSet<>(Comparator.reverseOrder()));
        internalMap.get(key).add(value);
        count++;
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public int size(K key) {
        return internalMap.getOrDefault(key, new TreeSet<>()).size();
    }

    @Override
    public void remove(K key) {
        internalMap.remove(key);
    }

    @Override
    public void remove(K key, V value) {
        internalMap.getOrDefault(key, new TreeSet<>()).remove(value);
    }
    @Override
    public Iterable<V> get(K key) {
        return internalMap.get(key);
    }
}
