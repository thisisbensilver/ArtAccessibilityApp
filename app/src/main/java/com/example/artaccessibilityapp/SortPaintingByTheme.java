package com.example.artaccessibilityapp;

import java.util.Comparator;

public class SortPaintingByTheme implements Comparator<Painting> {

    //int comparisonVal;

    public int compare(Painting painting1, Painting painting2) {

        String paintingTheme1 = painting1.getPaintingTheme().toUpperCase();
        String paintingTheme2 = painting2.getPaintingTheme().toUpperCase();

        //ascending order
        return paintingTheme1.compareTo(paintingTheme2);
    }
    /*@Override
    public int compare(Painting a, Painting b) {
        comparisonVal = a.getPaintingTheme().compareTo(b.getPaintingTheme());
        return comparisonVal;
    }*/
}
