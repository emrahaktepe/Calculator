package com.aktepe;

public class Calculator {
    // Square function
    public static int Square(int num) {
        return num * num;
    }

    // Add two integers and returns the sum
    public static int Add(int num1, int num2) {
        return num1 + num2;
    }

    // Add two integers and returns the sum
    public static double Add(double num1, double num2) {
        return num1 + num2;
    }

    // Multiply two integers and returns the result
    public static int Multiply(int num1, int num2) {
        return num1 * num2;
    }

    public static int Divide(int num1, int num2) {
        if (num2 == 0)
            throw new IllegalArgumentException("Cannot divide by zero (0).");

        return num1 / num2;
    }

    // Subtracts small number from big number
    public static int Subtract(int num1, int num2) {
        if (num1 > num2) {
            return num1 - num2;
        }
        return num2 - num1;
    }
}