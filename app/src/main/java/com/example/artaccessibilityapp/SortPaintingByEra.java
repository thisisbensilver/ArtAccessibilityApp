package com.example.artaccessibilityapp;

import java.util.Comparator;

public class SortPaintingByEra implements Comparator<Painting> {

    int comparisonVal;

    @Override
    public int compare(Painting a, Painting b) {
        comparisonVal = a.getPaintingEra().compareTo(b.getPaintingEra());
        return comparisonVal;
    }
}
