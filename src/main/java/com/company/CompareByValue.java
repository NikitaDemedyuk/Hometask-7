package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class CompareByValue implements Comparator<Integer> {

    @Override
    public int compare(Integer value1, Integer value2) {
        return value1.compareTo(value1);

        // result > 0 - value1 > value2
        // result < 0 - value1 < value 2
    }
}




