package Tps.Tp7.Ej2;

import java.util.*;
import java.util.ArrayList;

public interface SimpleList<E> extends List<E> {

  <T>  T reduce(T initial, Criteria<E, T> criteria);

}
