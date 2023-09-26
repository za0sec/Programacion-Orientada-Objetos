package Parciales.P1.PracticaFranco.Ej2;
import java.util.NoSuchElementException;
public class ParallelIterator<T> {

    private T[] array1;
    private T[] array2;
    private int index1;
    private int index2;

    public ParallelIterator(T[] array1, T[] array2){
        if(array1 == null && array2 == null){
            throw new IllegalArgumentException("Both Collections Missing");
        }else if (array1 == null) {
            throw new IllegalArgumentException("First Collection Missing");
        }else if(array2 == null){
            throw new IllegalArgumentException("Second Collection Missing");
        }
        this.array1 = array1;
        this.array2 = array2;
        this.index1 = 0;
        this.index2 = 0;
    }
    public boolean hasNext() {
        return index1 < array1.length && index2 < array2.length;
    }
    public String next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }

        T elem1 = index1 < array1.length ? array1[index1++] : null;
        T elem2 = index2 < array2.length ? array2[index2++] : null;

        return "{" + elem1 + "," + elem2 + "}";
    }
}