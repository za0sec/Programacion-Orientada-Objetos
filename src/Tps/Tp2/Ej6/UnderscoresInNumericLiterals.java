package Tps.Tp2.Ej6;

public class UnderscoresInNumericLiterals {
    public static void main(String[] args) {
        int dni = 12_345_678;
        double pi = 3.14_16;
        System.out.printf("%.3f", dni + pi);
    }
}

