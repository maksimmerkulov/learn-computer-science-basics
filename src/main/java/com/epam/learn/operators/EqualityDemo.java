package com.epam.learn.operators;

public class EqualityDemo {
    public static void main(String[] args) {
        int number = 3;
        int divide = 3;

        boolean isEqual = number == divide;    // equality
        boolean isNotEqual = number != divide; // inequality

        System.out.println(number + " == " + divide + " : " + isEqual);
        System.out.println(number + " != " + divide + " : " + isNotEqual);
    }
}
