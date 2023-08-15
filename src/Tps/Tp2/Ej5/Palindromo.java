package Tps.Tp2.Ej5;
import org.w3c.dom.ls.LSOutput;

public class Palindromo {

    private String phrase;

    public Palindromo(String phrase){

        this.phrase = phrase;

    }

    private String toMinus(){

        StringBuilder s = new StringBuilder();

        for (char c:phrase.toCharArray()) {
            if (c != ' '){
                s.append(Character.toLowerCase(c));
            }

        }

        return s.toString();

    }

    private String swapPhrase(String cleanPhrase){

        StringBuilder s = new StringBuilder(cleanPhrase);

        return s.reverse().toString();

    }

    public boolean isPalindrome(){

        String s = toMinus();

        return s.equals(swapPhrase(s));

    }

}