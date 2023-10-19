package Tps.Tp6.Ej8;

import java.util.Collection;
import java.util.Map;

public interface Bag<T>{

    void add(T elem);
    void remove(T elem);
    int size();
    int sizeDistinct();
    boolean contains(T s);
    int count(T s);

}
