package com.epam.learn.operators;

public class ModuloDemo {
    public static void main(String[] args) {
        int number1 = 6;
        int number2 = 3;
        int number3 = 7;

        System.out.println(number1 + " % " + number2 + " = " + (number1 % number2));
        System.out.println(number3 + " % " + number2 + " = " + (number3 % number2));
        System.out.println(number3 + " % " + number1 + " = " + (number3 % number1));
    }
}
