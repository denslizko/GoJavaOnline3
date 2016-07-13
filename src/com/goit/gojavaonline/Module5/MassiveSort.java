package com.goit.gojavaonline.Module5;

public class MassiveSort {
    public static void main(String[] args) {
        int[] massive = {2, 3, 6, 9, 11, 23, 43, 7, 0, 55, 99, 65, 1};
        int counter = 1;
        int systemTray;
        int length = massive.length;
        for (int i = 0; i < massive.length; i++) {
            System.out.print(massive[i] + " ");
        }
        System.out.println("");

        while (counter != 0) {
            counter = 0;
            for (int i = 0; i < massive.length-1; i++) {
                if (massive[i] > massive[i + 1]) {
                    systemTray = massive[i];
                    massive[i] = massive[i + 1];
                    massive[i + 1] = systemTray;
                    counter++;
                }
            }
        }
        for (int i = 0; i < massive.length-1; i++) {
            System.out.print(massive[i] + " ");
        }
        System.out.println(massive[length-1]);
    }
}
