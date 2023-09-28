package Parciales.P1.P_2022_02.Ej3;

import java.time.LocalDate;

public class LoanTester {
    public static void main(String[] args) {
        System.out.println(LocalDate.of(2022,9,22)); // 2022-09-22
        System.out.println(LocalDate.of(2022,9,23).isAfter(LocalDate.of(2022,9,22))); // true

        // Se instancia un préstamo PERSONAL de $1000 de 3 cuotas con fecha 1/9/2022
        // que indica las cuotas pendientes
        // donde no se pueden hacer más de 3 pagos
        // y las fechas de los mismos deben ser posteriores a la fecha del préstamo
        Loan l1 = new Loan(Reciever.PERSONAL, 1000, 3, LocalDate.of(2022,9,1));
        System.out.println(l1); // PERSONAL Loan of $1000. Remaining quota: 3.
        // Se paga la cuota 1 con fecha 1/10/2022
        l1.pay(1, LocalDate.of(2022, 10, 1)); // Paying quota 1 on date 2022-10-01.
        System.out.println(l1); // PERSONAL Loan of $1000. Remaining quota: 2.
        try {
            // Ocurre un error pues la fecha de pago no es posterior a la fecha del préstamo
            l1.pay(2, LocalDate.of(2000, 1, 1));
        } catch (LoanException ex) {
            System.out.println(ex.getMessage()); // Cannot pay.
        }
        // No se verifica que la cuota 5 sea menor a 3 o que la cuota 1 no se haya pagado.
        l1.pay(5, LocalDate.of(2022, 10, 1)); // Paying quota 5 on date 2022-10-01.
        l1.pay(1, LocalDate.of(2022, 10, 1)); // Paying quota 1 on date 2022-10-01.
        System.out.println(l1); // PERSONAL Loan of $1000. Remaining quota: 0.
        try {
            // Ocurre un error pues no hay más cuotas pendientes
            l1.pay(1, LocalDate.of(2022, 10, 1));
        } catch (LoanException ex) {
            System.out.println(ex.getMessage()); // Cannot pay.
        }

        // Se instancia un préstamo AUTOMOTOR de $2000 de 3 cuotas con fecha 1/9/2022
        // que indica las cuotas pendientes y el número de la última cuota paga
        // donde no se pueden hacer más de 3 pagos
        // y los mismos deben realizarse en orden consecutivo
        // y las fechas de los mismos deben ser posteriores a la fecha del préstamo
        Loan l2 = new LoanLastStatement(Reciever.VEHICLE, 2000, 3, LocalDate.of(2022,9,1));
;        System.out.println(l2); // VEHICLE Loan of $2000. Remaining quota: 3. Last quota: 0.
        l2.pay(1, LocalDate.of(2022, 10, 1)); // Paying quota 1 on date 2022-10-01.
        System.out.println(l2); // VEHICLE Loan of $2000. Remaining quota: 2. Last quota: 1.
        try {
            // Ocurre un error pues se intenta pagar la cuota 3 pero la última paga es la 1
            l2.pay(3, LocalDate.of(2022, 11, 1));
        } catch (LoanException ex) {
            System.out.println(ex.getMessage()); // Cannot pay.
        }
        l2.pay(2, LocalDate.of(2022, 9, 2)); // Paying quota 2 on date 2022-09-02.
        System.out.println(l2); // VEHICLE Loan of $2000. Remaining quota: 1. Last quota: 2.
        l2.pay(3, LocalDate.of(2022, 12, 31)); // Paying quota 3 on date 2022-12-31.
        System.out.println(l2); // VEHICLE Loan of $2000. Remaining quota: 0. Last quota: 3.

        // Se instancia un préstamo HIPOTECARIO de $3000 de 3 cuotas con fecha 1/9/2022
        // que indica las cuotas pendientes y el número de la última cuota paga
        // y después de que fecha será aceptado el siguiente pago
        // donde no se pueden hacer más de 3 pagos
        // y los mismos deben realizarse en orden consecutivo
        // y las fechas de los mismos deben ser posteriores a la fecha del préstamo
        // y también posteriores a la fecha del último pago
        Loan l3 = new DateStatement(Reciever.HOME, 3000, 3,  LocalDate.of(2022, 9, 1));
        System.out.println(l3);
        // HOME Loan of $3000. Remaining quota: 3. Last quota: 0. Next PayDate: After 2022-09-01.
        l3.pay(1, LocalDate.of(2022, 10, 1)); // Paying quota 1 on date 2022-10-01.
        System.out.println(l3);
        // HOME Loan of $3000. Remaining quota: 2. Last quota: 1. Next PayDate: After 2022-10-01.
        try {
            // Ocurre un error pues la fecha de pago no es posterior a la del último pago
            l3.pay(2, LocalDate.of(2022, 9, 2));
        } catch (LoanException ex) {
            System.out.println(ex.getMessage()); // Cannot pay.
        }
        l3.pay(2, LocalDate.of(2022, 12, 27)); // Paying quota 2 on date 2022-12-27.
        l3.pay(3, LocalDate.of(2022, 12, 28)); // Paying quota 3 on date 2022-12-28.
        System.out.println(l3);
        // HOME Loan of $3000. Remaining quota: 0. Last quota: 3. Next PayDate: After 2022-12-28.

        try {
            // Ocurre un error pues al instanciar un préstamo (de cualquier tipo)
            // el monto (75.000) supera el máximo (50.000) del destinatario (PERSONAL)
            new Loan(Reciever.PERSONAL, 75000, 3, LocalDate.of(2022,9,1));
        } catch (LoanException ex) {
            System.out.println(ex.getMessage()); // Invalid Loan.
        }

        try {
            // Ocurre un error pues al instanciar un préstamo (de cualquier tipo)
            // la cantidad de cuotas (30) supera el máximo (24) del destinatario (VEHICLE)
            new Loan(Reciever.VEHICLE, 1000, 30, LocalDate.of(2022,9,1));
        } catch (LoanException ex) {
            System.out.println(ex.getMessage()); // Invalid Loan.
        }
    }
}

