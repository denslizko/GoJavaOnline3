package com.goit.gojavaonline.Module5;

public class MaxAndMinSearcher {
    public static void main(String[] args) {
        int[] massive = {7, 3, 6, 9, 11, 23, 43, 7, 55, 99, 1, 65};
        int min = massive[0];
        int max = massive[0];

        for (int i = 0; i < massive.length - 1; i++) {
            if (massive[i] > max) {
                max = massive[i];
            }
        }
        for (int i = 0; i < massive.length - 1; i++) {
            if (massive[i] < min) {
                min = massive[i];
            }
        }
        System.out.println("Max element in massive is: " + max);
        System.out.println("Min element in massive is: " + min);
    }
}
