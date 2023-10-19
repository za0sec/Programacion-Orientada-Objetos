/*package Parciales.P1.P_22_1C.Ej2;

import java.util.function.Predicate;

public class DictionaryTester {

    public static void main(String[] args) {
        // Crea un diccionario donde la "palabra" es de tipo String
        Dictionary<String> stringDict = new Dictionary<>();
        stringDict.addEntry("work", "something done or made")
                .addEntry("house", "a building for human habitation")
                .addEntry("house", "a style of popular dance music");

        // Obtiene una copia de todas las entradas del diccionario
        // (colección de pares { Palabra <> Definición })
        // con orden natural de la "palabra"
        // y desempata alfabéticamente por la "definición"
        for(DictionaryEntry<String> de : stringDict.getNaturalOrderCopy()) {
            System.out.println(de);
        }
        System.out.println("##########");

        // Obtiene una copia de todas las entradas del diccionario
        // (colección de pares { Palabra <> Definición })
        // con orden inverso al orden natural de la "palabra"
        // y desempata descendente por la "definición"
        for(DictionaryEntry<String> de : stringDict.getReverseOrderCopy()) {
            System.out.println(de);
        }
        System.out.println("##########");

        // Obtiene la primera entrada del diccionario { Palabra <> Definición }
        // (por el orden de inserción) que cumpla con el predicado
        // que se envía por parámetro: La "palabra" debe empezar con h
        DictionaryEntry<String> hPred = stringDict.getFirstMatch(new Predicate<>() {
            @Override
            public boolean test(String word) {
                return word.startsWith("h");
            }
        });
        System.out.println(hPred);
        System.out.println("##########");

        // Crea un diccionario donde la "palabra" es de tipo Employee
        Dictionary<Employee> employeeDict = new Dictionary<>();
        employeeDict.addEntry(new Employee("Selina"), "VP");
        employeeDict.addEntry(new Employee("Mike"), "Press Secretary");
        employeeDict.addEntry(new Employee("Sue"), "Personal Secretary");

        for(DictionaryEntry<Employee> de : employeeDict.getNaturalOrderCopy()) {
            System.out.println(de);
        }
        System.out.println("##########");

        for(DictionaryEntry<Employee> de : employeeDict.getReverseOrderCopy()) {
            System.out.println(de);
        }
        System.out.println("##########");

        // La "palabra" debe ser un Employee cuyo nombre empieza con "S"
        DictionaryEntry<Employee> sPred = employeeDict
                .getFirstMatch(word -> word.getName().startsWith("S"));
        System.out.println(sPred);
        System.out.println("##########");

        // La "palabra" debe ser un Employee cuyo nombre empieza con "Z"
        // Como no existe ninguna "palabra" que cumpla con esa condición
        // entonces se arroja un error
        try {
            employeeDict.getFirstMatch(word -> word.getName().startsWith("Z"));
        } catch (Exception ex) {
            System.out.println(ex.getClass());
        }
        System.out.println("##########");
    }

    static class Person implements Comparable<Person> {
        private final String name;
        public Person(String name) {
            this.name = name;
        }
        @Override
        public int compareTo(Person o) {
            return name.compareTo(o.name);
        }
        @Override
        public String toString() {
            return String.format("Employee %s", name);
        }
        public String getName() {
            return name;
        }
    }

    static class Employee extends Person {
        public Employee(String name) {
            super(name);
        }
    }

}
*/
