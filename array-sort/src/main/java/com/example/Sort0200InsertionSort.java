package com.example;

import static com.example.Swap.swap;
import static com.example.TestHelper.generate;
import static com.example.TestHelper.print;

public class Sort0200InsertionSort {

    public static void sort(int[] arrays) {
        int length = arrays.length;
        for (int i = 0; i < length; i++) {
            int current = arrays[i];
            for (int j = i - 1; j >= 0; j--) {
                int compareNumber = arrays[j];
                if (compareNumber >= current) {
                    swap(arrays, j + 1, j);
                    TestHelper.print(arrays);
                } else {
                    break;
                }
            }
        }


    }


    public static void main(String[] args) {

        int[] ints = generate(10);
        print(ints);
        sort(ints);
        print(ints);

    }

}
