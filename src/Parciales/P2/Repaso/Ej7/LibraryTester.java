package Parciales.P2.Repaso.Ej7;

import java.time.LocalDate;

public class LibraryTester {

    public static void main(String[] args) {
        // Ejemplo de uso para determinar si una fecha está después que otra fecha
        System.out.println(LocalDate.of(2018,12,3).isAfter(LocalDate.of(2018,12,1)));

        Library library = new Library().addBook("Book 1", 1)
                .addBook("Book 2", 1)
                .addBook("Book 3", 3);

        // El estudiante Student 1 pide el libro Book 1

       Person s1 = new Person("Student 1", Condition.STUDENT);
        library.borrowBook(s1, "Book 1", LocalDate.of(2018, 12, 1));
        // El estudiante Student 2 pide el libro Book 3

       Person s2 = new Person("Student 2", Condition.STUDENT);
        library.borrowBook(s2, "Book 3", LocalDate.of(2018, 12, 1));
        // El estudiante Student 3 pide el libro Book 3

        Person s3 = new Person("Student 3", Condition.STUDENT);
        library.borrowBook(s3, "Book 3", LocalDate.of(2018, 12, 2));

        // Lista los préstamos vencidos para la fecha recibida
        library.printDueLoansBooks(LocalDate.of(2018, 12, 4));
        library.returnBook(s1); // El estudiante Student 1 devuelve el libro que pidió
        library.returnBook(s2); // El estudiante Student 2 devuelve el libro que pidió
        library.returnBook(s3); // El estudiante Student 3 devuelve el libro que pidió

        // El profesor Professor 1 es Responsable y pide el libro Book 1

        Person p1 = new Person("Professor 1", Condition.RESPONSIBLE);
        library.borrowBook(p1, "Book 1", LocalDate.of(2018, 12, 4));
        // El profesor Professor 2 es Jefe de Trabajos Prácticos y pide el libro Book 3

        Person p2 = new Person("Professor 2", Condition.TPCHIEF);
        library.borrowBook(p2, "Book 3", LocalDate.of(2018, 12, 4));
        // El profesor Professor 3 es Ayudante y pide el libro Book 3

        Person p3 = new Person("Professor 3", Condition.ASSISTANT);
        library.borrowBook(p3, "Book 3", LocalDate.of(2018, 12, 4));

        library.printDueLoansBooks(LocalDate.of(2018, 12, 10));
        library.printDueLoansBooks(LocalDate.of(2018, 12, 15));
        library.printDueLoansBooks(LocalDate.of(2018, 12, 16));
        library.printDueLoansBooks(LocalDate.of(2018, 12, 17));

        try {
            library.borrowBook(s1, "Other Book", LocalDate.of(2018,12,3));
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

}

