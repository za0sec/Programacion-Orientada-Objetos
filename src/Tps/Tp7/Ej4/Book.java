package Tps.Tp7.Ej4;

import java.util.Objects;

public class Book implements Comparable<Book> {
    private final String title, author;
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public boolean equals(Object o) {
        return this == o || (o instanceof Book book &&
                title.equals(book.title) &&
                author.equals(book.author));
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author);
    }

    @Override
    public String toString() {
        return title;
    }

    @Override
    public int compareTo(Book o) {
        int cmp = title.compareTo(o.title);
        if (cmp != 0) {
            return cmp;
        }
        return author.compareTo(o.author);
    }
}

