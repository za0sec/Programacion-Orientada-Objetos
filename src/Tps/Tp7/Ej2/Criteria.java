package Tps.Tp7.Ej2;

@FunctionalInterface
public interface Criteria<E, R> {

    R toDo(R accum,  E value);

}