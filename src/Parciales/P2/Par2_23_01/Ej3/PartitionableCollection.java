package Parciales.P2.Par2_23_01.Ej3;

import Tps.Tp7.Ej1.ArrayFilterList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class PartitionableCollection<E> extends ArrayList<E> {

    public PartitionableCollection<E> getSelected(Predicate<E> pred){
        PartitionableCollection<E> ret = new PartitionableCollection<>();
        for(E i:this){
            if (pred.test(i)){
                ret.add(i);
            }
        }
        return ret;
    }

    public PartitionableCollection<E> getRejected(Predicate<E> pred){
        return getSelected(pred.negate());
    }

}
