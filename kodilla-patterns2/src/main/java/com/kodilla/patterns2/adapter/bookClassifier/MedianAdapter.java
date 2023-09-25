package com.kodilla.patterns2.adapter.bookClassifier;

import com.kodilla.patterns2.adapter.bookClassifier.librarya.BookA;
import com.kodilla.patterns2.adapter.bookClassifier.librarya.Classifier;
import com.kodilla.patterns2.adapter.bookClassifier.libraryb.BookB;
import com.kodilla.patterns2.adapter.bookClassifier.libraryb.BookSignature;
import com.kodilla.patterns2.adapter.bookClassifier.libraryb.BookStatistics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifier {

    private final BookStatistics bookStatistics;

    public MedianAdapter(BookStatistics bookStatistics) {
        this.bookStatistics = bookStatistics;
    }

    @Override
    public int publicationYearMedian(Set<BookA> bookSet) {
        List<BookA> booksList = new ArrayList<>(bookSet);


        Map<BookSignature, BookB> bookMap = new HashMap<>();
        for (BookA book : booksList) {
            bookMap.put(new BookSignature(book.getSignature()), new BookB(book.getAuthor(), book.getTitle(), book.getPublicationYear()));
        }


        return bookStatistics.medianPublicationYear(bookMap);
    }
}

















