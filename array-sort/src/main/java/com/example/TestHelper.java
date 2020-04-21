package com.example;

import java.util.Arrays;
import java.util.Random;

public class TestHelper {

    public static int[] generate(int length) {
        int[] returnInt = new int[length];
        for (int i = 0; i < length; i++) {
            returnInt[i] = new Random().nextInt(length * 10);
        }
        return returnInt;
    }

    public static void print(int[] ints) {
        System.out.println("Arrays.toString(ints) ----");
        System.out.println(Arrays.toString(ints));
    }
}
