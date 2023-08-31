package Tps.Tp4.Ej5;

public class FormatText implements HTMLText{
    private HTMLText innerText;
    private String format;

    public FormatText(HTMLText text, String format) {

        this.innerText = text;
        this.format = format;
    }
    public void setFormat(String format){
        this.format = format;
    }

    public String source(){
        return "<%s>".formatted(format) + innerText.source() + "</%s>".formatted(format);
    }

    @Override
    public String toString() {
        return source();
    }
}
