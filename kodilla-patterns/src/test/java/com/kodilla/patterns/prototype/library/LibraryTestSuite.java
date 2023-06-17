package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class LibraryTestSuite {

    @Test
    void testGetBooks() {
        Library library = new Library("BookShelf");
        library.books.add(new Book("Ala i kot", "Emily Rose", LocalDate.ofYearDay(1929, 2)));
        library.books.add(new Book("Robot Jim", "Michael Swarz", LocalDate.ofYearDay(2014, 3)));
        library.books.add(new Book("Enzo", "Jacob Coffee", LocalDate.ofYearDay(2021, 25)));
        library.getBooks();
        System.out.println(library.getBooks());

        Library shallowClonedLibrary = null;
        Library deepClonedLibrary = null;
        try {
            shallowClonedLibrary = library.shallowCopy();
            deepClonedLibrary = library.deepCopy();
        } catch (CloneNotSupportedException e) {
            System.out.println(e.getMessage());
        }
    }


}
