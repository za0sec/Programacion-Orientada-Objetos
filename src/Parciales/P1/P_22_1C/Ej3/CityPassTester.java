package Parciales.P1.P_22_1C.Ej3;

import java.time.LocalDate;

public class CityPassTester {

    public static void main(String[] args) {
        // Ejemplo de uso de la clase java.time.LocalDate
        LocalDate today = LocalDate.of(2022, 4, 21);
        LocalDate todayMinus3 = LocalDate.of(2022, 4, 18);
        System.out.println(todayMinus3.isBefore(today));
        System.out.println(today.isAfter(todayMinus3));
        System.out.println(todayMinus3.isBefore(todayMinus3));
        System.out.println(today.isAfter(today));
        System.out.println("----------");

        // Atracciones aceptadas para los pases de atracciones de Montreal
        Attraction laGrandeRoue = new Attraction("La Grande Roue de Montreal");
        Attraction oasisImm = new Attraction("OASIS Immersion");
        Attraction mtlZipline = new Attraction("MTL Zipline");
        Attraction[] attractions = new Attraction[]{laGrandeRoue, oasisImm, mtlZipline};

        // Pase ilimitado que puede usarse en una serie de atracciones aceptadas
        // siempre y cuando la fecha de visita de la atracción no sea
        // anterior a la fecha del pase (16/04/2022)
        CityPass unlimitedCP = new UnlimitedPass(attractions, "Olivia",
                LocalDate.of(2022, 4, 16));
        System.out.println(unlimitedCP);
        System.out.println("##########");

        // Se utiliza el pase para visitar una atracción el 17/04/2022
        // y se imprime en salida estándar el mensaje correspondiente
        unlimitedCP.visit(laGrandeRoue, LocalDate.of(2022, 4, 17));

        unlimitedCP.visit(oasisImm, LocalDate.of(2022, 4, 17));
        unlimitedCP.visit(new Attraction("MTL Zipline"), LocalDate.of(2022, 4, 18));
        System.out.println("##########");

        try {
            // Falla porque la atracción que no está aceptada
            unlimitedCP.visit(new Attraction("Notre-Dame Basilica of Montreal"),
                    LocalDate.of(2022, 4, 16));
        } catch (CannotVisitAttractionException ex) {
            System.out.println(ex.getMessage());
        }
        try {
            // Falla porque la fecha de visita es anterior a la fecha del pase
            unlimitedCP.visit(laGrandeRoue, LocalDate.of(2022, 4, 15));
        } catch (CannotVisitAttractionException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("##########");

        System.out.println(unlimitedCP);
        System.out.println("##########");

        // Pase con límite de visitas que puede usarse en una serie de atracciones aceptadas
        // siempre y cuando la fecha de visita de la atracción no sea
        // anterior a la fecha del pase (16/04/2022)
        // donde el pase tiene un límite de 2 atracciones
        CityPass limitedVisitsCP = new LimitedPass(attractions,
                "Peter", LocalDate.of(2022, 4, 16), 2);
        limitedVisitsCP.visit(laGrandeRoue, LocalDate.of(2022, 4, 17));
        limitedVisitsCP.visit(oasisImm, LocalDate.of(2022, 4, 18));
        try {
            // Falla porque ya se alcanzó el límite de visitas
            limitedVisitsCP.visit(mtlZipline, LocalDate.of(2022, 4, 18));
        } catch (CannotVisitAttractionException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println(limitedVisitsCP);
        System.out.println("##########");

        // Pase con vencimiento que puede usarse en una serie de atracciones aceptadas
        // siempre y cuando la fecha de visita de la atracción no sea
        // anterior a la fecha del pase (16/04/2022)
        // donde el pase vence el 19/04/2022
        CityPass endDateCP = new ExpirationPass(attractions, "Walter",
                LocalDate.of(2022, 4, 16), LocalDate.of(2022, 4, 19));
        endDateCP.visit(laGrandeRoue, LocalDate.of(2022, 4, 17));
        endDateCP.visit(oasisImm, LocalDate.of(2022, 4, 19));
        try {
            // Falla porque la fecha de visita es posterior a la fecha del vencimiento
            endDateCP.visit(mtlZipline, LocalDate.of(2022, 4, 20));
        } catch (CannotVisitAttractionException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println(endDateCP);
        System.out.println("##########");
    }

}

