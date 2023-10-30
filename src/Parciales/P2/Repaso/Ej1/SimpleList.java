package Parciales.P2.Repaso.Ej1;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

public interface SimpleList<E> extends List<E>{

    <K> Map<K, E> toMap(Operation<E, K> operation);

}
