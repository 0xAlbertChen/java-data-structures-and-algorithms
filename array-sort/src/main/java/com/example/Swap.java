package com.example;

import java.util.Arrays;

public class Swap {

    public static void main(String[] args) {

        // 临时变量法
        int[] array = new int[]{10, 20};
        System.out.println(Arrays.toString(array));

        long start = System.nanoTime();
        for (int i = 0; i < 10000000; i++) {
            swapByTemp(array, 0, 1);
        }
        System.out.println(System.nanoTime() - start + ":" + Arrays.toString(array));
        start = System.nanoTime();
        for (int i = 0; i < 10000000; i++) {
            swapByArithmetic(array, 0, 1);
        }
        System.out.println(System.nanoTime() - start + ":" + Arrays.toString(array));
        start = System.nanoTime();
        for (int i = 0; i < 10000000; i++) {
            swapByBitOperation(array, 0, 1);
        }
        System.out.println(System.nanoTime() - start + ":" + Arrays.toString(array));


    }

    public static void swap(int[] array, int i, int j) {
        swapByTemp(array, i, j);
    }

    public static void swapByTemp(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }


    public static void swapByArithmetic(int[] array, int i, int j) {
        array[i] = array[i] + array[j];
        array[j] = array[i] - array[j];
        array[i] = array[i] - array[j];
    }


    public static void swapByBitOperation(int[] array, int i, int j) {
        array[i] = array[i] ^ array[j];
        array[j] = array[i] ^ array[j];
        array[i] = array[i] ^ array[j];
    }


}
