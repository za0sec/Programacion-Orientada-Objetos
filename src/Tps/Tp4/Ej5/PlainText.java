package Tps.Tp4.Ej5;

public class PlainText implements HTMLText {

    private String text;

    public PlainText(String text) {
        this.text = text;
    }

    public String source(){
        return text.toString();
    }

    public String setText(String text){

        this.text = text;
        return text.toString();

    }

    @Override
    public String toString() {
        return source();
    }

}