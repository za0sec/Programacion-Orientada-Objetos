package Tps.Tp2.Ej3;

import java.util.Arrays;

public class ej3 {
    public static void main(String[] args) {

        for (String word : args) {
            Deletrear del = new Deletrear(word);
            System.out.println(del.myString());
        }

    }
}
