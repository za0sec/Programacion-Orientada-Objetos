package Parciales.P2.Repaso.Ej1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SimpleArrayList<E> extends ArrayList<E> implements SimpleList<E>{

//PREGUNTAR PORQUE SI ACA DEFINO  UN HASHMAP SE CREA UN BUCLE.
SimpleList<E> myList = new SimpleArrayList<>();


    @Override
    public <K> Map<K, E> toMap(Operation<E, K> operation) {
        Map<K, E> ret = new HashMap<>();
        for (E elem : this) {
            ret.put(operation.make(elem), elem);
        }
        return ret;
    }

}


