package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//import javafx.application.Application;

public class Main extends Thread {
    public static void main(String[] args) {
        System.out.println("Start");
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter the length of array: ");
            int lengthArray = in.nextInt();
            List<Integer> array = createRandomArray(lengthArray);
            System.out.println("Do you want to see your array?\n1 - See\n2 - Skip");
            System.out.print("Enter: ");
            int variantSee = in.nextInt();
            switch (variantSee) {
                case 1:
                    printArray(array);
                    System.out.println("\n");
            }

            System.out.println(array.size());

            System.out.println("Sort array:\n1 - Sort in descending order (by value)\n2 - Sort in ascending order(by value)\n3 - Sort in descending order (by number of elements)\n4 - Sort in ascending order(by number of elements)");
            System.out.print("Enter: ");
            int typeSort = in.nextInt();

            TypeOfSort sortArray = new TypeOfSort(typeSort);
            sortArray.start();
            sortArray.MySort(array);

            printArray(array);

        }
    }

    public static List<Integer> createRandomArray(int lengthArray) {
        List<Integer> array = new ArrayList<>();
        for (int i = 0; i < lengthArray; i++) {
            array.add((int) (Math.random() * 30) - 15);
        }
        return array;
    }

    public static void printArray(List<Integer> array) {
        System.out.println("Your array:");
        for (int i = 0; i < array.size(); ++i) {
            System.out.print(array.get(i) + " ");
        }
    }
}
            /*public class Main extends Thread {
                private int sizeArray;
                private int typeOfSort;

                Main() {
                    sizeArray = 0;
                    typeOfSort = 1;
                }

                Main(int sizeArrayNow, int typeOfSortNow) {
                    sizeArray = sizeArrayNow;
                    typeOfSort = typeOfSortNow;
                }

                @Override
                public void run() {
                    System.out.println("thread main is running");
                    List<Integer> randomArray = new ArrayList<>();
                    for (int i = 0; i < sizeArray; i++) {
                        randomArray.add((int) (Math.random() * 30) - 15);
                    }
                    for (int i = 0; i < randomArray.size(); ++i) {
                        System.out.print(randomArray.get(i) + " ");
                    }

                    TypeOfSort sort = new TypeOfSort(typeOfSort);
                    sort.run(randomArray);
                    System.out.println();
                    for (int i : randomArray) {
                        System.out.print(i + " ");
                    }
                }
            }
          */



