package Tps.Tp2.Ej3;

public class Deletrear {

    private String message;

    public Deletrear(String message){
        this.message = message;
    }
    public String myString() {
        StringBuilder s = new StringBuilder();
        for (char c:message.toCharArray()) {
            if (c == ' '){
                s.deleteCharAt(s.length()-1);
                s.append('\n');

            }else {
                s.append(c).append('-');
            }


        }
        s.deleteCharAt(s.length()-1);
        return s.toString();
    }
}
