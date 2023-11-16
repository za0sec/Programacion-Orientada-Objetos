package Parciales.P2.Par2_22_01.Ej2;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Set;

public class DriverLicenseCentralTester {

    public static void main(String[] args) {
        // Ejemplo de uso de la clase java.time.LocalDate
        LocalDate aux = LocalDate.of(2022, 5, 30);
        System.out.println(aux); // 2022-05-30
        System.out.println(aux.compareTo(LocalDate.of(2022, 5, 31))); // -1

        DriverLicenseCentral dLC =  new DriverLicenseCentral();

// Se registra a la conductora Olivia con 10 puntos
// Si ya existe un registro con ese nombre se actualiza el total de puntos
        dLC.register("Olivia", 10);
// Se consultan los puntos de Olivia
// Si no existe un registro con ese nombre se arroja un error
        System.out.println(dLC.points("Olivia")); // 10
// Olivia comete una infracción de semáforo el 7/6/2022 restándole 3 puntos
// Si ya existe una infracción para el mismo nombre y fecha se arroja un error
// Si no existe un registro con ese nombre se arroja un error
        dLC.infraction("Olivia", LocalDate.of(2022, 6, 7), Infraction.RED_LIGHT);
        System.out.println(dLC.points("Olivia")); // 7
        dLC.infraction("Olivia", LocalDate.of(2022, 6, 5), Infraction.SPEED);
        System.out.println(dLC.points("Olivia")); // 2
        dLC.infraction("Olivia", LocalDate.of(2022, 6, 6), Infraction.RED_LIGHT);
        System.out.println(dLC.points("Olivia")); // -1
        try {
            dLC.infraction("Olivia", LocalDate.of(2022, 6, 5), Infraction.OTHER);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage()); // Infraction already exists for driver and date
        }

        try {
            dLC.infraction("Nini", LocalDate.of(2022, 6, 3), Infraction.SPEED);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage()); // Driver does not exists
        }
        dLC.register("Nini", 7);
        System.out.println(dLC.points("Nini")); // 7
        dLC.infraction("Nini", LocalDate.of(2022, 6, 3), Infraction.SPEED);
        System.out.println(dLC.points("Nini")); // 2

// Se obtienen todas las fechas de las infracciones de Olivia en orden cronológico
// Si no tiene infracciones se obtiene una colección vacía.
// Si no existe un registro con ese nombre se arroja un error
        Set<LocalDate> oliviaInfractionDates = dLC.getInfractionDates("Olivia");
        System.out.println(oliviaInfractionDates); // [2022-06-05, 2022-06-06, 2022-06-07]
// Se obtienen todos los tipos de las infracciones de Olivia en orden cronológico
// Si no tiene infracciones se obtiene una colección vacía.
// Si no existe un registro con ese nombre se arroja un error
        Collection<Infraction> oliviaInfractionTypes = dLC.getInfractionTypes("Olivia");
        System.out.println(oliviaInfractionTypes); // [SPEED, RED_LIGHT, RED_LIGHT]

        System.out.println(dLC.getInfractionDates("Nini")); // [2022-06-03]
        System.out.println(dLC.getInfractionTypes("Nini")); // [SPEED]

        try {
            dLC.getInfractionDates("Ricky");
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage()); // Driver does not exists
        }


    }
}
