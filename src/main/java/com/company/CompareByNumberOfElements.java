package com.company;

import java.util.*;

public class CompareByNumberOfElements implements Comparator<Integer> {

    @Override
    public int compare(Integer value1, Integer value2) {
        int length1 = 0;
        while(value1 != 0) {
            ++length1;
            value1 /= 10;
        }
        int length2 = 0;
        while (value2 != 0) {
            ++length2;
            value2 /= 10;
        }
        return (length1 - length2);
    }
}

