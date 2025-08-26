package com.epam.learn.control;

public class ReturnDemo {
    public static void main(String[] args) {
        int[] array = {2, 9, 9, 7};

        for (int i = 0; i <= 3; i++) {
            System.out.println("Cycle #" + i + " start");
            System.out.println(array[i]);
            if (array[i] == 9) {
                System.out.println("Found 9!");
                return; // exit the main method completely
            }
            System.out.println("Cycle #" + i + " finish");
        }

        System.out.println("After cycle");
    }
}
