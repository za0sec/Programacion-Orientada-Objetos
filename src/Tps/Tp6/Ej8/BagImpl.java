package Tps.Tp6.Ej8;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

public class BagImpl<String> implements Bag<String>{
    Map<String, Integer> map = new HashMap<>();

    private int allSize = 0;


    @Override
    public void add(String elem) {
        if (!map.containsKey(elem)){
            map.put(elem, 1);
        }else{
            map.put(elem, map.get(elem)+1);
        }

        allSize++;

    }

    @Override
    public void remove(String elem) {
        if (!map.containsKey(elem)) {
            throw new NoSuchElementException();
        }
        if (map.get(elem) == 1) {
            map.remove(elem);
        } else {
            map.put(elem, map.get(elem) - 1);
        }
    }


    @Override
    public int size() {
        return allSize;
    }

    @Override
    public int sizeDistinct() {
        return map.size();
    }

    @Override
    public boolean contains(String s) {
        return map.containsKey(s);
    }

    @Override
    public int count(String s) {
        if (!map.containsKey(s)) {
            return 0;
        }
        return map.get(s);

    }
}
