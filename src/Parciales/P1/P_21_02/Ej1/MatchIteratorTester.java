package Parciales.P1.P_21_02.Ej1;

import java.util.function.Predicate;

public class MatchIteratorTester {

    public static void main(String[] args) {
        /**
         * Ejemplo 1: Arreglo de String y una condición para que el "match" lo
         * tengan los strings que comiencen con una H
         */
        String[] v1 = {"Hello", "World", "Hola", "Mundo"};
        Predicate<String> p1 = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.startsWith("H");
            }
        };
        MatchIterator<String> it1 = new MatchIterator<>(v1, p1);
        while(it1.hasNext()) {
            MatchElement<String> e1 = it1.next();
            System.out.println(e1);
        }
        try {
            it1.next();
        } catch (Exception ex) {
            System.out.println("No more elements.");
        }

        System.out.println("----------");

        /**
         * Ejemplo 2: Arreglo de enteros y una condición para que el "match" lo
         * tengan los enteros pares
         */
        Integer[] v2 = {2, 3, 5, 6, 8};
        MatchIterator<Integer> it2 = new MatchIterator<>(v2, n -> n % 2 == 0);
        while(it2.hasNext()) {
            MatchElement<Integer> e2 = it2.next();
            System.out.println(e2.matches());
        }
        it2.next();
    }

}

