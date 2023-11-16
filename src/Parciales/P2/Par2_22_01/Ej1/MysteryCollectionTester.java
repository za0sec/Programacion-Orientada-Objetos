package Parciales.P2.Par2_22_01.Ej1;

import java.util.Map;

public class MysteryCollectionTester {
    public static void main(String[] args) {

        MysteryCollection<String> sC = new MysteryCollectionImpl<>();
        sC.add("Hola"); sC.add("Mundo"); sC.add("Hola");
        System.out.println(sC.size()); // 3
        System.out.println(sC.contains("Hello")); // false
        System.out.println(sC.get(0)); // Hola
        System.out.println(sC.get(1)); // Mundo
        System.out.println(sC.get(2)); // Hola

// Una colección sin orden que asocia cada elemento con sus apariciones
// para todos los elementos

        Map<String, Integer> bag = sC.toBag();
        sC.add("Hello");
        System.out.println(bag.size()); // 2
        System.out.println(bag.get("Hola")); // 2
        System.out.println(bag.get("Mundo")); // 1
        System.out.println(bag.get("Hello")); // null

// Una colección sin orden que asocia cada elemento con sus apariciones
// para los elementos que empiecen con H
        Map<String, Integer> filteredBag = sC.toBag(
                new java.util.function.Predicate<String>() {
                    @Override
                    public boolean test(String e) {
                        return e.startsWith("H");
                    }
                });
        System.out.println(filteredBag.size()); // 2
        System.out.println(filteredBag.get("Hola")); // 2
        System.out.println(filteredBag.get("Mundo")); // null
        System.out.println(filteredBag.get("Hello")); // 1


    }
}
