package Parciales.P2.Par2_21_02.Ej2;

public class GymRegistryTester {

    public static void main(String[] args) {
        // Se instancia un GymRegistry para administrar los clientes y sus visitas del año 2021
        GymRegistry gymRegistry2021 = new GymRegistry();

        // Registra al cliente "Rodrigo" con la membrersía Beginner
        gymRegistry2021.registerClient("Rodrigo", Membership.BEGINNER);

        // Cantidad de visitas del cliente "Rodrigo" en el mes de Octubre
        System.out.println(gymRegistry2021.visitsCount("Rodrigo", 10));
        // Cantidad de visitas del cliente "Rodrigo" en el mes de Noviembre
        System.out.println(gymRegistry2021.visitsCount("Rodrigo", 11));
        // Cantidad de visitas del cliente "Rodrigo" en todos los meses del año
        System.out.println(gymRegistry2021.visitsCount("Rodrigo"));
        System.out.println("-----");

        // Se registran 2 visitas del cliente "Rodrigo" en el mes de Octubre
        gymRegistry2021.visit("Rodrigo", 10).visit("Rodrigo", 10);

        // Se registran 4 visitas del cliente "Rodrigo" en el mes de Noviembre
        gymRegistry2021.visit("Rodrigo", 11).visit("Rodrigo", 11);
        gymRegistry2021.visit("Rodrigo", 11).visit("Rodrigo", 11);

        // Cantidad de visitas del cliente "Rodrigo" en el mes de Octubre
        System.out.println(gymRegistry2021.visitsCount("Rodrigo", 10));
        // Cantidad de visitas del cliente "Rodrigo" en el mes de Noviembre
        System.out.println(gymRegistry2021.visitsCount("Rodrigo", 11));
        // Cantidad de visitas del cliente "Rodrigo" en todos los meses del año
        System.out.println(gymRegistry2021.visitsCount("Rodrigo"));
        System.out.println("-----");


        // El cliente "Rodrigo" puede realizar una nueva visita en el mes de Octubre
        System.out.println(gymRegistry2021.canVisit("Rodrigo", 10));
        // El cliente "Rodrigo" no puede realizar una nueva visita en el mes de Noviembre
        // pues supera el máximo de visitas por mes de su membresía.
        System.out.println(gymRegistry2021.canVisit("Rodrigo", 11));
        try {
            // Falla la visita del cliente "Rodrigo" en el mes de Noviembre
            // pues supera el máximo de visitas por mes de su membresía.
            gymRegistry2021.visit("Rodrigo", 11);
        } catch (GymRegistryException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("-----");

        // Registra al cliente "Mariana" con la categoría Pro
        gymRegistry2021.registerClient("Mariana", Membership.PRO);
        // Se registran 10 visitas del cliente "Mariana" en el mes de Marzo
        for(int i = 0; i < 10; i++) {
            gymRegistry2021.visit("Mariana", 3);
        }
        // Cantidad de visitas del cliente "Mariana" en el mes de Marzo
        System.out.println(gymRegistry2021.visitsCount("Mariana", 3));
        // El cliente "Mariana" puede realizar una nueva visita en el mes de Marzo
        System.out.println(gymRegistry2021.canVisit("Mariana", 3));
        System.out.println("-----");

        try {
            // Falla el registro del cliente "Rodrigo"
            // pues ya existe uno con ese nombre
            gymRegistry2021.registerClient("Rodrigo", Membership.ADVANCED);
        } catch (GymRegistryException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("-----");

        try {
            // Falla la visita del cliente "Ariel" en el mes de Febrero
            // pues no se encuentra registrado
            gymRegistry2021.visit("Ariel", 2);
        } catch (GymRegistryException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("-----");

        try {
            // Falla la cantidad de visitas del cliente "Ariel" en todos los meses del año
            // pues no se encuentra registrado
            gymRegistry2021.visitsCount("Ariel");
        } catch (GymRegistryException ex) {
            System.out.println(ex.getMessage());
        }
    }

}

