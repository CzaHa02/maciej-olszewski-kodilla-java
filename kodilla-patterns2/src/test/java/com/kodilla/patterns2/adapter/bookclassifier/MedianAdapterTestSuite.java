package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookClassifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookClassifier.librarya.BookA;
import com.kodilla.patterns2.adapter.bookClassifier.libraryb.BookStatistics;
import com.kodilla.patterns2.adapter.bookClassifier.libraryb.Statistics;
import org.junit.jupiter.api.Test;

import java.util.HashSet;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class MedianAdapterTestSuite {

    @Test
    void publicationYearMedianTest() {

        BookA book1 = new BookA("Author1", "Title1", 2000, "Signature1");
        BookA book2 = new BookA("Author2", "Title2", 2010, "Signature2");
        BookA book3 = new BookA("Author3", "Title3", 2030, "Signature3");
        BookA book4 = new BookA("Author3", "Title3", 2020, "Signature4");

        Set<BookA> bookSet = new HashSet<>();
        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);
        bookSet.add(book4);

        BookStatistics bookStatistics = new Statistics() ;
        MedianAdapter medianAdapter = new MedianAdapter(bookStatistics);


        int median = medianAdapter.publicationYearMedian(bookSet);


        assertEquals(2020, median);
    }
}