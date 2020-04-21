package com.example;

import java.util.Arrays;
import java.util.Random;

import static com.example.Swap.swap;
import static com.example.TestHelper.generate;
import static com.example.TestHelper.print;

public class Sort0100SelectionSort {

    public static void sort(int[] arrays) {
        int length = arrays.length;
        for (int i = 0; i < length; i++) {
            int minIndex = i;
            for (int j = i; j < length; j++) {
                if (arrays[j] < arrays[minIndex]) {
                    minIndex = j;
                }
            }
            swap(arrays, i, minIndex);
            TestHelper.print(arrays);
        }


    }


    public static void main(String[] args) {

        int[] ints = generate(10);
        print(ints);
        sort(ints);
        print(ints);

    }

}
