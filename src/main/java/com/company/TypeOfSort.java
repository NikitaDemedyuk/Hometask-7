package com.company;

import java.util.*;
import static java.sql.Types.NULL;



public class TypeOfSort extends Thread{
    private int typeSort;

    TypeOfSort(int variant) {
        typeSort = variant;
    }

    public List <Integer> MySort(List <Integer> randomArray) {
        Scanner in = new Scanner(System.in);

        switch (typeSort) {
            case 1 -> {
                Comparator comparator1 = new CompareByValue();
                Collections.sort(randomArray, comparator1);
            }

            case 2 -> {
                Comparator comparator2 = new CompareByValue();
                List<Integer> randomArrayInverse1 = new ArrayList<>();
                Collections.sort(randomArrayInverse1, comparator2);
                for (int i = 0; i < randomArray.size(); ++i) {
                    randomArray.set(i, randomArrayInverse1.get(randomArray.size() - i - 1));
                }
            }

            case 3 -> {
                Comparator comparator3 = new CompareByNumberOfElements();
                Collections.sort(randomArray, comparator3);
            }

            case 4 -> {
                Comparator comparator4 = new CompareByNumberOfElements();
                List<Integer> randomArrayInverse2 = new ArrayList<>();
                Collections.sort(randomArrayInverse2, comparator4);
                for (int i = 0; i < randomArray.size(); i++) {
                    randomArray.set(i, randomArrayInverse2.get(randomArray.size() - i - 1));
                }
            }
        }
        return randomArray;
    }
}



