package Tps.Tp7.Ej4;

import java.util.Objects;

public class RankedOrder implements Comparable<RankedOrder>{


    private Book book;
    private Genre genre;
    private int rank;

    public RankedOrder(Book book, Genre genre) {
        this.book = book;
        this.genre = genre;
    }


    public RankedOrder(Book book) {
        this.book = book;
        this.rank = 1;
    }


    public RankedOrder(RankedOrder rankedBook) {
        this.book = rankedBook.book;
        this.rank = rankedBook.rank + 1;
        this.genre = rankedBook.genre;
    }


    public Book getBook(){
        return book;
    }

    public Genre getGenre(){
        return genre;
    }
    @Override
    public boolean equals(Object obj) {
        return this == obj || (obj instanceof RankedOrder that && book.equals(that.book) && genre == that.genre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(book, genre);
    }

    @Override
    public int compareTo(RankedOrder o) {
        int cmp = Integer.compare(o.rank, rank);
        if (cmp != 0){
            return cmp;
        }
        return book.compareTo(o.book);
    }


    @Override
    public String toString() {
        return "%s : %d".formatted(book, rank);
    }

}
