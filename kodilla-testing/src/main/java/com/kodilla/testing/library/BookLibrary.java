package com.kodilla.testing.library;

import java.util.ArrayList;
import java.util.List;

public class BookLibrary {
    private LibraryDatabase libraryDatabase;
    private LibraryUser libraryUser;

    public BookLibrary(LibraryDatabase libraryDatabase) {
        this.libraryDatabase = libraryDatabase;
    }

    public List<Book> listBooksWithCondition(String titleFragment) {
        List<Book> bookList = new ArrayList<>();
        if (titleFragment.length() < 3) return bookList;
        List<Book> resultList = libraryDatabase
                .listBooksWithCondition(titleFragment);
        if (resultList.size() > 20) return bookList;
        bookList = resultList;
        return bookList;
    }

    public List<Book> listBooksInHandsOf(LibraryUser libraryUser) {
        List<Book> booksList = libraryDatabase.listBooksInHandsOf(libraryUser);
        if (booksList.size() == 1) {
            System.out.println("Użytkownik wypożyczył jedną książkę.");
        } else if (booksList.size() == 5) {
            System.out.println("Użytkownik wypożyczył pięć książek.");
        } else {
            System.out.println("Użytkownik nie ma wypożyczonych książek.");
        }
        return booksList;
    }

}





