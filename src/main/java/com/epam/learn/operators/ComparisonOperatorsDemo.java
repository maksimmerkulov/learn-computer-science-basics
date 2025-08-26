package com.epam.learn.operators;

public class ComparisonOperatorsDemo {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        boolean aLessThanB = a < b;
        boolean aGreaterThanB = a > b;
        boolean aLessOrEqualB = a <= b;
        boolean aGreaterOrEqualB = a >= b;

        System.out.println("a < b: " + aLessThanB);
        System.out.println("a > b: " + aGreaterThanB);
        System.out.println("a <= b: " + aLessOrEqualB);
        System.out.println("a >= b: " + aGreaterOrEqualB);
    }
}
