package Tps.Tp4.Ej5;

public class LinkText implements HTMLText{

    private HTMLText innerText;
    private String insertText;

    public LinkText(HTMLText text, String insertText) {
        this.innerText = text;
        this.insertText = insertText;
    }

    public String source(){
        return "<a href:" + insertText.toString() + ">" + innerText.source() + "</a>";
    }

    @Override
    public String toString() {
        return source();
    }
}
