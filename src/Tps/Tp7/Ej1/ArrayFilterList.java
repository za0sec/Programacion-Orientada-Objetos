package Tps.Tp7.Ej1;

import java.util.ArrayList;

public class ArrayFilterList<T> extends ArrayList<T> implements FilterList<T>{

    @Override
    public FilterList<T> filter(Criteria<T> criteria) {
        FilterList<T> myList = new ArrayFilterList<>();
        for(T elem: this){
            if (criteria.satisfies(elem)){
                myList.add(elem);
            }
        }
        return myList;
    }
}
