package com.epam.learn.operators;

public class LogicalOperatorsDemo {
    public static void main(String[] args) {
        boolean hasSalary = true;
        boolean hasBonus = false;
        boolean hasSomethingToPay;

        hasSomethingToPay = hasSalary && hasBonus; // logical AND
        // hasSomethingToPay = hasSalary || hasBonus; // logical OR

        System.out.println(hasSomethingToPay);
    }
}
