package Parciales.P2.Repaso.Ej1;

@FunctionalInterface
public interface Operation<E, K> {
     K make(E a);
}