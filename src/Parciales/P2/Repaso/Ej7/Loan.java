package Parciales.P2.Repaso.Ej7;

import java.time.LocalDate;

public class Loan {

    private String book;
    private LocalDate date;

    public Loan(String book, LocalDate date){
        this.book = book;
        this.date = date;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getBook() {
        return book;
    }
}
