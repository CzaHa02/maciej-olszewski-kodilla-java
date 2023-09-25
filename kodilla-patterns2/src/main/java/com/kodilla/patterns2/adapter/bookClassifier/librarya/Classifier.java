package com.kodilla.patterns2.adapter.bookClassifier.librarya;

import java.util.Set;

public interface Classifier {
    int publicationYearMedian(Set<BookA> bookSet);
}