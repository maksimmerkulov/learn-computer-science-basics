package com.epam.learn.control;

public class WhileDemo {
    public static void main(String[] args) {
        int limit = 10;
        int currentNumber = 0;

        while (currentNumber < limit) {
            System.out.println(currentNumber);
            currentNumber++;
        }
    }
}
