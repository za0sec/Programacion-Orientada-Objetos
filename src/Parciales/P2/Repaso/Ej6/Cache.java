package Parciales.P2.Repaso.Ej6;

import java.util.Map;

public interface Cache<K, V> extends Map<K,V> {

    void put(String user, String date, K key, V value);

    V get(String user, String date, K key);

}

