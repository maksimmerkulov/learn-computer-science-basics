package com.epam.learn.functions;

public class FunctionsDemo {
    static void printArrayToConsole(int[] arrayToPrint) {
        for (int i = 0; i < arrayToPrint.length; i++) {
            System.out.println(arrayToPrint[i]);
        }
    }

    static double sumDouble(double a, double b) {
        double sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        int[] array = {2, 9, 9, 7};
        printArrayToConsole(array);
        double sum = 0.0;
        sum = sumDouble(1.0, 2.0);
        System.out.println(sum);
    }
}
