package Parciales.P2.Par2_21_02.Ej1;

import java.time.LocalDate;

public class DateCollectionTester {

    public static void main(String[] args) {
        // Ejemplos de uso de LocalDate
        LocalDate ld1 = LocalDate.of(2021, 12, 29); // 29/12/2021
        LocalDate ld2 = LocalDate.of(2021, 12, 30); // 30/12/2021
        System.out.println(ld1.isBefore(ld2));
        System.out.println(ld1.isAfter(ld2));
        System.out.println("-----");

        // Se instancia una DateCollection con la fecha "actual" 29/11/2021
        DateCollection<String> dc = new DateCollection<>(LocalDate.of(2021, 11, 29));

        // Se agregan 5 instancias de DateElement a la DateCollection
        dc.add(new DateElement<>("Mundo", LocalDate.of(2021, 11, 28)));
        dc.add(new DateElement<>("Hello", LocalDate.of(2021, 11, 28)));
        dc.add(new DateElement<>("Hola", LocalDate.of(2021, 11, 28)));
        dc.add(new DateElement<>("Hola", LocalDate.of(2021, 11, 25)));
        dc.add(new DateElement<>("World", LocalDate.of(2021, 11, 25)));

        System.out.println(dc.size());
        System.out.println(dc.isEmpty());
        System.out.println(dc.contains(new DateElement<>("Hola", LocalDate.of(2021, 11, 25))));
        System.out.println("-----");

        // El siguiente DateElement no se agrega pues la colección no acepta repetidos
        // y ya existe otro con Hola y 25/11/2021
        System.out.println(dc.add(new DateElement<>("Hola", LocalDate.of(2021, 11, 25))));
        System.out.println("-----");



        try {
            // El siguiente DateElement no se agrega pues tiene una fecha 15/12/2021 posterior
            // a la "actual" 29/11/2021
            dc.add(new DateElement<>("Hola", LocalDate.of(2021, 12, 15)));
        } catch (Exception ex) {
            System.out.println("Error");
        }
        System.out.println("-----");

        // Se imprimen los elementos de las instancias de DateElement anteriores
        // a la fecha "actual" con orden ascendente por fecha y desempata descendente por elemento
        for(String element : dc.getElementsBeforeToday()) {
            System.out.println(element);
        }
        System.out.println("-----");

        // Se cambia la fecha "actual" de la DateCollection a 26/11/2021
        dc.changeToday(LocalDate.of(2021, 11, 26));

        System.out.println(dc.size());
        System.out.println(dc.isEmpty());
        System.out.println(dc.contains(new DateElement<>("Hola", LocalDate.of(2021, 11, 28))));
        System.out.println("-----");

        // Se imprimen los elementos de las instancias de DateElement anteriores
        // a la fecha "actual" con orden ascendente por fecha y desempata descendente por elemento
        for(String element : dc.getElementsBeforeToday()) {
            System.out.println(element);
        }
        System.out.println("-----");

        // Se imprimen los elementos de las instancias de DateElement anteriores
        // a la fecha indicada con orden ascendente por fecha y desempata descendente por elemento
        for(String element : dc.getElementsBefore(LocalDate.of(2022, 1, 1))) {
            System.out.println(element);
        }
        System.out.println("-----");

        System.out.println(dc.getElementsBefore(LocalDate.of(2020, 1, 1)).isEmpty());
    }

}

