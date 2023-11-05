package Parciales.P2.Repaso.Ej7;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

public class Library {

    Map<String, BookInfo> bookInfo = new HashMap<>(); //Uso map pero no uso @override de hash. Porque? Cuando debo hacerlo?
    Map<Person, Loan> loans = new HashMap<>();

    public Library addBook(String name, int stock){
        bookInfo.putIfAbsent(name, new BookInfo(name, stock));
        return this;
    }

    public void borrowBook(Person person, String book, LocalDate date){
        if (!bookInfo.containsKey(book)){
            throw new NoSuchElementException("Book not found.");
        }
        loans.putIfAbsent(person, new Loan(book, date));
        bookInfo.get(book).borrowBook();
    }

    public void printDueLoansBooks(LocalDate date){
        System.out.println("Due loans at " + date);
        for(Map.Entry<Person, Loan> loan : loans.entrySet()){
            if (loan.getKey().getCond().addDate(loan.getValue().getDate()).isBefore(date)){ //Esto esta muy distinto y esta feo.
                System.out.println(loan.getKey() + " (" + loan.getValue().getBook() + " - " + loan.getValue().getDate() + ")");
            }
        }
    }

    public void returnBook(Person p){
        bookInfo.get(loans.get(p).getBook()).returnBook();
        loans.remove(p);

    }

}