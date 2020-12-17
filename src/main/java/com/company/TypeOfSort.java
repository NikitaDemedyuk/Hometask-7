package com.company;

import java.util.*;
import static java.sql.Types.NULL;

public class TypeOfSort extends Thread{
    private int typeSort;

    TypeOfSort(int variant) {
        typeSort = variant;
    }

    public List <Integer> MySort(List <Integer> randomArray) {
        switch (typeSort) {
            case 1 -> {
                randomArray.sort((o1, o2) -> o2 - o1);
            }

            case 2 -> {
                randomArray.sort(Comparator.comparingInt(o -> o));
            }

            case 3 -> {
                randomArray.sort(((o1, o2) -> o2.toString().length() - o1.toString().length()));
            }
            case 4 -> {
                randomArray.sort((Comparator.comparingInt(o -> o.toString().length())));
            }
        }
        return randomArray;
    }
}



