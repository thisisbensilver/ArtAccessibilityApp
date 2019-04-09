package com.example.artaccessibilityapp;

import java.util.Comparator;

public class SortByPaintingName implements Comparator<Painting> {

    int comparisonVal;

        @Override
        public int compare(Painting a, Painting b) {
            comparisonVal = a.getPaintingName().compareTo(b.getPaintingName());
            return comparisonVal;
        }
    }
