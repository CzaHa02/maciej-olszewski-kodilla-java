package com.kodilla.testing.library;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class BookDirectoryTestSuite {

    private List<Book> generateListOfNBooks(int booksQuantity) {
        List<Book> resultList = new ArrayList<>();
        for (int n = 1; n <= booksQuantity; n++) {
            Book theBook = new Book("Title " + n, "Author " + n, 1970 + n);
            resultList.add(theBook);
        }
        return resultList;
    }

    @Mock
    private LibraryDatabase libraryDatabaseMock;
    @Mock
    private LibraryUser libraryUserMock;

    @Test
    void testListBooksWithConditionsReturnList() {


        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOfBooks = new ArrayList<>();
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
        resultListOfBooks.add(book1);
        resultListOfBooks.add(book2);
        resultListOfBooks.add(book3);
        resultListOfBooks.add(book4);
        when(libraryDatabaseMock.listBooksWithCondition("Secret")).thenReturn(resultListOfBooks);


        List<Book> theListOfBooks = bookLibrary.listBooksWithCondition("Secret");

        assertEquals(4, theListOfBooks.size());
    }


    @Test
    void testListBooksWithConditionMoreThan20() {
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf0Books = new ArrayList<>();
        List<Book> resultListOf15Books = generateListOfNBooks(15);
        List<Book> resultListOf40Books = generateListOfNBooks(5);

        when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                .thenReturn(resultListOf15Books);
        when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks"))
                .thenReturn(resultListOf0Books);
        when(libraryDatabaseMock.listBooksWithCondition("FortyBooks"))
                .thenReturn(resultListOf40Books);


        List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");
        List<Book> theListOfBooks15 = bookLibrary.listBooksWithCondition("Any title");
        List<Book> theListOfBooks40 = bookLibrary.listBooksWithCondition("FortyBooks");


        assertEquals(0, theListOfBooks0.size());
        assertEquals(15, theListOfBooks15.size());
        assertEquals(0, theListOfBooks40.size());
    }


    @Test
    void testListBooksWithConditionFragmentShorterThan3() {
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);


        List<Book> theListOfBooks10 = bookLibrary.listBooksWithCondition("An");


        assertEquals(0, theListOfBooks10.size());
        verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());
    }

    @Test
    void testListNonBorrowedBooks() {
        // given
        LibraryUser libraryUser = new LibraryUser("Adam", "Smith", "12312");
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> booksInHandsOfUser = new ArrayList<>();

        // when
        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser)).thenReturn(booksInHandsOfUser);
        List<Book> nonBorrowedBooksList = bookLibrary.listBooksInHandsOf(libraryUser);

        // then
        assertEquals(0, nonBorrowedBooksList.size());
        verify(libraryDatabaseMock, times(1)).listBooksInHandsOf(libraryUser);
    }

    @Test
    void testListOneBorrowedBook() {

        LibraryUser libraryUser = new LibraryUser("Maciej", "Sosna", "456796");
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> UserBooks = new ArrayList<>();
        Book borrowedBook = new Book("Sample Title", "Sample Author", 2022);
        UserBooks.add(borrowedBook);


        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser)).thenReturn(UserBooks);
        List<Book> borrowedBooksList = bookLibrary.listBooksInHandsOf(libraryUser);

        // then
        assertEquals(1, borrowedBooksList.size());
        assertEquals(borrowedBook, borrowedBooksList.get(0));
        verify(libraryDatabaseMock, times(1)).listBooksInHandsOf(libraryUser);
    }


    @Test
    void testListFiveBorrowedBook() {

        LibraryUser libraryUser = new LibraryUser("Maciej", "Sosna", "456796");
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> UserBooks = new ArrayList<>();
        Book borrowedBook = new Book("Sample Title", "Sample Author", 2022);
        Book borrowedBook1 = new Book("Sample Title", "Sample Author", 2022);
        Book borrowedBook2 = new Book("Sample Title", "Sample Author", 2022);
        Book borrowedBook3 = new Book("Sample Title", "Sample Author", 2022);
        Book borrowedBook4 = new Book("Sample Title", "Sample Author", 2022);
        UserBooks.add(borrowedBook);
        UserBooks.add(borrowedBook1);
        UserBooks.add(borrowedBook2);
        UserBooks.add(borrowedBook3);
        UserBooks.add(borrowedBook4);


        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser)).thenReturn(UserBooks);
        List<Book> borrowedFiveBooksList = bookLibrary.listBooksInHandsOf(libraryUser);

        // then
        assertEquals(5, borrowedFiveBooksList.size());
        assertEquals(borrowedBook, borrowedFiveBooksList.get(0));

    }

}















