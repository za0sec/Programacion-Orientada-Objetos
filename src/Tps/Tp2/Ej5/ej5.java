package Tps.Tp2.Ej5;

public class ej5 {

    public static void main(String[] args) {

        StringBuilder s = new StringBuilder();

        for (String word:args) {
            s.append(word);
        }

        Palindromo pal = new Palindromo(s.toString());

        if (pal.isPalindrome()){
            System.out.println("Es Palindromo");
        }else{
            System.out.println("No es Palindromo");
        }

    }

}
