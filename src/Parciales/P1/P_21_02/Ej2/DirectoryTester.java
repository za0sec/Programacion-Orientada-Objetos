package Parciales.P1.P_21_02.Ej2;

public class DirectoryTester {

    public static void main(String[] args) {
        Person p1 = new Person("James", 40);
        Person p2 = new Person("David", 20);
        Person p3 = new Person("David", 60);
        Person p4 = new Person("Robert", 30);
        Person[] persons = {p1, p2, p3, p4};

        /**
         * Se crea un directorio con un límite de 5 personas que podrá ser
         * consultado con orden ascendente por nombre (alfabético)
         * y desempate descendente por edad
         */
        Directory d1 = new Directory(5);
        // Se agregan al directorio las personas del arreglo
        for(Person p : persons) {
            d1.addPerson(p);
        }
        // Se obtiene una copia de las personas del directorio con el orden esperado
        for(Person p : d1.persons()) {
            System.out.println(p);
        }
        System.out.println("##########");

        /**
         * Se crea un directorio con un límite de 5 personas que podrá ser
         * consultado con orden descendente por nombre y desempate ascendente por edad
         */
        DescendingNameDirectory d2 = new DescendingNameDirectory(5);
        // Se agregan al directorio las personas del arreglo
        d2.addPerson(p1).addPerson(p2).addPerson(p3).addPerson(p4);
        // Se obtiene una copia de las personas del directorio con el orden esperado
        for(Person p : d2.persons()) {
            System.out.println(p);
        }
        System.out.println("##########");

        /**
         * Se crea un directorio con un límite de 3 personas que podrá ser
         * consultado con orden ascendente por edad y desempate ascendente por nombre
         * (alfabético)
         */
        AscendingAgeDirectory d3 = new AscendingAgeDirectory(3);
        // Se agregan al directorio tres personas del arreglo
        d3.addPerson(p1);
        d3.addPerson(p2);
        d3.addPerson(p3);
        try {
            // Al agregar al directorio una cuarta persona se alcanza el límite
            // y se obtiene un error
            d3.addPerson(p4);
        } catch (ReachedLimitException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("----------");
        // Se obtiene una copia de las personas del directorio con el orden esperado
        for(Person p : d3.persons()) {
            System.out.println(p);
        }
    }

}

