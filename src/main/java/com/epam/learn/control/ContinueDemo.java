package com.epam.learn.control;

public class ContinueDemo {
    public static void main(String[] args) {
        int[] array = {2, 9, 9, 7};

        for (int i = 0; i <= 3; i++) {
            System.out.println("Cycle #" + i + " start");
            System.out.println(array[i]);
            if (array[i] == 9) {
                System.out.println("Found 9!");
                continue; // skip the rest of the iteration
            }
            System.out.println("Cycle #" + i + " finish");
        }
    }
}
