package Tps.Tp6.Ej10;

import com.sun.source.tree.Tree;

import java.util.*;

public class MultiSortedCollectionImpl<T> implements MultiSortedCollection<T>{

    private Set<T> mySet = new HashSet<>();
    private Map<Comparator<T>, Set<T>> myMap = new HashMap<>();
    @Override
    public void add(Comparator<T> comp) {
        TreeSet<T> tree = new TreeSet<>(comp);
        tree.addAll(mySet);
        myMap.put(comp, tree);
    }

    @Override
    public void add(T elem) {
        mySet.add(elem);
        if (!mySet.isEmpty()){
            for(Set<T> set: myMap.values()){
                set.add(elem);
            }
        }
    }

    @Override
    public void remove(T elem) {
        mySet.remove(elem);
        if (!mySet.isEmpty()) {
            for (Set<T> set : myMap.values()) {
                set.remove(elem);
            }
        }
    }

    @Override
    public Iterable<T> iterable(Comparator<T> comp) {
        if (!myMap.containsKey(comp)){
            throw new IllegalStateException();
        }
        return myMap.get(comp);
    }
}
