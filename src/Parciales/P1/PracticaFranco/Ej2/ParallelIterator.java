/*package Parciales.P1.PracticaFranco.Ej2;

import java.util.NoSuchElementException;

import java.util.Iterator;

public class ParallelIterator<T> implements Iterator<T> {

    private T[] array1;
    private T[] array2;
    private int index1;
    private int index2;
    private static final int MAX_STRING = 2;

    public ParallelIterator(T[] array1, T[] array2){
        if (array1 == null || array2 == null) {
            throw new IllegalArgumentException("Los arrays no pueden ser nulos");
        }
        this.array1 = array1;
        this.array2 = array2;
        this.index1 = 0;
        this.index2 = 0;
    }
    @Override
    public boolean hasNext() {
        return index1 < array1.length || index2 < array2.length;
    }
    @Override
    public T next(){
        T[] ret = (T[]) new Object[MAX_STRING];
        if (!hasNext()){
            throw new NoSuchElementException();
        }
        if (index1 < array1.length && index2 < array2.length){
            return (String);

        }else if (index1 < array1.length){
            ret[0] = array1[index1++];
        }else{
            ret[0] = array2[index2++];
        }

        return ret;

    }


}
*/