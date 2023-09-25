package com.kodilla.patterns2.adapter.bookClassifier;

import com.kodilla.patterns2.adapter.bookClassifier.libraryb.BookB;
import com.kodilla.patterns2.adapter.bookClassifier.libraryb.BookSignature;
import com.kodilla.patterns2.adapter.bookClassifier.libraryb.BookStatistics;
import com.kodilla.patterns2.adapter.bookClassifier.libraryb.Statistics;

import java.util.Map;

public class MedianAdaptee implements BookStatistics {
    @Override
    public int averagePublicationYear(Map<BookSignature, BookB> books) {
        Statistics statistics = new Statistics();
        return statistics.averagePublicationYear(books);

    }

    @Override
    public int medianPublicationYear(Map<BookSignature, BookB> books) {
        Statistics statistics = new Statistics();
        return statistics.medianPublicationYear(books);
    }
}
