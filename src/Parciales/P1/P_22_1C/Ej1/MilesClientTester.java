package Parciales.P1.P_22_1C.Ej1;

import java.util.Iterator;

public class MilesClientTester {

    public static void main(String[] args) {
        // El cliente "Chuck" se suscribe por 4 meses al plan Club 2000
        MilesClient chuck = new MilesClient("Chuck", 4, PlanMiles.CLUB2000);
        // Se imprime el extracto de cada mes del cliente "Chuck"
        // para todos los meses suscriptos
        // Por el plan elegido los 2 primeros meses tendrá millas bonus
        for (String monthLine : chuck) {
            System.out.println(monthLine);
        }
        System.out.println("##########");

        // El cliente "Sarah" se suscribe por 2 meses al plan Club 1000
        MilesClient sarah = new MilesClient("Sarah", 2, PlanMiles.CLUB1000);
        // Se imprime el extracto de cada mes del cliente "Sarah"
        // para todos los meses suscriptos
        Iterator<String> sarahIt = sarah.iterator();
        for(int i = 0; i < 2; i++) {
            System.out.println(sarahIt.next());
        }
        System.out.println("##########");
        // El extracto del tercer mes de "Sarah" arroja un error
        // pues se suscribió por 2 meses
        try {
            sarahIt.next();
        } catch (Exception ex) {
            System.out.println("Invalid Month");
        }
        System.out.println("##########");

        // El cliente "Morgan" se suscribe por 6 meses al plan Club 5000
        MilesClient morgan = new MilesClient("Morgan", 6, PlanMiles.CLUB5000);
        // Se imprime el extracto de cada mes del cliente "Morgan"
        // para los 4 primeros meses
        // Por el plan elegido los 5 primeros meses tendrá millas bonus
        Iterator<String> morganIt = morgan.iterator();
        for(int i = 0; i < 4; i++) {
            System.out.println(morganIt.next());
        }
        System.out.println("##########");

        // Se imprimen el extracto del primer mes del cliente "Chuck"
        Iterator<String> chuckIt = chuck.iterator();
        System.out.println(chuckIt.next());
        System.out.println("##########");

        // Se imprime el extracto de cada mes del cliente "Morgan"
        // para los meses 5 y 6
        // Por el plan elegido los 5 primeros meses tendrá millas bonus
        for(int i = 5; i < 7; i++) {
            System.out.println(morganIt.next());
        }
        System.out.println("##########");
    }

}

