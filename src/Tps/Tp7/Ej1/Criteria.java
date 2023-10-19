package Tps.Tp7.Ej1;

@FunctionalInterface
public interface Criteria<T> {

    boolean satisfies(T obj);

}
