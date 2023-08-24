/*      Se desea diseñar un conjunto de clases que modelan las cuentas de un banco,
        sobre las cuales se permiten hacer únicamente depósitos y extracciones. Todas las cuentas tienen un número identificador y un saldo (balance).
        Existen dos tipos de cuentas: caja de ahorro y cuenta corriente.
        La cuenta corriente cuenta con un descubierto y la caja de ahorros no.
        En otras palabras, un monto puede retirarse de una caja de ahorro sólo si cuenta con los fondos.
        La cuenta corriente puede tener un saldo negativo, nunca mayor al monto del descubierto.
        Diseñar el diagrama de clases correspondiente.
*/


package Tps.Tp3.Ej7;

public class SavingsAccount {
    private Integer balance;
    private Integer id;

}
