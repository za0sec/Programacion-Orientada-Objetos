package Tps.Tp2.Ej7;

public class Histograma {



    public static void main(String[] args) {

        int[] intervals = new int[10];

        for (String numString:args) {

            int num = Integer.parseInt(numString);
            int index = num /= 10;
            if (num == 100){
                index = 9;
            }
            intervals[index]++;
        }

        int max = 0;
        for (int valor : intervals) {
            if (valor > max) {
                max = valor;
            }
        }

        for (int i = max; i > 0; i--) {
            for (int j = 0; j < 10; j++) {
                if (intervals[j] >= i) {
                    System.out.print("| * ");
                } else {
                    System.out.print("|   ");
                }
            }
            System.out.println("|");
        }
        System.out.println("+---+---+---+---+---+---+---+---+---+---+");
        for (int i=0; i<=100; i+=10){
            System.out.print(i + "  ");
        }



    }

}