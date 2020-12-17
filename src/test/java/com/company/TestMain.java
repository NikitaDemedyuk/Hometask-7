package com.company;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestMain {
    @Test
    public void testMySort1() throws InterruptedException {
        List <Integer> arrayIntegerTest = new ArrayList<>();
        arrayIntegerTest.add(10);
        arrayIntegerTest.add(-12);
        arrayIntegerTest.add(9);
        arrayIntegerTest.add(32);
        arrayIntegerTest.add(81);
        arrayIntegerTest.add(21);
        arrayIntegerTest.add(0);
        arrayIntegerTest.add(-2);
        arrayIntegerTest.add(-8);
        arrayIntegerTest.add(-14);

        List <Integer> arrayInteger = new ArrayList<>(12);

        arrayInteger.add(-14);
        arrayInteger.add(-12);
        arrayInteger.add(-8);
        arrayInteger.add(-2);
        arrayInteger.add(0);
        arrayInteger.add(9);
        arrayInteger.add(10);
        arrayInteger.add(21);
        arrayInteger.add(32);
        arrayInteger.add(81);

        TypeOfSort sortArray = new TypeOfSort(2);
        sortArray.start();
        sortArray.MySort(arrayIntegerTest);
        sortArray.join();

        for (int i = 0; i < 10; ++i) {
            if (arrayInteger.get(i) == arrayIntegerTest.get(i)) {
                System.out.println("Good");
            }
        }
    }
}
