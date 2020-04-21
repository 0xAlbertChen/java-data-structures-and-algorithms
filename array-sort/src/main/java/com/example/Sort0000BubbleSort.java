package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import static com.example.Swap.swap;

public class Sort0000BubbleSort {

    public static void sort(int[] collections) {
        int length = collections.length;

        for (int i = 0; i < length; i++) {

            for (int j = 0; j < length-1; j++) {
                if (collections[j] > collections[j + 1]) {
                    swap(collections, j, j + 1);
                    TestHelper.print(collections);
                }
            }
        }


    }


    public static void main(String[] args) {

        int[] ints = TestHelper.generate(10);
        System.out.println(Arrays.toString(ints));
        sort(ints);
        System.out.println("------");
        System.out.println(Arrays.toString(ints));


    }

}
