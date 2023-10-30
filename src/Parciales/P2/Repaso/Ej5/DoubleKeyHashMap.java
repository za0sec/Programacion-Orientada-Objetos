package Parciales.P2.Repaso.Ej5;

import java.util.HashMap;
import java.util.Map;

//PREGUNTAR IMPORTANTE EJERCICIO ESTA HECHO CON PAIR<K1, K2> y lo pense distinto.
public class DoubleKeyHashMap<K1, K2, V> implements DoubleKeyMap<K1, K2, V>{

    private int size;
    private Map<K1, Map<K2, V>> map = new HashMap<>();

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return map.isEmpty();
    }

    @Override
    public boolean containsKey(K1 firstKey, K2 secondKey) {
        return map.containsKey(firstKey) && map.get(firstKey).containsKey(secondKey);
    }

    @Override
    public boolean containsValue(V value) {
        for(Map.Entry<K1, Map<K2, V>> entry : map.entrySet()){
            if (entry.getValue().containsValue(value)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public V get(K1 firstKey, K2 secondKey) {
        return map.get(firstKey).get(secondKey);
    }

    @Override
    public void put(K1 firstKey, K2 secondKey, V value) {
        Map<K2, V> innerMap = map.getOrDefault(firstKey, new HashMap<>());
        if (innerMap.put(secondKey, value) == null){
            size++;
        }
        map.putIfAbsent(firstKey, innerMap);
    }
}
