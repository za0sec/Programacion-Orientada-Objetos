package Parciales.P2.Repaso.Ej7;

public class BookInfo {

    private String name;
    private int stock;

    public BookInfo(String name, int stock) {
        this.name = name;
        this.stock = stock;
    }

    public void borrowBook() {
        if (stock == 0) {
            throw new IllegalStateException();
        }
        stock--;
    }

    public void returnBook() {
        stock++;
    }

}

